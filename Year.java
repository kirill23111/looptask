import java.util.Scanner;

public class Year {
    public static int checkYear(int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) ? 366 : 365;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterationCount = 0;

        while(true) {
            System.out.println("Введите год в формате yyyy : ");
            int year = scanner.nextInt();

            System.out.println("Введите количество дней: ");
            int day = scanner.nextInt();

            int isCorrect = checkYear(year);
            if(day == isCorrect) {
                iterationCount++;
                System.out.println("Верно");
            } else {
                System.out.println("Неправильно! В этом году " + isCorrect + "дней!");
                System.out.println("Количество успешных вводов: " + iterationCount);
                break;
            }
        }

    }
}
