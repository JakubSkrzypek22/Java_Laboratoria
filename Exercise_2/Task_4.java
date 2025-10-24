package Exercise_2;

import java.util.Random;
import java.util.Scanner;

public class Task_4 {
    public void runTask() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter how many numbers you want to draw: ");
        int n = scanner.nextInt(); // user chooses how many numbers to draw

        int evenSum = 0; // to store sum of even numbers
        int i = 0;

        while (i < n) {
            // draw a random number from -10 to 45
            int number = random.nextInt(56) - 10;
            System.out.println("Drawn number: " + number);

            // check if even
            if (number % 2 == 0) {
                evenSum += number;
            }

            i++;
        }

        System.out.println("Sum of even numbers: " + evenSum);
    }
}
