package lesson9;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        maxAndMinWord();
        searchWord();
        palindrome();
        duplicationLetters();
    }

    public static void maxAndMinWord() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String line = scan.nextLine();
        String[] array = line.split(" ");
        String minWord = array[0];
        String maxWord = array[0];

        for (String i : array) {
            if (i.length() > maxWord.length()) {
                maxWord = i;
            }
            if (i.length() < minWord.length()) {
                minWord = i;
            }
        }
        String lastMinWord = line.substring(line.lastIndexOf(minWord), line.lastIndexOf(minWord) + minWord.length());
        String lastMaxWord = line.substring(line.lastIndexOf(maxWord), line.lastIndexOf(maxWord) + maxWord.length());

        System.out.println("Самое короткое слово: " + lastMinWord);
        System.out.println("Самое длинное слово: " + lastMaxWord);
    }

    public static void searchWord() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String line = scan.nextLine();
        String[] array = line.split(" ");
        String resalt = array[0];
        int countResalt = 0;
        for (String i : array) {
            char[] arrayChar = i.toCharArray();
            int count = 0;
            for (char j : arrayChar) {
                int countChar = 0;
                for (char k : arrayChar) {
                    if (j == k) {
                        countChar++;
                    }
                }
                if (count < countChar) {
                    count = countChar;
                }
            }
            if (countResalt < count) {
                countResalt = count;
                resalt = i;
            }
        }
        System.out.println(resalt);
    }

    public static void palindrome() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String line = scan.nextLine();
        String[] array = line.split(" ");
        System.out.println("Введите номер слово, которое хотите проверить: ");
        int num = scan.nextInt();
        if (num > array.length) {
            System.out.println("Вы вышли за предел количества слов");
        } else {
            StringBuilder word = new StringBuilder(array[num - 1]);
            if (array[num - 1].contentEquals(word.reverse())) {
                System.out.println("Слово является полиндромом");
            } else {
                System.out.println("Слово не является полиндромом");
            }
        }
    }

    public static void duplicationLetters() {
        String line = "Hello world";
        StringBuilder newline = new StringBuilder();
        char[] arrayChar = line.toCharArray();
        for (char i : arrayChar) {
            if (i == ' ') {
                newline.append(i);
            } else {
                newline.append(i);
                newline.append(i);
            }
        }
        System.out.println(newline);
    }

}
