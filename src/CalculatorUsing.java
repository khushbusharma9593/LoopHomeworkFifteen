import java.util.Scanner;

public class CalculatorUsing {
    public static void main(String[] args) {
        char operator;
        int num1;//Variable declared
        int num2;
        int result;

        Scanner scanner = new Scanner(System.in);//scanner method
        System.out.println("Choose an operators : +,-,* or /");
        operator = scanner.next().charAt(0);

        System.out.println("Enter first number");
        num1 = scanner.nextInt();

        System.out.println("Enter second number");
        num2 = scanner.nextInt();

        //Using switch method
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + "+" + num2 + "=" + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println(num1 + "-" + num2 + "=" + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println(num1 + "*" + num2 + "=" + result);
                break;

            case '/':
                result = num1 / num2;
                System.out.println(num1 + "/" + num2 + "=" + result);
                break;

            default:
                System.out.println("Invalid operator");
                break;


        }

    }
}