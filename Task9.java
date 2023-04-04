package Task2;

public
    class Task9 {
    public static void main(String[] args) {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println(c + " - " + (int)c);
        }
        System.out.println("==============");
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println(c + " - " + (int)c);
        }
        System.out.println("==============");
        for (char c = '0'; c <= '9'; c++) {
            System.out.println(c + " - " + (int)c);
        }
        System.out.println();
        System.out.print("Пробел - " + (int)' ');
        System.out.println();
        System.out.print("Символ новой строки - " + (int)'\n');
    }
}
