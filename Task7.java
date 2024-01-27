package Task2;

import java.util.Scanner;

public
    class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print
                (
                        "Введите целое положительное число: "
                );
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до " + n + " равна " + sum);

    }
        
}
