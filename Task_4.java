package Exercise_1;

import java.util.Scanner;

public class Task_4 {
    public void runTask(){

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter a number");
        int num = sc.nextInt();

        boolean even_number = true;
        boolean odd_number = false;

        if(num % 3 == 0 && num % 5 == 0){
            System.out.println("\nThe number is divisible by 3 and 5  ? " + (even_number));
        }else if (num % 3 == 0 ){
            System.out.println("\nThe number is divisible by 3 and 5  ?  " + (odd_number));
        }else  if (  num % 5 == 0){
            System.out.println("\nThe number is divisible by 3 and 5  ? " + (even_number));
        }else{
            System.out.println("\nThe number is divisible by 3 and 5  ? " + (even_number));
        }
    }
}
