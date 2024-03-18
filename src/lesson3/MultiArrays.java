package lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MultiArrays {

    public static void chessBoards() {
        String[][] array = new String[8][8];
        for (int i = 1; i < array.length + 1; i++) {
            for (int j = 1; j < array.length + 1; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("W");
                else
                    System.out.print("B");
            }
            System.out.println();
        }
    }

    public static void sumArrays() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество вложенных массивов: ");
        int n = scan.nextInt();
        System.out.println("Введите количество значений во вложенных массивах: ");
        int m = scan.nextInt();
        int[][] array = new int[n][m];
        Random num = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = num.nextInt();
            }
        }
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result += array[i][j];
            }
        }
        System.out.println(result);

    }

    public static void diagonalArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество вложенных массивов: ");
        int n = scan.nextInt();
        System.out.println("Введите количество значений во вложенных массивах: ");
        int m = scan.nextInt();
        int[][] array = new int[n][m];
        Random num = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = num.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || (m - i - 1 == j))
                    System.out.print(array[i][j]);
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }

    public static void sortingArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество вложенных массивов: ");
        int n = scan.nextInt();
        System.out.println("Введите количество значений во вложенных массивах: ");
        int m = scan.nextInt();
        int[][] array = new int[n][m];
        Random num = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = num.nextInt();
            }
        }
        for (int[] i : array) {
            Arrays.sort(i);
            System.out.println(Arrays.toString(i));
        }
    }
}
