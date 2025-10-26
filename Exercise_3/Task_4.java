package Exercise_3;

import java.util.Scanner;

public class Task_4 {
    public void RunTask(){

        Scanner sc = new Scanner(System.in);

        String [] words = new String[5];

        for(int i = 0 ; i < 5 ; i++){
            System.out.println("Enter a " + (i+1) + " word");
            words[i] = sc.nextLine();
        }

        for(int i = words.length - 1 ; i >= 0 ; i--){
            String reversed = new  StringBuilder(words[i]).reverse().toString();
            System.out.println(reversed);
        }

    }
}
