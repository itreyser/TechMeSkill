package lesson3;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SingleArray {


    public static void searchInArray() {
        int[] array = new int[10];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt();
        }
        Scanner scan = new Scanner(System.in);
        System.out.println(Arrays.toString(array));
        System.out.println("Введите число, которое хотите найти в массиве: ");
        int input = scan.nextInt();
        boolean flag = false;
        for (int j : array) {
            if (j == input) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Ваше число найдено в массиве!");
        } else {
            System.out.println("Ваше число не найдено в массиве!");
        }
    }

    public static void removeInArray() {
        int[] array = new int[20];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt();
        }
        Scanner scan = new Scanner(System.in);
        System.out.println(Arrays.toString(array));
        System.out.println("Введите число, которое хотите удалить в массиве: ");
        int input = scan.nextInt();
        boolean found = false;
        for (int j : array) {
            if (j == input) {
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Такое число не найдено в массиве.");
        } else {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] != input) {
                    array[count] = array[i];
                    count++;
                }
            }
            int[] newArray = Arrays.copyOf(array, count); // создаем новый массив без удаленных элементов
            System.out.println("Новый массив без числа " + input + ": " + Arrays.toString(newArray));
        }
    }


    public static void createArrayAndFind() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        double[] array = new double[scan.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        double min = array[0];
        double max = array[0];
        double counter = 0;
        for (int i = 0; i < array.length; i++) {
            counter += array[i];
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.printf("Максимальное значение: %f, минимальное значение %f и среднее значением - %f", max, min, counter / array.length);
    }

    public static void createTwoArrays() {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            array1[i] = r.nextInt();
            array2[i] = r.nextInt();
        }
        double counter1 = 0;
        double counter2 = 0;
        for (int i = 0; i < 5; i++) {
            counter1 += array1[i];
            counter2 += array2[i];
        }
        double res1 = counter1 / 5;
        double res2 = counter2 / 5;
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        if (res1 > res2) {
            System.out.println("Среднее арифмитическое значение суммы значений массива 1 больше");
        } else if (res1 < res2) {
            System.out.println("Среднее арифмитическое значение суммы значений массива 2 больше");
        } else {
            System.out.println("Их сердне арифметические значения равны");
        }
    }

    public static void singleArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scan.nextInt();
        while (size < 6 || size > 10) { // проверка, что ввели размер массива в интервале от 6 до 10
            System.out.println("Размер массива должен быть от 6 и до 10 включительно");
            size = scan.nextInt();
        }
        int[] array = new int[size];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt();
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[count] = array[i];
                count++;
            }
        }
        int[] newArray = Arrays.copyOf(array, count);
        System.out.println(Arrays.toString(newArray));

    }

    public static void createAndReplaceInArray() {
        int[] array = new int[10];
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            array[i] = r.nextInt();
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }
        System.out.println();
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
