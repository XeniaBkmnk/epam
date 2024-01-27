package Task2;

public
    class Task4 {
    public static void main(String[] args) {
        double R=123.876;
        double S= (R*1000) % 1000 + (int)R/1000.0;
        System.out.println(S);
    }
}
