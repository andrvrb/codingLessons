package org.example;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

public class ParamTest {

    enum Direction {
        EAST, WEST, NORTH, SOUTH
    }

// Аннотация @NullSource предоставляет единственный null аргумент методу, аннотированному @ParameterizedTest
//    @DisplayName("")
    @ParameterizedTest
    @NullSource
    void testMethodNullSource(Integer argument) {
        assertTrue(argument == null);
    }

    @ParameterizedTest
    @EnumSource(Direction.class)
    void testWithEnumSource(Direction d) {
        assertNotNull(d);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "alex, 30",
            "brian, 35",
            "charles, 40"
    }, ignoreLeadingAndTrailingWhitespace = true)
    void testWithCsvSource(String name, int age) {
        assertNotNull(name);
        assertTrue(age > 0);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/employeeData.csv", numLinesToSkip = 0)
    void testWithCsvFileSource(String name, int age) {
        assertNotNull(name);
        assertTrue(age > 0);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    void toUpperCase_ShouldGenerateTheExpectedUppercaseValueCSVFile(
            String input, String expected) {
        String actualValue = input.toUpperCase();
        assertEquals(expected, actualValue);
    }

    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 3 })
    void testMethodWithAutoboxing(Integer argument) {
     System.out.println(argument);
    }

    @ParameterizedTest
    @EmptySource
    void testMethodEmptySource(String argument) {
        assertTrue(StringUtils.isEmpty(argument));
    }
}
