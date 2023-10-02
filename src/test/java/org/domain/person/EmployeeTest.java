package org.domain.person;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void firstTest() {
        var staff = new HashMap<String, Employee>();
        staff.put("89273453454", new Employee("89273453454","Иван", "Первый"));
        staff.put("89273453455", new Employee("89273453455","Петр", "Второй"));
        staff.put("89273453456", new Employee("89273453456","Алексей", "Третий"));
        staff.put("89273453457", new Employee("89273453457","Харитон", "Четвертый"));

        // print all entries

        System.out.println(staff);

        // remove an entry

        staff.remove("89273453454");

        // replace an entry

        staff.put("89273453458", new Employee("89273453458","Базилевс", "Пятый"));

        // look up a value

        System.out.println(staff.get("89273453456"));

        // iterate through all entries

        staff.forEach((k, v) ->
                System.out.println("key=" + k + ", value=" + v));
    }

}