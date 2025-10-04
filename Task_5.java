package Exercise_1;

import java.util.Scanner;

public class Task_5 {
    public void runTask(){

        Scanner sc  = new Scanner(System.in);

        System.out.println("\nEnter a number");
        int num = sc.nextInt();

        System.out.println("\nThis number raised to third power is " + ( num * num * num ));

    }
}
