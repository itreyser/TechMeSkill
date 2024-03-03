package lesson2;


import java.util.Scanner;

public class Conditionals {


    public static void runningMethods() {
        seasons();
        findSeasons();
        numberCheck();
        temperature();
        rainbow();
    }


    public static void seasons() {
        System.out.println("Введите номер месяца: ");
        Scanner scan = new Scanner(System.in);
        switch (scan.nextInt()) {
            case 12, 1, 2:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Неверный номер месяца");
        }

    }

    public static void findSeasons() {
        System.out.println("Введите номер месяца: ");
        Scanner scan = new Scanner(System.in);
        int numberOfSeason = scan.nextInt();

        if (numberOfSeason == 12 || numberOfSeason == 1 || numberOfSeason == 2) {
            System.out.println("Зима");
        } else if (numberOfSeason == 3 || numberOfSeason == 4 || numberOfSeason == 5) {
            System.out.println("Весна");
        } else if (numberOfSeason == 6 || numberOfSeason == 7 || numberOfSeason == 8) {
            System.out.println("Лето");
        } else if (numberOfSeason == 9 || numberOfSeason == 10 || numberOfSeason == 11) {
            System.out.println("Осень");
        } else {
            System.out.println("Неверный номер месяца");
        }


    }

    public static void numberCheck() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число для проверки четности: ");
        int qwe = scan.nextInt();
        if (qwe % 2 == 0) {
            System.out.println("Четное число");
        } else {
            System.out.println("Нечетное число");
        }

    }

    public static void temperature() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите температуру на улице, t: ");
        int t = scan.nextInt();
        if (t > -5) {
            System.out.println("Тепло");
        } else if (t <= -20) {
            System.out.println("Холодно");
        } else {
            System.out.println("Нормально");
        }
    }

    public static void rainbow() {
        System.out.println("Введите число в диапазоне от 1 до 7: ");
        Scanner scan = new Scanner(System.in);
        switch (scan.nextInt()) {
            case 1:
                System.out.println("Красный");
                break;
            case 2:
                System.out.println("Оранжевый");
                break;
            case 3:
                System.out.println("Желтый");
                break;
            case 4:
                System.out.println("Зеленый");
                break;
            case 5:
                System.out.println("Голубой");
                break;
            case 6:
                System.out.println("Синий");
                break;
            case 7:
                System.out.println("Фиолетовый");
                break;
            default:
                System.out.println("Число вне диапазона");
        }
    }

}


