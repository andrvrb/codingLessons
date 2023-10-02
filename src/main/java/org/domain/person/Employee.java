package org.domain.person;

/**
 * Сотрудник
 * */
public class Employee {
    private String phone, firstName, lastName;
    private double salary;

    public Employee(String phone, String firstName, String lastName) {
        this.phone = phone;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString()
    {
        return "[firstName=" + firstName + " lastName=" + lastName + ", salary=" + salary + "]";
    }
}
