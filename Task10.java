package Task2;

import java.util.Scanner;

public
    class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ввeдите m: ");
        int m = scanner.nextInt();

        System.out.println("Введите n: ");
        int n = scanner.nextInt();

        for (int i = m; i <= n; i++) {
            System.out.println("Длинна числа " + i + ": ");
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
        scanner.close(); 
    }
}
