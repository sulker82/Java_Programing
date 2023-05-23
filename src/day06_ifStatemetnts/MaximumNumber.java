package day06_ifStatemetnts;

public class MaximumNumber {

    public static void main(String[] args) {

        int a1 = 30,
                a2= 50;
        if(a1>a2){
            System.out.println(a1+" is the maximum number");
        }
        if(a2>a1){
            System.out.println(a2+" is the maximum number");

        }
        if(a1==a2){
            System.out.println("Equal");
        }
        System.out.println("---------------------------------");

        int n1 = 1000,
                n2 = 1000;


        if (n1 > n2) {
            System.out.println(n1 + " is the maximum number");
        }

        if (n2 > n1) {
            System.out.println(n2 + " is the maximum number");
        }

        if (n1 == n2) {
            System.out.println("Equal");
        }


    }


}

/*
. Create a class named MaximumNumber.java
2. Declare the following variables:
	1. num1
	2. num2
3. Write a program that can print the maximum number between the two numbers above, if both are equal then print Equal
	Ex:
		num1 = 10
		num2 = 20
	     output:
		20 is the maximum number
 */
