package day31_inheritance.Animal_MethodOverriding;

public class Cat extends Animal {


    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat() {
        System.out.println("Cat "+getName() + " is eating cat food");
    }


    public void sleep() {
        System.out.println("Cat "+getName() + " is sleeping 12 hours");
    }

    public void scratch(){
        System.out.println("Cat "+getName() + " is scratching");
    }

}
