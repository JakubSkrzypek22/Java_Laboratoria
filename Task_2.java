package Exercise_1;

import java.util.Scanner;

public class Task_2 {
    public void runTask(){

        Scanner sc  = new Scanner(System.in);

        System.out.println("\nEnter first number");
        int num1 = sc.nextInt();

        System.out.println("\nEnter second number");
        int num2 = sc.nextInt();

        System.out.println("\nThe sum of this numbers is " + (num1 + num2));
        System.out.println("The difference of this numbers is " + (num1 - num2));
        System.out.println("The product of this numbers is " + (num1 * num2));

    }
}
