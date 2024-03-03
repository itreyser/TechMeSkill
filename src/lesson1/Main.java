package lesson1;

import lesson2.Addition;
import lesson2.Conditionals;
import lesson2.Cycles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        firstExercise(12, 4);
        secondExercise();
        thirdExercise();
        Conditionals.runningMethods();
        Cycles.runningMethods();
        Addition.runningMethods();
    }

    public static void firstExercise(int a, int b) {

        System.out.println("Результат деления двух чисел: " + a / b);
        System.out.println("Результат остатка от деления двух чисел: " + a % b);
    }


    public static void secondExercise() {
        System.out.println("Пожалуйста, введите 3 числа: ");
        Scanner num = new Scanner(System.in);
        int counter = 1;
        for (int i = 0; i < 3; i++) {
            counter *= num.nextInt();
        }
        System.out.println("Результат умножения: " + counter);
    }

    public static void thirdExercise() {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        System.out.println(num.nextInt() == num.nextInt());

    }
}

