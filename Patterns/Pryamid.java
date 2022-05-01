/*

   *
  **
 ***
****

*/

package Patterns;

public class Pryamid {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            // Inner loop -> Space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Inner loop -> Star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
