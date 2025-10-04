package Exercise_1;

import java.util.Scanner;

public class Task_6 {
    public void runTask(){

        Scanner sc =  new Scanner(System.in);

        System.out.println("\nEnter a number");
        int num = sc.nextInt();

        System.out.println("\nSqrt from this number is " + (Math.sqrt(num)));
    }
}
