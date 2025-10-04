package Exercise_1;

import java.util.Scanner;

public class Run {

    public void start() {

        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while(!exit){
            System.out.println("\nPlease enter your choice");
            System.out.println("1. Task_1 ");
            System.out.println("2. Task_2 ");
            System.out.println("3. Task_3 ");
            System.out.println("4. Task_4 ");
            System.out.println("5. Task_5 ");
            System.out.println("6. Task_6 ");
            System.out.println("7. Task_7 ");
            System.out.println("8. Exit");

            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    Task_1 task1 = new Task_1();
                    task1.runTask();
                    break;
                case 2:
                    Task_2 task2 = new Task_2();
                    task2.runTask();
                    break;
                case 3:
                    Task_3 task3 = new Task_3();
                    task3.runTask();
                    break;
                case 4:
                    Task_4 task4 = new Task_4();
                    task4.runTask();
                    break;
                case 5:
                    Task_5 task5 = new Task_5();
                    task5.runTask();
                    break;
                case 6:
                    Task_6 task6 = new Task_6();
                    task6.runTask();
                    break;
                case 7:
                    Task_7 task7 = new Task_7();
                    task7.runTask();
                    break;
                case 8:
                    System.out.println("Program Exited");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        }
        sc.close();
    }

}
