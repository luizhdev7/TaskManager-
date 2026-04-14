package service;

import java.util.Scanner;

public class TaskService {

    public void createTask(Scanner scanner) {

        System.out.println("Create selected");

        while (true) {

            String title;

            while (true) {
                System.out.println("Enter task title:");
                title = scanner.nextLine();

                if (!title.matches(".*[a-zA-Z].*")) {
                    System.out.println("Invalid title! Must contain at least one letter.");
                } else {
                    break;
                }
            }

            System.out.println("You created the task: " + title);

            System.out.println("Do you want to create another task? (y/n)");
            String again = scanner.nextLine();

            if (!again.equalsIgnoreCase("y")) {
                break;
            }
        }
    }

    public void listTasks() {
        System.out.println("List selected");
    }

    public void deleteTask() {
        System.out.println("Delete selected");
    }
}