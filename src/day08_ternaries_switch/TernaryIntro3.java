package day08_ternaries_switch;

public class TernaryIntro3 {

    public static void main(String[] args) {

        int score = 130;

        /*
        String result = "";
        if(score >= 0 && score <= 100){
            if(score >= 60){
                result = "Passed";
            }else{
                result = "Failed";
            }
        }else{
            result = "Invalid";
        }
        System.out.println(result);
*/

        String result = (score >= 0 && score <= 100) ?
                (score >= 60) ? "Passed" : "Failed"
                : "Invalid Score";

        System.out.println(result);

        System.out.println("----------------------------------------");

        int a = 70;
        String re =(a >=0 && a<=100)?
                (a >=60)? "pass" : "fail"

                : "Invalis";
        System.out.println(re);
        System.out.println("-------------------");

        int n = 9;

        String day = (n >= 1 && n <= 7) ?
                (n == 1) ? "Monday" : (n == 2) ? "Tuesday" : (n == 3) ? "Wednesday" : (n == 4) ? "Thursday"
                        : (n == 5) ? "Friday" : (n == 6) ? "Saturday" : "Sunday"
                : "No such a day";

        System.out.println(day);
        System.out.println("-----------------------");

        int c =6;

        String dayy = ( c>=1 && c<=7) ?
                (c==1)? "mon" :(c==2)? "tues" : (c==3)? "wedn" :(c==4)? "thurs" :(c==5)? "fri":
                        (c==6)? "satt" : "sun"


                :"no a dayy";
        System.out.println(dayy);


    }
}
