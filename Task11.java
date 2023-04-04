package Task2;

public
    class Task11 {
    public static void main(String[] args) {

        int num1=17945;
        int num2=65490;
//String.valueOf-эта метода превращает числа в строки
        String str1 = String.valueOf(num1);
        String str2 = String.valueOf(num2);

// Создадим массивы для хранения цифр чисел
        int[] digits1 = new int[str1.length()];
        int[] digits2 = new int[str2.length()];

// Заполним массивы цифрами чисел
        for (int i = 0; i < str1.length(); i++) {
            digits1[i] = Character.getNumericValue(str1.charAt(i));
        }

        for (int i = 0; i < str2.length(); i++) {
            digits2[i] = Character.getNumericValue(str2.charAt(i));
        }

// Выведем цифры первого числа
        System.out.print("Цифры первого числа: ");
//for(int i=0; i<digits1.lenght;i++)
//int digit = digits1[i];
        for (int digit : digits1) {
            System.out.print(digit + " ");
        }

// Выведем цифры второго числа
        System.out.print("\nЦифры второго числа: ");
//for(int j=0; j<digits2.lenght;j++)
//int digit = digits2[j];
        for (int digit : digits2) {
            System.out.print(digit + " ");
        }
    }
}
