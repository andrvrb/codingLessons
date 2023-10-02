package org.example;

import org.domain.person.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SampleTst {


    void testT() {
        Map<String, TreeMap> personMap = new HashMap<>();

        for (Map.Entry<String, TreeMap> entry : personMap.entrySet()) {
            TreeMap<String, Person> controlTreeMap = entry.getValue();

            for (Map.Entry<String, Person> entryControl : controlTreeMap.entrySet()) {

            }

        }
    }

}
