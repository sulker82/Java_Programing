package day25_constructors;

import java.time.LocalDate;

public class Person {

    public String name;
    public int age;
    public char gender;
    public String isMarried ;
    public String isEmployed;
    public LocalDate dateOfBirth;

    public Person(String name, int age, char gender, String isMarried, String isEmployed, LocalDate dateOfBirth) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
        this.dateOfBirth = dateOfBirth;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", isMarried=" + isMarried +
                ", isEmployed=" + isEmployed +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
    /*
name, age, gender, dateOfBirth, isMarried, isEmployed
Add a constructor that can set all the fields once an object is created
toString(), eat(String food), sleeping(), drink(String drink)
 */

