package day25_constructors;

import java.time.LocalDate;

public class TestPerson {

    public static void main(String[] args) {


        Person p1 = new Person("Ali", 33, 'M', "yes", "yes", LocalDate.of(2000, 3, 25));

        System.out.println(p1);
    }
}
