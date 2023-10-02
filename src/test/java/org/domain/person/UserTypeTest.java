package org.domain.person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EnumSet;

import static org.domain.person.UserType.*;

class UserTypeTest {

    @Test
    void enumSet_allOf_Test() {
        //создание EnumSet , содержащий все элементы перечисления
        EnumSet<UserType> allUsersType = EnumSet.allOf(UserType.class);
        System.out.println("allUsersType: " + allUsersType);
        Assertions.assertEquals(5, allUsersType.size());
    }

    @DisplayName("Пустой EnumSet")
    @Test
    void enumSet_noneOf_Test() {
        EnumSet<UserType> emptyUsersType = EnumSet.noneOf(UserType.class);
        System.out.println("emptyUsersType: " + emptyUsersType);
        Assertions.assertEquals(0, emptyUsersType.size());
    }

    @DisplayName("Добавление элемента в EnumSet")
    @Test
    void enumSet_addIn_Test() {
        EnumSet<UserType> addUsersType = EnumSet.noneOf(UserType.class);
        addUsersType.add(BUYER);
        System.out.println("addUsersType: " + addUsersType);
        Assertions.assertEquals(1, addUsersType.size());
    }

    @Test
    void enumSet_of_Test() {
        EnumSet<UserType> twoUsersType = EnumSet.of(BUYER, ADMIN);
        System.out.println("twoUsersType: " + twoUsersType);
        Assertions.assertEquals(2, twoUsersType.size());
    }

    @Test
    void enumSet_complementOf_Test() {
        //способ создать подмножество перечисления — использовать метод range()
        EnumSet<UserType> adminsGroup = EnumSet.range(ADMIN, MODERATOR);
        System.out.println("adminsGroup: " + adminsGroup);
        Assertions.assertEquals(3, adminsGroup.size());

        //all elements missing in adminsGroup
        EnumSet<UserType> userGroup = EnumSet.complementOf(adminsGroup);
        System.out.println("userGroup: " + userGroup);

        Assertions.assertEquals(2, userGroup.size());
    }
}