package day15_whileLoop;

public class Day15_classNotes {
    /*
    Topics: Branching Statements
					break
                            continue

    While Loop Intro

package name: day15_whileLoop

    Warmup tasks:
            1. Write a program that can ask the user to enter a number for 5 times and returns the maximum number

	2. Write a program that can ask the user to enter a number for 5 times and returns the minimum number

	3. Write a program that can remove the duplicated characters from the a string

    Ex:
    str = "aabbbcccc"

    output:
    abc



    Branching (Jump) statements:
            1. Return
		2. Break
		3. Continue

     */
    public static void main(String[] args) {
        String s="Cydeo";
        for (int i = 0; i < s.length(); i += 3) {
            System.out.println(s.charAt(i));
        }

    }
}
