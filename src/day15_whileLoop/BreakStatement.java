package day15_whileLoop;

public class BreakStatement {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i==5){
                break;
            }
            System.out.println(i);
        }


        for (char i = 'A'; i < 'Z'; i++) {
           if(i=='S'){
               break;
           }
            System.out.println(" "+i);
        }
        for (; ; ) {

        }


    }

}
/*
 public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if(i == 6){ // if i's value reaches 6
                break; // exits the loop
            }

            System.out.println(i);

        }


        System.out.println("---------------------------------------------");

        for (char i = 'A'; i <= 'Z'; i++){

            if(i == 'J'){
                System.out.println("Loop is terminated");
                break;
                // System.out.println("Loop is terminated");
            }

            System.out.println(i);

        }

        System.out.println("---------------------------------------------");

        for(;;){
            System.out.println("Hello");
            break;
            //  System.out.println("World");
        }




    }
 */
