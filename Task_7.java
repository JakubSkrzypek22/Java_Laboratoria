package Exercise_1;

import java.util.Random;
import java.util.Scanner;

public class Task_7 {
    public void runTask(){

        Scanner sc = new  Scanner(System.in);
        Random rand = new  Random();

        System.out.println("Enter a first number");
        int a = sc.nextInt();

        System.out.println("Enter a second number");
        int b = sc.nextInt();

        System.out.println("\nDraw your third number ");
        int c = rand.nextInt(a + b + 1) + a ;

        System.out.println("\nYour third number is " + c );

        boolean triangle = true;
        boolean NotTriangel = false;

        if ( a * a +  b * b == c * c){
            System.out.println("Can you make your Triangle ? " + (triangle));
        } else {
            System.out.println("Can you make your Triangle ? " + (NotTriangel));
        }
    }
}
