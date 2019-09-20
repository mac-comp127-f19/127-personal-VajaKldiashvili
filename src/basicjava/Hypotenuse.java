package basicjava;

import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[]args)   {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the side lengths: ");

        double length1 = scan.nextInt();

        double length2 = scan.nextInt();

        System.out.println(calculateHypotenuse(length1, length2));
        }
    public static double calculateHypotenuse(double length1, double length2) {
        double squareHyp = Math.pow(length1, 2) + Math.pow(length2, 2);
        return Math.pow(squareHyp, 0.5);
    }
}
