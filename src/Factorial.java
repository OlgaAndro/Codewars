import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое положительное число: ");
        int number = scanner.nextInt();
        long factorial = 1;
        if (number < 0) {
            System.out.println("Ошибка! Число должно быть положительным!");
        } else {
            for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
            System.out.println("Факториал числа " + number + " равен: " + factorial);
        }

        scanner.close();
    }


}