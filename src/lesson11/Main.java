package lesson11;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputAndSum();
        searchAndDel();
    }


    public static void inputAndSum() {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int num;
        System.out.println("Введите положительные числа (для завершения введите отрицательное число):");
        while (true) {
            if (scan.hasNextInt()) {
                num = scan.nextInt();
                if (num < 0) {
                    break;
                }
                sum += num;
            } else {
                scan.next();
            }
        }
        System.out.println("Сумма введенных чисел: " + sum);
    }

    public static void searchAndDel() {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>(7);
        for (int i = 0; i < 7; i++) {
            list.add(scan.nextInt());
        }
        List<Integer> listDel = new ArrayList<>();
        for (Integer i : list) {
            int counter = 0;
            for (Integer j : list) {
                if (Objects.equals(i, j)) {
                    counter++;
                }
            }
            if (counter > 1) {
                if (!listDel.contains(i))
                    listDel.add(i);

            }
        }
        list.removeAll(listDel);
        System.out.println(list);
    }
}
