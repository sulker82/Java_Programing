package day32_finalKeyword;

public class day32_ClassNotes {

    /*
    Java Programming Day32

Topics: Overriding vs Overloading
		Final Keyword

package name: day32_finalKeyword

Warmup tasks:
	1. Create a class named Car
            Variables:
                make, model, color, year, price, numberOfWheels (static), hasBattery (static)

            Encapsulate all the fields
                    Condition:
                        1. year can not be negative or zero
                        2. price can not be negative or zero

            Add a constructor that can set all the fields
                    note: make of the car can be set to the class name

            Methods:
                start(): "Press the brake and twist the key to ignition"

                toString()


	2. Create the following sub classes and override the start() method if needed:

            1. Toyota
                	start(): "Press the brake and twist the key to ignition"

            2. Honda
                    start(): "Press the brake and twist the key to ignition"

            3. Audi
                	start(): "Press the start button"

            4. BMW
                	start(): "Call the mechanic or jump start "

            5. Tesla
               		start(): "Say \"Start\""

	                Extra method:
	                	  autoPilot()


	                Extra Conditions for the variables:
	                    1. Model of tesla can only be set to one of the followings:
	                        {"Model S", "Model Y", "Model x", "Model 3" };
	                    2. color of tesla can only be set to one of the followings:
	                        {"White", "Red", "Black", "Silver", "Blue", "Brown", "Green"}
	                    3. year of the tesla can not be less than 2008
	                    4. price of tesla can not be less than 50k






IF the instance variable is final, we can only getter, we can not generate setter for it


     */
}
