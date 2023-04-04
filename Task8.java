package Task2;

import java.util.Scanner;

public
    class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число e: ");
        double e = input.nextDouble();
        double an=0;
        double sum = 0;
        int n = 1;
        do {
            an = 1.0 / Math.pow(2, n) + 1.0 / Math.pow(3, n);
            if (Math.abs(an) >= e) {
                sum += an;
            }
            n++;
        }while (Math.abs(an)>=e);
        System.out.println("Сумма членов ряда, модуль которых больше или равен " + e + " равна " + sum);
    }
}
