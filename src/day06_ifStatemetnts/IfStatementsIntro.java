package day06_ifStatemetnts;

public class IfStatementsIntro {

    public static void main(String[] args) {
        int no = -200;
        boolean isPos = no > 0;
        boolean isNe = no < 0;
        boolean isZe = no == 0;
         if(isPos){
             System.out.println(no+" is positive number");
         }
         if(isNe){
             System.out.println(no+" is negative number");
         }
         if(isZe){
             System.out.println(no+" is zero");
         }
        System.out.println("----------------------");

        int number = -100;

        boolean isPositive = number > 0 ;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;


        if(isPositive){
            System.out.println(number + " is positive number");
        }

        if(isNegative){
            System.out.println(number + " is negative number");
        }

        if(isZero){
            System.out.println(number + " is zero");
        }


        System.out.println("--------------------------------------------------------");
        int noo = 50;

        if(noo > 0){
            System.out.println(noo+" is positive");
        }
        if(noo < 0){
            System.out.println(noo+" is negative");

        }
        if(noo ==0){
            System.out.println(noo+" is zero");
        }

        int num = 100;

        if(num > 0){
            System.out.println(num + " is positive");
        }

        if(num < 0){
            System.out.println(num + " is negative");
        }

        if(num == 0){
            System.out.println(num + " is zero");
        }



    }
}
