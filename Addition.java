import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        int sum;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum = a + b;
        System.out.println("The sum is: " + sum);
    }
}
