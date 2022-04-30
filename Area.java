/*
Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.
*/

public class Area {
    public static void main(String[] args) {
        int radius = 4;
        double pi = 3.142;
        double area;
        area = pi * (radius * radius);
        System.out.println("Area of circle is: " + area);

    }
}
