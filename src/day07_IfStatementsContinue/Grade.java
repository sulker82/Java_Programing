package day07_IfStatementsContinue;

public class Grade {
    public static void main(String[] args) {

        char grade = 'A';
        String result ="";

        if(grade == 'A'){
            result = "excelent";
        }
        if(grade == 'B'){
            result = "great job";
        }
        if(grade == 'C'){
            result = "good";
        }
        if(grade == 'D'){
            result = "passed";
        }
        if(grade == 'E'){
            result = "failed";
        }
        System.out.println(result);
    }
}
/*
    Create a class named Grade, a char variable named grade is given. write a program to print the following messages:
            'A': Excellent
            'B': Great job
            'C': Good
            'D': Passed
            'F': Failed

        Note: Do not use more than one print statement

 */
