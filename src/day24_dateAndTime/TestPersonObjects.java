package day24_dateAndTime;

import day17_customClass.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person[] people = { new Person(), new Person(), new Person(), new Person(), new Person() };
        people[0].setInfo("Daniel", 'M', LocalDate.of(1989, 2, 2));
        people[1].setInfo("Celia", 'F', LocalDate.of(1999, 5, 25));
        people[2].setInfo("Danielle", 'F', LocalDate.of(1995, 8, 15));
        people[3].setInfo("David", 'M', LocalDate.of(1987, 12, 29));
        people[4].setInfo("Ali", 'M', LocalDate.of(1985, 3, 5));



        ArrayList<Person> studentsList = new ArrayList<>();
        studentsList.addAll( Arrays.asList(people) );




        // print name & date of birth of each person object


        // remove all the person object that has the age > 55


    }

}
