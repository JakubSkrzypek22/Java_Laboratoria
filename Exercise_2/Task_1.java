package Exercise_2;

import java.util.Scanner;

public class Task_1 {
    public void runTask() {

        Scanner sc = new  Scanner(System.in);

        System.out.println("\nPlease enter the numbers of students (N) ");
        int n = sc.nextInt();

        int i = 0;
        int sum = 0;

        while(i<n){
            System.out.println("\nPlease enter the points of " + (i+1) + " student (N) ");
            int points = sc.nextInt();
            sum += points;
            ++i;
        }

        double average = (double) sum /n;

        System.out.println("\nThe average points of " + n + " students is " + average);
    }
}
