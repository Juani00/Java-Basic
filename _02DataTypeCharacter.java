// oct 20 | 2024 | 21:47 Pm
public class _02DataTypeCharacter {

    public static void main(String[] args) {
        char thisCharacterA = 'A';
        char thisCharacterWithValueNumber = '5';

        System.out.println(thisCharacterA);
        System.out.println(thisCharacterWithValueNumber);

        // menggunakan char, untuk menyimpan nilai karakter unicode untuk menghasilkan simbol
        char unicodeChar = '\u03A0';
        System.out.println(unicodeChar);

        // mengecheck apakah value pada variable char, merupakan angka(true) atau huruf(false)..
        // jika value character bukan termasuk digit/angka, false
        // kalau benar, Character adalah angka, true
        if (!Character.isDigit(thisCharacterWithValueNumber)) {
            System.out.println(false + " , [" + thisCharacterWithValueNumber + "] is not a number");
        } else {
            System.out.println(true + " , [" + thisCharacterWithValueNumber + "] is a number");
        }
        System.out.println(Character.isDigit(thisCharacterWithValueNumber));



        // operasi pertambahan pada tipe data character
        char nextCharValue = 'A' + 1;
        System.out.println(nextCharValue);

        char nextCharValue2 = '1' + 1;
        System.out.println(nextCharValue2);
    }

}
