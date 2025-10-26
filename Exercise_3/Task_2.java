package Exercise_3;

import javax.management.StandardMBean;

public class Task_2 {
    public void RunTask() {
        int[] even = {2, 4, 6, 8, 12, 11, 9, 7};
        int[] notEven = {4, 7, 2, 3, 5, 1, 6, 4, 1};

        System.out.println("\nFirst table");
        for (int i = 0; i < even.length ; i += 2){
            System.out.println(even[i] + " ");
        }

        System.out.println("\nSecond table");
        for (int i = 0; i < notEven.length ; i += 2){
            System.out.println(notEven[i] + " ");
            }
        }

    }

