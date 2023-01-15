import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number");
        int numInput = num.nextInt();

        Scanner operation = new Scanner(System.in);
        System.out.println("Now enter an operation");
        String operationInput = operation.nextLine();

        Scanner newNum = new Scanner(System.in);
        System.out.println("Enter another number");
        int newNumInput = newNum.nextInt();

        switch (operationInput) {
            case "+":
                Main.add(newNumInput, newNumInput);
                break;
            case "-":
                Main.subtract(newNumInput, newNumInput);
                break;
            case "*":
                Main.multiply(newNumInput, newNumInput);
                break;
            case "/":
                Main.divide(newNumInput, newNumInput);
                break;
            default:
                System.out.println("You must pick a mathematical operation");
        }

        Scanner userCheck = new Scanner(System.in);
        System.out.println("Do you want to continue?");
        String userResult = userCheck.nextLine();

        switch (userResult) {
            case "yes":
                main(args);
        }


    }
    public static int add(int x, int y) {
        System.out.println(x + y);
        return 0;
    }

    public static int subtract(int x, int y) {
        System.out.println(x - y);
        return 0;
    }

    public static int multiply(int x, int y) {
        System.out.println(x * y);
        return 0;
    }

    public static int divide(int x, int y)  {
        System.out.println(x / y);
        return 0;
    }
}