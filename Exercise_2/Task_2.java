package Exercise_2;

import java.util.Scanner;

public class Task_2 {
    public void runTask() {

        Scanner sc = new  Scanner(System.in);

        int i = 0; //zmienna liczbowa dla petli While

        int PositiveNumbers = 0 , NumbersOfPositives = 0; // Dodatnie Liczby
        int NegativeNumbers = 0, NumbersOfNegatives = 0; //  Ujemne liczby

        System.out.println("\nPlease enter the 10 numbers");

        while (i< 10){

            System.out.println("\nEnter the  " + (i+1) + " number ");
            int number = sc.nextInt();

            if(number > 0){
                PositiveNumbers += number;
                NumbersOfPositives++;
                ++i;
            } else if (number < 0) {
                NegativeNumbers += number;
                NumbersOfNegatives++;
                ++i;
            } else {
                System.out.println("\nPlease enter a non-zero number ");
            }

        }

        System.out.println("\nSum of positives numbers is  " + PositiveNumbers + " and the numbers of positives numbers  is  " +  NumbersOfPositives);
        System.out.println("\nSum of negative numbers is " + NegativeNumbers + " and the numbers of negative numbers  is  " +  NumbersOfNegatives);

    }
}
