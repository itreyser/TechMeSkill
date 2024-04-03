package lesson9;

import java.util.Scanner;

public class SecondTask {


    public static void searchWord() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String line = scan.nextLine();
        String[] array = line.split(" ");
        String minUniqueWord = "";
        int minUniqueChars = Integer.MAX_VALUE;
        for (String i : array) {
            int uniqueChars = countUniqueChar(i);
            if (uniqueChars < minUniqueChars) {
                minUniqueChars = uniqueChars;
                minUniqueWord = i;
            }
        }
        System.out.println(minUniqueWord);
    }

    public static int countUniqueChar(String word){
        int[] count = new int[256];
        for (int i = 0; i < word.length(); i++) {
            count[word.charAt(i)]++;
        }
        int uniqueChars = 0;
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                uniqueChars++;
            }
        }
        return uniqueChars;
    }
}
