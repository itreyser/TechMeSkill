package lesson9;

import java.util.Scanner;

import static lesson9.SecondTask.searchWord;

public class Main {


    public static void main(String[] args) {
        maxAndMinWord();
        palindrome();
        searchWord();
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
            if (i.length() >= maxWord.length()) {
                maxWord = i;
            }
            if (i.length() <= minWord.length()) {
                minWord = i;
            }
        }

        System.out.println("Самое короткое слово: " + minWord);
        System.out.println("Самое длинное слово: " + maxWord);
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
