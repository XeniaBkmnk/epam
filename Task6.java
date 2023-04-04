package Task2;

import java.util.Scanner;

public
    class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println
                (
                        "Введите угол 1 (в градусах): "
                );
        int angle1 = scanner.nextInt();

        System.out.println
                (
                        "Введите угол 2 (в градусах): "
                );

        int angle2 = scanner.nextInt();

        System.out.println
                (
                        "Введите координату x: "
                );

        double x = scanner.nextDouble();

        System.out.println
                (
                        "Введите координату y: "
                );

        double y = scanner.nextDouble();

        boolean isInArea = false;
        if (angle1 + angle2 < 180) {// проверка на существование треугольника

            if ((x >= 0 && x <= 1) && (y >= 0 && y <= 1 - x)) { // проверка на принадлежность области
                isInArea = true;
            }
        }
        System.out.println("---1---");
        System.out.println(isInArea);



        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите a:");
        int a = scanner2.nextInt();
        System.out.println("Введите b:");
        int b = scanner2.nextInt();
        System.out.println("Введите c:");
        int c = scanner2.nextInt();
        System.out.println("Введите d:");
        int d = scanner2.nextInt();
        int result = Math.max(Math.min(a, b), Math.min(c, d));
        System.out.println("---2---");
        System.out.println(result);



        Scanner scanner3 = new Scanner(System.in);
        System.out.println
                (
                        "Введите координату x1:"
                );
        double x1 = scanner3.nextDouble();
        System.out.println
                (
                        "Введите координату y1:"
                );
        double y1 = scanner3.nextDouble();
        System.out.println
                (
                        "Введите координату x2:"
                );
        double x2 = scanner3.nextDouble();
        System.out.println
                (
                        "Введите координату y2:"
                );
        double y2 = scanner3.nextDouble();
        System.out.println
                (
                        "Введите координату x3:"
                );
        double x3 = scanner3.nextDouble();
        System.out.println
                (
                        "Введите координату y3:"
                );
        double y3 = scanner3.nextDouble(); //areOnOneLine - на одной лин находятся
        boolean areOnOneLine = false;
        if ((y3 - y2) * (x2 - x1) == (y2 - y1) * (x3 - x2)) { // проверка на расположение на одной прямой
            areOnOneLine = true;
        }
        System.out.println("---3---");
        System.out.println(areOnOneLine);


        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Введите ширину отверстия:");
        double a1 = scanner4.nextDouble();
        System.out.println("Введите высоту отверстия:");
        double b1 = scanner4.nextDouble();
        System.out.println("Введите ширину кирпича:");
        double q = scanner4.nextDouble();
        System.out.println("Введите высоту кирпича:");
        double w = scanner4.nextDouble();
        System.out.println("Введите длину кирпича:");
        double z = scanner4.nextDouble();
        boolean canPass = false;
        if (
                (q <= a1 && w <= b1) || (q <= b1 && w <= a1) ||
                (q <= a1 && z <= b1) || (q <= b1 && z <= a1) ||
                (w <= a1 && z <= b1) || (w <= b1 && z <= a1))
        { // проверка на проходимость
            canPass = true;
        }
        System.out.println("---4---");
        System.out.println(canPass);

    }
}
