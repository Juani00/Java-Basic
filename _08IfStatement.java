// 11 - 11 - 2024 | 22:02

import java.util.Arrays;

public class _08IfStatement {
    public static void main(String[] args) {

    /**
     * if statement, merupakan cara yang dipakai untuk melakukan percabangan.
     *
     * percabangan yaitu proses menjalankan kode program tertentu, ketika suatu kondisi terpenuhi
     *
     * terpenuhi artinya, jika kondisi perintah sesuai dengan perintah yang ada pada nilai percabangan
     * maka sebuah proses kode akan dijalankan.
     *
     * int a = 0;
     *
     * if (a < 1) {
     *  System.out.println(a);  // output : 0
     *
     * kondisi perintah if di atas, akan menghasilkan nilai "True",
     * karena 0 kurang dari 1.
     *
     * maka proses kode untuk menampilkan variable a yang berisikan angka 0, akan ditampilkan.
     * int a = 0;
     *
     * if (a > 1) {
     * System.out.println(a);  // output : (tidak menampilkan apa-apa / blank) karena
     *                         //           hasil kondisi "tidak terpenuhi".
     */

        int a = 0;

        if (a < 1) System.out.println(a); // Output : 0


        String text1 = "Java";
        String text2 = "JavA";

        if (text1 == text2) {
            System.out.println("Hello, i love java"); // kondisi bernilai False, maka perintah println tidak di eksekusi.
        }


    /**
     *  pada if, terdapat sebuah operator sederhana yang bernama "Ternary Operator"
     *  ternary operator terdiri dari kondisi yang dievaluasi/pengecekan, yang dimana
     *  jika menghasilkan kondisi true, maka nilai pertama akan dijalankan
     *  jika kondisi false, nilai kedua akan dijalankan.
     *
     *  membuat Ternary operator =
     *
     *  nama variable = kondisi : value ? value
     *
     *  boolean tru = true;
     *  boolean fals = false;
     *  String isTrue = tru == fals ? "same" : "not same";
     *  System.out.println(isTrue);                         // Output : not same (false)
     *
     */

        // dengan ternary
        boolean tru = true;
        boolean fals = false;
        String isTrue = tru == fals ? "same" : "not same";
        System.out.println(isTrue);

        // tanpa ternary
        if (tru == fals) {
            System.out.println("same");
        } else {
            System.out.println("Not same");               // block else, will be as Output
        }


        System.out.println(a <= 0 ? a + 1 : a);     // output : 1
    }
}

/*

0
not same
Not same
1

Process finished with exit code 0


*/