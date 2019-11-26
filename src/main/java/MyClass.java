import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = scanner.nextLine();

        System.out.print("Enter your surname:");
        String surname = scanner.nextLine();

        System.out.print("Enter your gender:");
        String gender = scanner.nextLine();

        System.out.print("Enter your age:");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter your Location(from):");
        String from = scanner.nextLine();

        System.out.print("Enter your Location(current):");
        String cur = scanner.nextLine();

        System.out.println("\n-------------------- PASSPORT ----------------------------\n" + "----------------------------------------------------------\n" + "-----");
        System.out.println("----- Person:  {" + name +"} {" + surname + "}\n" +  "-----");
        System.out.println("----- Gender: {" + gender + "},  age: {"+ age + "}\n" + "-----");
        System.out.println("----- Location: from - {"+ from + "} , current - {"+ cur + "}\n" + "-----\n" + "----------------------------------------------------------\n" + "----------------------------------------------------------");


    }
}