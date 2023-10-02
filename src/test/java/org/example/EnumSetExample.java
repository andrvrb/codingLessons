package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.EnumSet;
import java.util.Set;

class EnumSetExample {

    // EnumSet - современная замена битовых полей
    enum Style { BOLD, ITALIC, UNDERLINE, STRIKETHROUGH }

    @Test
    void styleTest() {
        Set<Style> styles = EnumSet.of(Style.BOLD, Style.ITALIC);

/*        for (Style t : styles) {
            System.out.println(t);
        }*/

        styles.forEach(System.out::println);
        Style style = Style.BOLD;

        Assertions.assertTrue(styles.contains(style));
    }
}