import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        int choice = 0;

        while (choice != 4) {

            System.out.println("\n--- TO DO LIST ---");
            System.out.println("1. Add Task");
            System.out.println("2. Show Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            if (choice == 1) {
                System.out.print("Enter your task: ");
                String t = sc.nextLine();
                list.add(t);
                System.out.println("Task added");
            }

            else if (choice == 2) {
                if (list.size() == 0) {
                    System.out.println("No tasks yet");
                } else {
                    System.out.println("\nYour Tasks:");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + ") " + list.get(i));
                    }
                }
            }

            else if (choice == 3) {
                System.out.print("Enter task number to delete: ");
                int num = sc.nextInt();

                if (num > 0 && num <= list.size()) {
                    list.remove(num - 1);
                    System.out.println("Task removed");
                } else {
                    System.out.println("Invalid number");
                }
            }

            else if (choice == 4) {
                System.out.println("Closing app...");
            }

            else {
                System.out.println("Wrong choice");
            }
        }

        sc.close();
    }
}