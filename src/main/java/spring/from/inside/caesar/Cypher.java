package spring.from.inside.caesar;

import java.util.LinkedList;
import java.util.List;

public class Cypher {

    private static String encrypt(String text, int size) {

        char[] chars = text.toCharArray();
        List<Integer> integerList = new LinkedList<>();


        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] + size);
        }

        return String.copyValueOf(chars);
    }

    private static String decrypt(String text, int size) {

        char[] chars = text.toCharArray();
        List<Integer> integerList = new LinkedList<>();


        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] - size);
        }

        return String.copyValueOf(chars);
    }

    private static int count(int num) {

        int counter = 1;
        while (num > 10) {
            num = num / 10;
            counter++;
        }
        return counter;

    }

    public static void main(String[] args) {

        System.out.println("Encryption of your text ");
        System.out.println(encrypt("Salam", 3));
        System.out.println("******************************");
        System.out.println("Decryption : ");
        System.out.println(decrypt("Vdodp", 3));
        System.out.println("******************************");
        System.out.println(count(1234));
    }

}
