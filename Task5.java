package Task2;
import java.util.Scanner;

public
    class Task5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Wpisz dulgosc czasa w sec: ");
        int TimeSec=scanner.nextInt();
        int Hors =TimeSec/3600;
        int min =(TimeSec&3600)/60;
        int sec= TimeSec%60;
        System.out.printf("%02dH %02dmin %02dsec",Hors,min,sec);


    }
}
