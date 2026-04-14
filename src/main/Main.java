package main;

import java.util.Scanner;
import service.TaskService;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TaskService service = new TaskService();

        while (true) {

            System.out.println("\nSelect a option:");
            System.out.print("1 - Create new task \n" +
                    "2 - List tasks \n" +
                    "3 - Delete task \n");

            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                service.createTask(scanner);
            }

            if (option == 2) {
                service.listTasks();
            }

            if (option == 3) {
                service.deleteTask();
            }
        }
    }
}