// 16 - 11 - 2024 | 19:53

import java.sql.SQLOutput;

public class _09SwitchStatement {

    // layaknya if-satement, hanya saja Switch digunakan untuk hal sederhana
    // seperti untuk perbandingan ==.

    /**
     *  dibanding menggunakan if untuk mengecek apakah suatu data sama ==?
     *
     *  String nilai = "A";
     *
     *  if (nilai == "A") {
     *      print("Selamat, anda mendapatkan nilai sempurna");
     *  } else if ( nilai == "B") {
     *      print("Selamat, anda mendapatkan nilai yang cukup baik");
     *  } else if ( .... ) {
     *
     *  } ...
     *    ...
     *  else {
     *
     *  }
     *
     *
     *  dengan menggunakan "Swtich Statement", dapat menjadi lebih sederhana dan singkat
     *
     *  switch(nilai) {
     *      case "A" :
     *        print("Selamat, anda mendapatkan nilai sempurna");
     *        break;
     *      case "B" :
     *        print("Selamat, anda mendapatkan nilai yang cukup baik");
     *        break;
     *      case "C" :
     *        ....
     *        ...
     *      default :
     *        ....
     *
     *
     *   pada switch-statement, kata kunci "default" dipakai sebagai representasi/perwakilan kata kunci
     *   "else" yang ada pada if-statement
     *
     *   dan setelah menjalankan suatu kondisi, perlu menambahkan kata kunci "break" diakhir kondisi.
     *
     *   jika tidak ada "break", setelah menjalankan kondisi yang bernilai "true"
     *   maka program akan lanjut menjalankan kondisi selanjutnya, meskipun kondisi tersebut tidak sesuai
     *   dengan yang diminta.
     *
     *   int number = 1;
     *   switch(number) {
     *      case 1 :
     *          print("Selamat, anda mendapatkan nilai sempurna");
     *      case 2 :
     *          print("Selamat, anda mendapatkan nilai yang cukup baik");
     *   }
     *
     *   contoh diatas, jika kondisi pengecekan case pertama (1) bernilai true,
     *   saat kode program yang ada didalam case 1 dijalankan, maka program akan melanjutkan
     *   kondisi yang ada dibawah nya..  case 2, akan ditampilkan juga.
     *
     *   Hasil output :
     *
     *   Selamat, anda mendapatkan nilai sempurna
     *   Selamat, anda mendapatkan nilai yang cukup baik
     */

    public static void main(String[] args) {

        String nilai = "E";

        // memangil variable, dan mengecek variable pada kondisi switch
        // "jika nilai pada swtich sama dengan case/kondisi yang diminta, maka tampilkan ... "

        switch (nilai) {
            case "A":
                System.out.println("Selamat, Anda lulus dengan baik");
                break;
            case "B":
                System.out.println("Lumayan, nilai anda cukup memuaskan");
                break;

            /*
                jika memiliki dua kondisi yang sama dalam satu kondisi
                dapat dengan menggabungkan nya kedalam satu case.
                seperti contoh =

                case "C", "D" :
                    System.out.println(.......);

                atau

                case "C":
                case "D":
                    System.out.println(.......);

            */
            case "C", "D":
                System.out.println("Maaf, anda tidak lulus!");
                break;
            default:
                System.out.println("Mungkin anda salah jurusan");

        }


        /**
         *  pada java 14, diperkenalkan swtich dengan lambda
         *  yang dimana dengan lambda (tanda "->") pembuatan switch menjadi lebih mudah dan tidak
         *  perlu menggunakan kata kunci "break"
         *
         *  dan, jika terdapat lebih dari satu proses didalam case, dapat menggunakan block { }
         *
         *
         *  selain itu, terdapat juga kata kunci "yield",
         *  yield, sama seperti return.
         *
         *  yaitu mengembalikan data pada switch dan tidak perlu menuliskan variable secara berulang.
         *
         *
         */

        var data = 5;
        switch (data) {
            case 1 -> System.out.println(data);
            case 2 -> System.out.println(data);
            case 3 -> System.out.println(data);
            default -> {
                System.out.print("data not in list : ");
                System.out.println(data);
            }
        }


        // Tanpa yield
        String name = "";
        String displayName;
        switch (name) {
            case "juani" -> displayName = "Hello, " + name;
            case "Luffy" -> displayName = "Hello, " + name;
            case "Drasta" -> displayName = "Hello, " + name;
            default -> displayName = "Empty Data [Name has not been entered]";
        }
        System.out.println(displayName);

        // Menggunakan yield
        String name1 = "juani";
        String displayName1 = switch (name1) {
            case "juani":
                yield "Hello, " + name1;
            case "Luffy":
                yield "Hello, " + name1;
            case "Drasta":
                yield "Hello, " + name1;
            default:
                yield "Empty Data [Name has not been entered]";
        };
        System.out.println(displayName1);

        /**
         *  dengan yield, tidak perlu menuliskan nama variable "displayName".. yang sama
         *  secara berulang-ulang setiap pengecekan kondisi
         */


    }

}

/*
output :

Mungkin anda salah jurusan
data not in list : 5
Empty Data [Name has not been entered]
Hello, juani

Process finished with exit code 0

 */



