import java.util.Scanner;

// Реализовать простой калькулятор Введите число 2 
// Введите операцию 1 + 2 - 3 * 4 / Введите число 2 2 + 2 = 4

public class task_003 {

    static int getResult(String opr, int num1, int num2) {
        int result = 0;
        switch (opr) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;

            default:
                System.out.println("Введите оператор: -, +, *, /");
                break;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        System.out.println("Введите оператор: -, +, *, /");
        Scanner scanOp = new Scanner(System.in);
        String operations = scanOp.nextLine();
        System.out.println("Введите второе число: ");
        int num2 = scan.nextInt();
        int result = getResult(operations, num1, num2);
        System.out.printf("%d %s %d = %d", num1, operations, num2, result);
        scan.close();
        scanOp.close();

    }

}