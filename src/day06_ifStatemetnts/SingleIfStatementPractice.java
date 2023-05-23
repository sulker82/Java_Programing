package day06_ifStatemetnts;

public class SingleIfStatementPractice {


    public static void main(String[] args) {
        int num = 200;
        boolean isEvenn = num % 2 ==0;

        if(isEvenn){
            System.out.println("even number");
        }
        if(!isEvenn) {
            System.out.println("Odd number");
        }
        System.out.println("------------------");
        if(num % 2 ==0){
            System.out.println("even number");

        }
        if(num % 2 !=0){
            System.out.println("odd number");
        }
        System.out.println("----------");

        int number = 100;

        boolean isEven = number % 2 == 0;


        if(isEven){
            System.out.println("Even number");
        }

        if(!isEven){
            System.out.println("Odd number");
        }

        System.out.println("--------------------------------------");

        if(number % 2 ==0){
            System.out.println("Even number");
        }

        if(number % 2 != 0){
            System.out.println("Odd number");
        }




    }


}
