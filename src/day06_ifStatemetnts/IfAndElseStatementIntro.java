package day06_ifStatemetnts;

public class IfAndElseStatementIntro {

    public static void main(String[] args) {
        int agee = 13;
        if (agee>21){
            System.out.println("eligiable");
        }else{ //// else only for two option like ye or no.
            System.out.println("Not eligiable");
        }
        System.out.println("-----------------------");

        int age = 28;

        if(age >= 21){
            System.out.println("Eligible");
        }

        if(age < 21){
            System.out.println("Not Eligible");
        }


        System.out.println("-------------------------------------------");

        if(age >= 21){
            System.out.println("Eligible");
        }else{ // otherwise
            System.out.println("Not Eligible");
        }



    }

}
