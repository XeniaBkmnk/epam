package Task2;

public
    class Task2 {
    public static void main(String[] args) {
        double b , a, c;
        b=11;
        a=11;
        c=1;
        double Answer = b + Math.sqrt(Math.pow(b, 2) + 4 * a * c) / 2 * a - (Math.pow(a, 3)) * c + (Math.pow(b, -2));
        System.out.println("Task 2");
        System.out.println((int)Answer);
    }
}
