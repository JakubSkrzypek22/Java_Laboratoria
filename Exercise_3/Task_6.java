package Exercise_3;

import java.util.Scanner;

public class Task_6 {


    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public void RunTask() {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];


        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                System.out.println("Factorial is not defined for negative numbers: " + numbers[i]);
            } else {
                System.out.println("Factorial of " + numbers[i] + " is: " + factorial(numbers[i]));
            }
        }
    }
}
