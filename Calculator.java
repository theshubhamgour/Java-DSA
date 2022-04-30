/*
Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
                    1 : + (Addition) a + b
                    2 : - (Subtraction) a - b
                    3 : * (Multiplication) a * b
                    4 : / (Division) a / b
                    5 : % (Modulo or remainder) a % b
Calculate the result according to the operation given and display it to the user.
*/

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        int a = sc.nextInt();
        System.out.print("Enter the second value: ");
        int b = sc.nextInt();

        System.out.println("Select Below Operations: ");
        System.out.println("\t 1 : + (Addition)  ");
        System.out.println("\t 2 : - (Subtraction)  ");
        System.out.println("\t 3 : * (Multiplication)  ");
        System.out.println("\t 4 : / (Division)  ");
        System.out.println("\t 5 : % (Modulo or remainder) ");


        System.out.print("Enter your operation: ");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                number = a + b;
                System.out.println("The Addition is: " + number);
                break;
            case 2:
                number = a - b;
                System.out.println("The Substraction is: " + number);
                break;
            case 3:
                number = a * b;
                System.out.println("The Multiplication is: " + number);
                break;
            case 4:
                number = a / b;
                System.out.println("The Division is: " + number);
                break;
            case 5:
                number = a % b;
                System.out.println("The Modulus is: " + number);
                break;
            default:
                System.out.println("Out of order");
                break;
        }
    }
}
