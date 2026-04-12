package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Enter task title: ");
            String title = scanner.nextLine();

            if (title.matches(".*[a-zA-Z].*")) {
                System.out.println("You created the task: " + title);
                break;
            } else {
                System.out.println("Invalid title! Must contain at least one letter.");
            }
        }

    }
}