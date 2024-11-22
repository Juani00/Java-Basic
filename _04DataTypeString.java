// Oct 26 , 2024 | 21:06

import java.util.StringJoiner;

public class _04DataTypeString {
    public static void main(String[] args) {

        String iniText = "ini adalah text!";
        System.out.println(iniText);

        char iniChar = 'A';
        String menggabungkanCharDanString = "KU, Juani";
        System.out.println(iniChar + menggabungkanCharDanString);

        String message = String.join("_", "Juani", "Kece", "Abiez");
        System.out.println(message);
    }
}
