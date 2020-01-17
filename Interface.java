import java.util.*;

public class Interface {
    public static void main(String[] args) {
        printIntro();
        char input;
        do {
            Scanner scan = new Scanner(System.in);
            input = scan.next().charAt(0);

            switch (input) {
                case 'n':
                    break;
                case 'a':
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

    private static void printIntro() {
        System.out.println("Welcome to CLI Checklist written in Java!\n");

        System.out.println("Please select one of the following:");
        System.out.println(
            "n: creates a new checklist\n" +
            "a: adds an item to your checklist\n" +
            "v: view your current checklist\n" +
            "d: delete an item from a checklist\n" +
            "c: deltes an entire checklist\n" +
            "q: exits the application");
    }

    private static void exitApp(Scanner scan) {
        scan.close();
        System.out.print("Thank you for using the CLI Checklist!");
    }
}