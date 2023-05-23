package day09_scanner;

import java.util.Scanner;

public class Eligible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a num");
        int num =input.nextInt();

        String result= "";
        if(num >=21 && num <=100){
            result = "eligible";

        }else{
            result="not eligible";
        }
        System.out.println(result);
        input.close();

    }
}
