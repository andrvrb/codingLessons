package org.domain.employee;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class WorkerTest {
    static List<Worker> workers = new ArrayList<>();

    @BeforeAll
    public static void init(){
        workers.add(new Worker("Петр", 24, 35000, "инженер"));
        workers.add(new Worker("Иван", 32, 45000, "повар"));
        workers.add(new Worker("Василий", 44, 65000, "инженер"));
    }

    @DisplayName("Группировка списка рабочих по их должности (деление на списки)")
    @Test
    void test1_Test() {
        Map<String, List<Worker>> map1 = workers.stream()
                .collect(Collectors.groupingBy(Worker::getPosition));
        Assertions.assertEquals(2, map1.get("инженер").size());
    }

    @DisplayName("Группировка списка рабочих по их должности (деление на множества)")
    @Test
    void test2_Test() {
        Map<String, Set<Worker>> map2 = workers.stream()
                .collect(Collectors.groupingBy(Worker::getPosition, Collectors.toSet()));
        Assertions.assertEquals(2, map2.get("инженер").size());
    }

    @DisplayName("Подсчет количества рабочих, занимаемых конкретную должность")
    @Test
    void test3_Test() {
        Map<String, Long> map3 = workers.stream()
                .collect(Collectors.groupingBy(Worker::getPosition, Collectors.counting()));
        Assertions.assertEquals(2, map3.get("инженер"));
    }

    @DisplayName("Группировка списка рабочих по их должности, при этом нас интересуют только имена")
    @Test
    void test4_Test() {
        Map<String, Set<String>> map4 = workers.stream()
                .collect(Collectors.groupingBy(Worker::getPosition,
                        Collectors.mapping(Worker::getName, Collectors.toSet())));
        Assertions.assertEquals(2, map4.get("инженер").size());
    }


    @DisplayName("Группировка списка рабочих по их должности, при этом нас интересуют только имена")
    @Test
    void test5_Test() {
        Map<String, Double> map5 = workers.stream()
                .collect(Collectors.groupingBy(Worker::getPosition,
                        Collectors.averagingInt(Worker::getSalary)));
        Assertions.assertEquals(50000, map5.get("инженер"));
    }

    @DisplayName("Группировка списка рабочих по их должности, рабочие представлены только именами единой строкой")
    @Test
    void test6_Test() {
        Map<String, String> map6 = workers.stream()
                .collect(Collectors.groupingBy(Worker::getPosition,
                        Collectors.mapping(Worker::getName,
                                Collectors.joining(", ", "{","}")))
                );
        Assertions.assertEquals("{Петр, Василий}", map6.get("инженер"));
    }

    @DisplayName("Группировка списка рабочих по их должности и по возрасту")
    @Test
    void test7_Test() {
        Map<String, Map<Integer, List<Worker>>> map7 = workers.stream()
                .collect(Collectors.groupingBy(Worker::getPosition,
                        Collectors.groupingBy(Worker::getAge)));
        Assertions.assertEquals(2, map7.get("инженер").size());
    }
}