package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int option;

        while (true) {
            System.out.println("Select a option:");
            System.out.print("1 - Create new task \n" +
                    "2 - List tasks \n" +
                    "3 - Delete task \n");

            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
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


            if (option == 2) {
                System.out.println("List selected");
            }

            if (option == 3) {
                System.out.println("Delete selected");
            }
        }
    }
}









