package dodatki;

import java.util.Scanner;

public class YourValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imię");

        String name = scanner.nextLine();
        char[] letters = new char[name.length()];

        for(int i =0;i<name.length();i++) {
            letters[i]=name.charAt(i);
        }

        int value=0;
        for(char letter:letters) {
            value+=letter;
        }

        System.out.println("Twoja wartość wynosi: "+ value);
    }
}
