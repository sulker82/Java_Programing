package day33_abstraction;

import day30_inheritance.TypesOfInheritance.Teacher;

import java.sql.Driver;

public class day33_ClassNotes {

   /* Java Programming Day33

    Topics: OOP Abstraction
			- Abstract Method
			- Abstract Class

    Package name: day33_abstraction

    Warmup tasks:
            1. Create a sub class of Person (from day32 package) named CydeoDevStudent (final)
    Extra Variables:
    id (final), batchName, batchNumber, programmingLanguage(static & final)

    Extra conditions:
            1. Age has to be at least 18 years old
					2. batchName can ONLY be set to "Zero to Hero" or "Alumni Dev"
            3. batchNumber can not be set to zero or negative

    Override the eat() & drink() methods and include the programmingLanguage variable in methods body

    Override the toString Method and include the id, batchName, batchNumber variables



    OOP Abstractrion:
            1. abstrct method
		2. abstract class
		3. interface
		4. extends vs implements


    Parent class' abstract methods must be overriden in child (non-abstract) class



    methods:

    public static void methodName(Paremeters) { }




    employeeTask

    Employee:
    Variables:
    name, age, gender, id, jobTitle, salary ....

    Methods:
    abstract work();

    Teacher:
    work(){ teaching }


    Developer:
    work() { coding }

    Tester:
    work(){ testing }

    Driver:
    work() { driving }

	...

    */

}
