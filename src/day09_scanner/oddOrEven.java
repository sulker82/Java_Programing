package day09_scanner;

import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number");
        byte num = input.nextByte();
        String result ="";
        if(num %2==0){
            result="even";
        }else{
            result="odd";
        }
        System.out.println(result);

        input.close();

    }
}
