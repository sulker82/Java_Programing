package day28_encapsulation.encapsulation;

public class Person {


    /*
Variables:
    name, age, gender, dateOfBirth
        name:
            Write: can not be null/empty/blank
            Read: if name is not, return "Unknown" instead
        age:
            Write: age can not be less than zero or greater than 120
        gender:
            Write: gender can only be 'M' or 'F'
        dateOfBirth:
            Write:  can not be after today's date
    Add a constructor that can set all the fields
    Add toString()
 */
    private String name;
    private int age;
    private char gender;

    public String getName() {
        if(name == null){
            System.err.println("Name has not been set");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            System.out.println("Unknow");
            System.exit(1);

            this.name = name;
        }


    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0 || age >120){
            System.err.println("Invalid age: "+age);
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

        this.gender = gender;
    }

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}