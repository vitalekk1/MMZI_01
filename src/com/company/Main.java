package com.company;


import java.util.Scanner;

public class Main {

    private static String fio;
    private static String keyWord;
    private static String keyWordNotRepeat = new String();
    private static String enFIO = new String();
    private static final String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    private static String alphabetChange = new String();

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            fio = scanner.nextLine().toLowerCase();
            keyWord = scanner.nextLine().toLowerCase();
            scanner.close();
        }catch (Exception ex){System.out.println(ex);}

        for (int i = 0; i < fio.length(); i++) {
            if (!alphabet.contains(String.valueOf(fio.charAt(i)))) {
                System.out.println("Некорректный ввод!!!");
                System.exit(0);
            }
        }

        for (int i = 0; i < keyWord.length(); i++) {
            if (!alphabet.contains(String.valueOf(keyWord.charAt(i)))) {
                System.out.println("Некорректный ввод!!!");
                System.exit(0);
            }
        }

        for (int i = 0; i < keyWord.length(); i++) {
            if (!keyWordNotRepeat.contains(String.valueOf(keyWord.charAt(i)))) {
                keyWordNotRepeat += String.valueOf(keyWord.charAt(i));
            }
        }
        
        alphabetChange = keyWordNotRepeat;

        for (int i = 0; i < alphabet.length(); i++) {
            if (!keyWordNotRepeat.contains(String.valueOf(alphabet.charAt(i)))) {
                alphabetChange += String.valueOf(alphabet.charAt(i));
            }
        }

        int index;

        for (int i = 0; i < fio.length(); i++) {
            index = alphabet.indexOf(fio.charAt(i));
            enFIO += String.valueOf(alphabetChange.charAt(index));
        }
        
        System.out.println(alphabetChange);
        System.out.println(fio);
        System.out.println(enFIO);
    }
}
