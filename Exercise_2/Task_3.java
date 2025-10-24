package Exercise_2;

import java.util.Scanner;

public class Task_3 {
    public void runTask() {

        Scanner sc = new Scanner(System.in);


        System.out.print("\nPlease enter how many numbers the sequence has (n > 0): ");
        int n = sc.nextInt();

        while (n <= 0) {
            System.out.print("\n(N) must be greater than 0. Try again: ");
            n = sc.nextInt();
        }

        int i = 0;
        int sumOfEvenNumbers = 0;

        while (i < n) {
            System.out.print("\nEnter the " + (i + 1) + " number  ");
            int sequenceNumber = sc.nextInt();

            if (sequenceNumber % 2 == 0) {
                sumOfEvenNumbers += sequenceNumber;
            }

            i++; // zawsze zwiększamy, bo każda liczba jest częścią ciągu
        }

        System.out.println("\nThe sum of even numbers in the sequence is: " + sumOfEvenNumbers);

        }

    }

