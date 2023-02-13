import java.util.Scanner;

// Вывести все простые числа от 1 до 1000

public class task_002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число ");
        int num = scan.nextInt();
        scan.close();
        for (int i = 2; i <= num; i++) {
            Boolean flag = true;
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
            }

        }
    }

}
