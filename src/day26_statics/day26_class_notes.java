package day26_statics;

public class day26_class_notes {

    /*
    Java Programming Day26

Topics: Constructor Chaining
		Statics

package name: day26_statics

Warmup tasks:
	1. Create a custom class named Student
            Attributes:
                name, age, gender, id

            Add a constructor that can set all the fields

            Methods:
                study()
                toString()

	2. Create a custom class named StudentsGroup
	            Attributes:
	                groupName, groupId, students (ArrayList<Students>)

	            Add a constructor that can set the groupId and groupName
	                    initialize students arraylist in the constrcutor's body

	            Methods:
	                addStudent(Student): adds the specified student to the students arrayList

	                removeStudent(id): removes the student with the specified id from the students arraylist

	                toString(): displays the groupName, groupId and total number of students when a group object is passed in the print statement

	3. Create a class named TestObjects
	            3.1 Create 5 Student objects
	            3.2 Create a StudentGroup object
	            3.3 Add all the student objets to the StudentsGroup object' students list



this: refers to the instances

	this. : to call instance variables & instance methods
	this(): used for calling constructors in another constructor


Constructor Calls:
		1. Constructors can not be called by its name ( this() need to be used)
		2. Only a constructor can call another constructor
		3. Constructor call MUST be at the first step
		4. One constructir can not call more than one constructor
		5. Constructor can not call or contain itself



class name: Car
		 instance variables:
		 		make, model, year, price, color

	 		1st constructor: initializes the make ONLY

	 		2nd constructor: initializes make & model
	 				(MUST use constructor call to set the make)

			3rd constructor: initializes make, model, year
					(MUST use constructor call to set the make, model)

			4th constructor: initializes make, model, year, price
					(MUST use constructor call to set the make, model, year)

			5th Constructor: intializes all the instances
					(MUST use constructor call to set the make, mode, year, price, color)


		instance methods: toString


Class Name: Employee
	Instance variables:
			name, gender, jobTitle, salary

		1st cosntructor: initializes the name only

		2nd constructor: initializes name and gender

		3rd constructor: initializes name, gender and jobTitle

		4th constructor initializes name, gender, jobTitle, Salary

		5th constructor: initializes name, jobTitle

		6th constructor: initializes banem jobTitle, salary

	Instnace methods:
		toString

next session:
	instance vs static

     */
        public String  name;
        public String  jobTitle;
        public char gender;
        public double sallary;

        public day26_class_notes(String name) {
                this.name = name;
        }

        public day26_class_notes(String name, char gender) {
                this.name = name;
                this.gender = gender;
        }

        public day26_class_notes(String name, String jobTitle, char gender) {
                this.name = name;
                this.jobTitle = jobTitle;
                this.gender = gender;
        }

        public day26_class_notes(String name, String jobTitle, char gender, double sallary) {
                this.name = name;
                this.jobTitle = jobTitle;
                this.gender = gender;
                this.sallary = sallary;
        }

        public day26_class_notes(String name, String jobTitle) {
                this.name = name;
                this.jobTitle = jobTitle;
        }

        public day26_class_notes(String name, String jobTitle, double sallary) {
                this.name = name;
                this.jobTitle = jobTitle;
                this.sallary = sallary;
        }

        @Override
        public String toString() {
                return "day26_class_notes{" +
                        "name='" + name + '\'' +
                        ", jobTitle='" + jobTitle + '\'' +
                        ", gender=" + gender +
                        ", sallary=" + sallary +
                        '}';
        }





}
