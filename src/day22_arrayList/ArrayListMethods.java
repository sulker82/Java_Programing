package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);  //0
        list.add(20);  //1
        list.add(30);  //2
        list.add(10);  //3
        list.add(12);

        //list.add(5.5);


        System.out.println(list);

        list.add(1, 15); //1



        System.out.println(list);

        list.add(2, 25);

        System.out.println(list);

        System.out.println("----------------------------------------------------");

        ArrayList<String> studentsList = new ArrayList<>();
        studentsList.add("Mohammad");
        studentsList.add("Abdurasul");
        studentsList.add("Abidullah");
        studentsList.add("Tatiana");

        System.out.println(studentsList.size());
        System.out.println(studentsList);

        String firstStudent = studentsList.get(0);

        String lastStudent =  studentsList.get( studentsList.size() -1  );


        System.out.println(firstStudent);
        System.out.println(lastStudent);

            int[]num1 = new int [3];
             int[]num2 = {1,2,3,4,5};
             num1=num2;
             for (int i = 0; i <num2.length; i++)

        System.out.print(num1[i]);



    }
}
