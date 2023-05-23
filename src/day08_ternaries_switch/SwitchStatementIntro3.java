package day08_ternaries_switch;

public class SwitchStatementIntro3 {

    public static void main(String[] args) {

        int score = 85; // 0 ~ 100

        String result = "";

        if(score >= 90){ // false: score < 90
            result = "A";
        }else if(score >= 80 && score < 90){ //false: score < 80
            result = "B";
        }else if(score >= 70){ // false: score < 70
            result = "C";
        }else if(score >= 60 ){ // false: score < 60
            result ="D";
        }else{ // score < 60
            result = "F";
        }

        /*
        switch (score){
            case >= 80 && <= 90
        }
*/
        //-----------------------------------------------------------

        int number = 1;


        switch (number){

            case 1:
            System.out.println("Jene");
            break;

            case 2:
                System.out.println("febb");
                break;

            case 3:
                System.out.println("mar");
                break;

            case 4:
                System.out.println("ap");
                break;

            case 5:
                System.out.println("may");
                break;

            case 6:
                System.out.println("june");
                break;

            case 7:
                System.out.println("jull");
                break;

            case 8:
                System.out.println("aug");
                break;

            case 9:
                System.out.println("sep");
                break;

            case 10:
                System.out.println("octa");
                break;
            case 11:
                System.out.println("nov");
                break;
            case 12:
                System.out.println("dec");
                break;
            default:
                System.out.println("invalid");





        }







    }
}
