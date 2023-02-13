import java.util.Scanner;

/**
 * task1
 * 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
 */

public class task_001 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int num = scan.nextInt();
        System.out.printf("Треугольное число: %d\n", giveMeNumber(num));
        scan.close();
    }

    public static int giveMeNumber(int a) {
        return (a * (a + 1)) / 2;
    }
}
