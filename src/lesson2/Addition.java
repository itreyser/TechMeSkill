package lesson2;

import java.util.Scanner;

public class Addition {

    public static void runningMethods() {

        fibonacci();
        depositAmount();
        multiplicationTable();
    }

    public static void fibonacci() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько вывести чисел Фиббоначи? Введите в консоль: ");
        int num = scan.nextInt();
        int firstNum = 0;
        int secondNum = 1;
        System.out.printf("Первые %d чисел/ла Фиббоначи: ", num);
        for (int i = 0; i < num; i++) {
            System.out.print(firstNum + " ");
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }

    public static void depositAmount() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        float amount = scan.nextFloat();
        System.out.println("Введите количество месяцев: ");
        int month = scan.nextInt();

        for (int i = 0; i < month; i++) {
            float interest = amount * 0.07f;
            amount = interest + amount;

        }
        System.out.println("Конечная сумма вклада:  " + amount);
    }

    public static void multiplicationTable() {
        System.out.println("Таблица умножения: ");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(j * i + "\t");
            }
            System.out.println();
        }

    }

}
