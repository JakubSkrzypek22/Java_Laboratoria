package Exercise_2;

import java.util.Scanner;

public class Run {
    public void start(){

        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while(!exit){
            System.out.println("\nPlease enter your choice");
            System.out.println("1. Task_1 ");
            System.out.println("2. Task_2 ");
            System.out.println("3. Task_3 ");
            System.out.println("4. Task_4 ");
            System.out.println("5. Task_5 ");
            System.out.println("6. Exit");

        int choice = sc.nextInt();
        switch (choice){
            case 1:
                Task_1 task_1 = new Task_1();
                task_1.runTask();
                break;
            case 2:
                Task_2 task_2 = new Task_2();
                task_2.runTask();
                break;
            case 3:
                Task_3 task_3 = new Task_3();
                task_3.runTask();
                break;
            case 4:
                Task_4 task_4 = new Task_4();
                task_4.runTask();
                break;
            case 5:
                Task_5 task_5 = new Task_5();
                task_5.runTask();
                break;
            case 6:
                exit = true;
                System.out.println("Program Exited");
                break;
            default:
                System.out.println("Invalid choice");
                break;

        }
            }
        sc.close();
    }
}
