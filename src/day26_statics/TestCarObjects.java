package day26_statics;

public class TestCarObjects {

    public static void main(String[] args) {

        day26_class_notes name1 = new day26_class_notes("Ali");
        System.out.println(name1);

        day26_class_notes name2 = new day26_class_notes("ali",'m');
        System.out.println(name2);

        day26_class_notes name3 = new day26_class_notes("david","developer",'m');
        System.out.println(name3);

        day26_class_notes name4 = new day26_class_notes("ashly","sdet",'F',120000);
        System.out.println(name4);

        day26_class_notes name5 = new day26_class_notes("emly","Java",140000);
        System.out.println(name5);

        Car car1 = new Car("BMW");

        System.out.println(car1);


        Car car2 = new Car("Audi", "Q4");

        System.out.println(car2);


        Car car3 = new Car("Toyota", "Camry", 2021);

        System.out.println(car3);


        Car car4 = new Car("Honda", "Accord", 2020, 30000);

        System.out.println(car4);


        Car car5 = new Car("Lexus", "RX350", 2019, 40000, "Black");

        System.out.println(car5);


    }

}
