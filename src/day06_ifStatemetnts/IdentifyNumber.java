package day06_ifStatemetnts;

public class IdentifyNumber {

    public static void main(String[] args) {
        int numberr = 30;
        boolean isPositi =numberr > 0;
        boolean isNegati =numberr < 0;
       // boolean isZeroo = numberr == 0;
        boolean isZeroo = !isPositi && !isNegati;
        System.out.println(numberr+" is positive number: "+isPositi);
        System.out.println(numberr+" is negative number: "+isNegati);
        System.out.println(numberr+" is zero: "+isZeroo);

        System.out.println("-------------------------");

        int number = -20;

        boolean isPositive = number > 0; // if the number is greater than zero, then it's positive number
        boolean isNegative = number < 0; // if the number is less than zero, then it's negative number
        // boolean isZero =  number == 0; // if the number is equal to 0, then the number is zero

        boolean isZero = !isPositive && !isNegative; // if the number is NOT positive and NOT negative, then it's zero


        System.out.println(number + " is positive number: " + isPositive);
        System.out.println(number + " is negative number: " + isNegative);
        System.out.println(number +" is zero: " + isZero);

    }

}

        /*
2. Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.
			Ex:
				number = 200
			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false
 */
