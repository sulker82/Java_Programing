package day05_operators;

public class UnaryOperators {

    public static void main(String[] args) {
        int w = 24;
        System.out.println(++w);
        System.out.println(w);

        int e = 30;
        System.out.println(--e);
        System.out.println(e);

        // pre increment/decrement
        int x = 10;

        System.out.println( ++x ); //11
        System.out.println(x); //11


        int y = 100;

        System.out.println( --y ); //99
        System.out.println(y);

        System.out.println("------------------------------------");

        // post increment/decrement
        int a = 50;

        System.out.println(a++); // 50
        System.out.println( a ); //51

        int s = 60;
        System.out.println(s++);
        System.out.println(s);


        int b = 25;

        System.out.println( b-- ); //25
        System.out.println(b);

        int q2 = 10;
        System.out.println(q2--);
        System.out.println(q2);


        System.out.println("------------------------------------");
        int c =100;
        int k =c++;
        System.out.println("k = " + k);
        System.out.println("c = " + c);


        int n = 30;

        int m = n++;  // m =  30, n=31

        System.out.println("n = " + n);
        System.out.println("m = " + m);

        int z = 60;

        int q = z--; // q =60, z = 59

        System.out.println("z = " + z);
        System.out.println("q = " + q);

        int v =70;
        int o =v--;
        System.out.println("v = " + v);
        System.out.println("o = " + o);











    }


}
