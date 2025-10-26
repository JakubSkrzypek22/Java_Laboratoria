package Exercise_3;

import java.util.Random;

public class Task_1 {

    public void RunTask() {

        int size = 8;     // number of elements in the array
        int min = 1;      // minimum value
        int max = 100;    // maximum value

        // Generate the array using a separate method
        int[] numbers = generateRandomArray(size, min, max);

        // Calculate sum and average using for loop
        int sumNumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumNumbers += numbers[i];
        }
        double averageNumbers = (double) sumNumbers / numbers.length;

        // Display results
        System.out.println("Array elements:");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println("\nSum: " + sumNumbers);
        System.out.println("Average: " + averageNumbers);
    }

    // Separate method to generate random array
    public int[] generateRandomArray(int size, int min, int max) {
        Random rand = new Random();
        int[] arr = new int[size];

        int index = 0;
        for (int ignored : arr) {       // fill the array with random values
            arr[index] = rand.nextInt(max - min + 1) + min;
            index++;
        }
        return arr;
    }
}