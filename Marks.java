/*
Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
	Because marks don’t matter but our effort does.
(Hint : use do-while loop but think & understand why)
*/

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        do {
            switch (marks) {
                case 90:
                    System.out.println("“This is Good”");
                    break;
                case 89:
                    System.out.println("This is also Good");
                    break;
                case 60:
                    System.out.println("“This is Good as well”");
                    break;
                case 0:
                    System.out.println("Because marks don’t matter but our effort does.");
                    break;
            }
        } while (marks <= 100);
    }
}
