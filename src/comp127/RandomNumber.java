package comp127;

import java.util.Scanner;
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args)  {
        Random generator = new Random();

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number: ");

        int num = scan.nextInt();

        int result = generator.nextInt(num);

        System.out.println("The random number is " + result);
    }

}
