package com.company.basics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReadFromKeyboard {
    private Map<String, Integer> data;

    public ReadFromKeyboard() {
        this.data = new HashMap();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        String command;
        do {
            System.out.print("Enter Command >>> ");
            command = scanner.nextLine().trim();

            if (command.equals("create")) {
                create(scanner);
            } else if (command.equals("read")) {
                read(scanner);
            } else if (command.equals("update")) {
                update(scanner);
            } else if (command.equals("delete")) {
                delete(scanner);
            } else if (command.equals("help")) {
                help();
            } else if (!command.equals("quit")) {
                System.out.println("Invalid command. Type 'help' for instructions.");
            }
        } while (!command.equals("quit"));
        System.out.println("Exiting application...");
    }

    private void create(Scanner scanner) {
        System.out.print("Username: >>> ");
        String username = scanner.nextLine().trim();
        System.out.print("Sold: >>> ");
        int sold = Integer.parseInt(scanner.nextLine().trim());
        data.put(username, sold);
        System.out.println("Data created for user " + username);
    }

    private void read(Scanner scanner) {
        System.out.print("Username: >>> ");
        String username = scanner.nextLine().trim();
        Integer sold = data.get(username);
        if (sold != null) {
            System.out.println("Sold for user " + username + ": " + sold);
        } else {
            System.out.println("User " + username + " not found");
        }
    }

    private void update(Scanner scanner) {
        System.out.print("Username: >>> ");
        String username = scanner.nextLine().trim();
        System.out.print("Sold: >>> ");
        int sold = Integer.parseInt(scanner.nextLine().trim());
        data.put(username, sold);
        System.out.println("The sold was updated for user " + username + " to " + sold);
    }

    private void delete(Scanner scanner) {
        System.out.print("Username: >>> ");
        String username = scanner.nextLine().trim();
        Integer removed = data.remove(username);
        if (removed != null) {
            System.out.println("Data deleted for user " + username);
        } else {
            System.out.println("User " + username + " not found");
        }
    }

    private void help() {
        System.out.println("Accepted commands:");
        System.out.println("help: Instructions on how to use the application");
        System.out.println("create: Create data. Can receive two parameters: username and sold.");
        System.out.println("read: Read data. Receive the username.");
        System.out.println("update: Update data. Can receive two parameters: username and sold.");
        System.out.println("delete: Delete the user's data. Receive the username.");
        System.out.println("quit: Close the application.");
    }

    public static void main(String[] args) {
        ReadFromKeyboard app = new ReadFromKeyboard();
        app.run();
        System.out.println(app.data);
    }
}
