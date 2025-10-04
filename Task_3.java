package Exercise_1;

import java.util.Scanner;

public class Task_3 {
    public void runTask() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter a number");
        int num = sc.nextInt();

        boolean even_number = true ;
        boolean odd_number = false ;

        if (num % 2 == 0) {
            System.out.println((even_number));
        }else {
            System.out.println((odd_number));
        }
    }
}
