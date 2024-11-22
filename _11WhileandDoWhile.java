// 17 - 11 - 2024 | 19:49

public class _11WhileandDoWhile {

    /**
     * While, perulangan yang hanya berisikan pengecekan kondisi
     * tanpa init dan post statement.
     *
     *  while (kondisi) {
     *     ...
     *  }
     *
     *  int score = 90;
     *
     *  while (score > 75) {
     *      System.out.println("Selamat, anda lulus");
     *  }
     *
     *
     *
     * Do While, sama seperti While
     * hanya saja pada do while, proses dijalankan terlebih dahulu kemudian di check kondisi nya
     *
     *
     * jika pada for loop statement, kondisi yang diterima bernilai false
     * hasil dari kondisi, tidak akan menampilkan apapun.
     *
     * pada do while, hasil dari kondisi yang diterima
     * akan dijalankan satu kali, meskipun hasil dari kondisi yang di terima bernilai False.
     *
     *  do {
     *      System.out.println("Selamat, anda lulus");
     *  } while (score < 74)
     *
     *
     *
     *
     */

    public static void main(String[] args) {

        var counter = 1;

        while (counter <= 10) {
            System.out.print(counter++ + " ");
        }


        System.out.println(); // membuat baris baru
        counter = 1;    // merubah data counter yang tadi nya 10 setelah perulangan while, menjadi 1




        do {
            System.out.print(counter++ + "");      // kondisi false, namun kode masih tetap dijalankan hanya sekali
        } while (counter > 10);                 // menampilkan output : 1

    }
}

/*

Output :

1 2 3 4 5 6 7 8 9 10
1
Process finished with exit code 0


 */
