package lesson2;

import java.util.Scanner;

public class Cycles {

    public static void runningMethods() {
        unnumberedNumbers();
        sumOfNumbers();
        subsequence();
        squareNumber();
    }

    public static void unnumberedNumbers() {
        System.out.println("Нечетные числа: ");
        for (int i = 1; i <= 99; i = i + 2) {
            System.out.print(i + " ");
        }
    }

    public static void sumOfNumbers() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите положительное число: ");
        int num = scan.nextInt();
        int counter = 0;
        for (int i = 1; i <= num; i++) {
            counter += i;
        }
        String text = String.format("Сумма чисел от 1 до %d равна ", num);
        System.out.printf(text + counter);
    }

    public static void subsequence(){
        System.out.println("Последовательность цифр от 7 до 98:");
        int i = 7;
        while (i <= 98){
            System.out.print(i + " ");
            i += 7;
        }
    }

    public static void squareNumber(){
        for (int i = 10; i <= 20; i++) {
            int square = i * i;
            System.out.println("Квадрат числа " + i + ": " + square);
        }
    }


}
