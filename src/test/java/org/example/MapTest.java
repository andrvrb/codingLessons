package org.example;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Три варианта перебора Map
 * */
public class MapTest {

    Map<String, String> map = new HashMap<>() {{
        put("1", "Понедельник");
        put("2", "Вторник");
        put("3", "Среда");
    }};

    // Map.Entry - описываем пару (ключ - значение) "3=Среда" и т.п.
    // entrySet - возращает множество со значениями карты, т.е. [3=Среда, 2=Вторник, 1=Понедельник]
    @Test
    void method1Test() {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("ID =  " + entry.getKey() + " День недели = " + entry.getValue());
        }
        System.out.println();
    }

    // Iterator - интерфейс, для организации цикла для перебора коллекций
    // hasNext - true, если есть еще элементы
    // next - возвращает слудующий элемент
    @Test
    void method2Test() {
        Iterator<Map.Entry<String, String>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, String> entry = entries.next();
            System.out.println("ID = " + entry.getKey() + " День недели = " + entry.getValue());
        }
        System.out.println();
    }

    // keySet - возвращает множество ключей
    @Test
    void method3Test() {
        for (String key : map.keySet()) {
            System.out.println("ID = " + key + ", День недели = " +  map.get(key));
        }
        System.out.println();
    }

}
