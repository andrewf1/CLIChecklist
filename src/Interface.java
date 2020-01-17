import java.util.*;

public class Interface {
    private static Checklist userList;
    public static void main(String[] args) {
        System.out.println("Welcome to CLI Checklist written in Java!\n");
        char input;
        do {
            printMenu();

            Scanner scan = new Scanner(System.in);
            input = scan.next().charAt(0);

            switch (input) {
                case 'n':
                    newList();
                    break;
                case 'a':
                    addItem();
                    break;
                case 'v':
                    break;
                case 'd':
                    break;
                case 'c':
                    break;
                case 'q':
                    exitApp(scan);
                    break;
                default:
                    System.out.println("Invalid input, try again!");
            }
        }  while(input != 'q');


    }

    private static void addItem() {
        String item;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the item to add to your checklist: ");
        item = scan.next();
        try {
            // call checklist class add item method
            userList.addAnItem(item);
        }
        catch(Exception e) {
            System.out.println(e.getMessage() + "\n");
        }
    }

    private static void newList() {
        String list_name = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of your list: ");
        while (scan.hasNextLine()) {
            list_name += scan.nextLine();
        }

        userList = new Checklist(list_name);
        System.out.println("List successfully created with name " + list_name + "!");
        scan.close();
    }

    private static void printMenu() {
        System.out.println("\nPlease select one of the following:");
        System.out.println(
            "n: creates a new checklist\n" +
            "a: adds an item to your checklist\n" +
            "v: view your current checklist and perform operations on the items\n" +
            "d: delete an item from a checklist\n" +
            "c: deletes an entire checklist\n" +
            "q: exits the application");
    }

    private static void exitApp(Scanner scan) {
        scan.close();
        System.out.print("Thank you for using the CLI Checklist!");
    }
}