package basicjava;

/**
* Created By Vaja and Arkadii on 9/06/19
 */

public class BasicStuff {
    public static void main(String[] args)  {
        double age0 = 19, age1 = 18;
        System.out.println("We are " + age0 + " and " + age1 + " years old!");
        double sumOfAges = age0 + age1;
        System.out.println("The sum of ages is " + (sumOfAges) + "!");
        System.out.println("The sum of ages is " + (age0 + age1) + "!");
        // Changing the type of variable from integer to double changed our answer from 37 to 37.0
        System.out.println(6/3);
        System.out.println(6.0/4); //Change 6 to 6.0 in order to get 1.5 (int to double)
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE - 1);

    }
}
