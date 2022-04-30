import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("\nEnter second number: ");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("A: " + a + " is greater than B: " + b);
        } else if (a < b) {
            System.out.println("A: " + a + " is smaller than B: " + b);
        } else if (a == b) {
            System.out.println("A: " + a + " is equals to B: " + b);
        }
    }
}
