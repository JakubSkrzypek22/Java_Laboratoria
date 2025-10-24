package Exercise_2;

import java.util.Scanner;

public class Task_5 {
    public void runTask() {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a word (or type 'stop' to end): ");
            String word = sc.nextLine();

            if (word.equalsIgnoreCase("stop")) {
                System.out.println("Program ended.");
                break;
            }

            String reversed = new StringBuilder(word).reverse().toString();

            if (word.equalsIgnoreCase(reversed)) {
                System.out.println("This word is a palindrome.");
            } else {
                System.out.println("This word is not a palindrome.");
            }

            System.out.println();
        }
    }
}
