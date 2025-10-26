package Exercise_3;

import java.util.Arrays;
import java.util.Scanner;

public class Task_5 {
    public void RunTask(){

        Scanner scanner = new Scanner(System.in);

        int [] numbers = new int[8];

        for(int i = 0; i < numbers.length; i++){
            System.out.println("Enter a " + (i+1) + " number");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Unsorted Array" + Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println("Sorted numbers");
        for(int number : numbers ){
            System.out.println(number);
        }



    }
}
