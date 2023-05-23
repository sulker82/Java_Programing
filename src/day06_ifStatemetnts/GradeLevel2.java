package day06_ifStatemetnts;

public class GradeLevel2 {
    public static void main(String[] args) {

        int gradeLevel = 4;

        String result = "" ; // temporary value

        if(gradeLevel >= 1 && gradeLevel <= 5){
            result = "Elemntary School";
        }

        if(gradeLevel >= 6 && gradeLevel <= 8){
            result = "Middle School";
        }

        if(gradeLevel >= 9 && gradeLevel <= 12){
            result = "High School";
        }

        if(gradeLevel >= 13 && gradeLevel <= 16){
            result = "College";
        }

        if(gradeLevel >= 17 && gradeLevel <= 18){
            result = "Grad School";
        }

        System.out.println("result = " + result);

        System.out.println("----------------------------");

        int gradeLevell = 1;

        String resultt = "" ; // temporary value

        if(gradeLevell >= 1 && gradeLevell <= 5){
            resultt = "Elemntary School";
        }

        if(gradeLevell >= 6 && gradeLevell <= 8){
            resultt = "Middle School";
        }

        if(gradeLevell >= 9 && gradeLevell <= 12){
            resultt = "High School";
        }

        if(gradeLevell >= 13 && gradeLevell <= 16){
            resultt = "College";
        }

        if(gradeLevell >= 17 && gradeLevell <= 18){
            resultt = "Grad School";
        }

        System.out.println("result = " + result);



    }



}
