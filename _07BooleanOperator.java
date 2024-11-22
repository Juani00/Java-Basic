// 10 - 11 -2024 || 20:21 PM

public class _07BooleanOperator {

    public static void main(String[] args) {

        /**
         * java memiliki operasi matematika dan juga operasi perbandingan
         *
         * operasi aritmatika/matematika, berisikan cara untuk melakukan hal layak nya yang ada pada matematika.
         * seperti :
         *  Tambah (+),
         *  KUrang (-),
         *  Kali  (berbeda dengan perkalian matematika dikehidupan nyata, perkalian pada program java memakai simbol bintang, '*' ),
         *  Bagi (/),
         *  Modulo / sisa pembagian (%)
         *
         *
         *  int data1 = 20;
         *  int data2 = 10;
         *
         *  int additionTwoData         = data1 + data2; // 30
         *  int subtractionTwoData      = data1 - data2; // 10
         *  int multiplicationTwoData   = data1 * data2; // 200
         *  int divisionTwoData         = data1 / data2; // 2
         *  int moduloTwoData           = data1 % data2; // 0
         *
         *
         *
         *
         * operasi perbandingan, merupakan operasi untuk membandingkan dua data
         * yang akan menghasilkan nilai benar(True) atau salah(False).
         *
         *  terdapat berbagai Operator perbandingan yang ada pada java
         *      >   : Lebih dari
         *      <   : Kurang dari
         *      >=  : Lebih dari, Sama dengan  ( jika nilai lebih dari atau sama dengan(kedua nilai sama, hasil akan True) )
         *      <=  : KUrang dari, Sama dengan ( jika nilai lebih dari atau sama dengan(kedua nilai sama, hasil akan True) )
         *      ==  : Sama dengan
         *      !=  : Tidak Sama dengan
         *
         *  int dataX = 100;
         *  int dataY = 100;
         *
         *  System.out.println(dataX > dataY); // Output : false
         *  System.out.println(dataX < dataY); // Output : false
         *  System.out.println(dataX >= dataY); // Output : true , kenapa true? karena terdapat '=' sama dengan
         *  System.out.println(dataX <= dataY); // Output : true , kenapa true? karena terdapat '=' sama dengan
         *  System.out.println(dataX == dataY); // Output : true
         *  System.out.println(dataX != dataY); // Output : false
         *
         *
         *
         */


        float number1 = 20.0f;
        float number2 = 10.0f;

        System.out.println(number1 + number2); // 30.0
        System.out.println(number1 - number2); // 10.0
        System.out.println(number1 * number2); // 200.0
        System.out.println(number1 / number2); // 2.0
        System.out.println(number1 % number2); // 0.0
                                               // kenapa 0?, karena hasil dari sisa pembagian 20 dengan 10, adalah tidak ada sisa
                                               // pembagian atau '0'.

        System.out.println( (number1 + 1) % number2); // Output = 1
                                                      // (20 + 1) % 10
                                                      // hasil sisa pembagian 21 dengan 10, memberikan sisa bagi yaitu 1



        int dataX = 100;
        int dataY = 100;
        boolean[] comparasionDataXwithDataY = {     //menyimpan operasi perbandingan dengan menggunakan Array Intializer
                dataX > dataY,
                dataX < dataY,
                dataX >= dataY,
                dataX <= dataY,
                dataX == dataY,
                dataX != dataY,
        };


        for (boolean compDataXwithDataY : comparasionDataXwithDataY) {  // memanggil operasi perbandingan yang disimpan tadi
                                                                        // dengan menggunakan for each.

            System.out.println(compDataXwithDataY);                     // Tampilkan data Array pada operasi perbandingan(comparasionDataXwithDataY)
                                                                        // yang disimpan kedalam variable comDataXwithDataY



        }









        /*
           Augmented Assigment, operasi yang melakukan perubahan pada nilai variable yang dimiliki secara efisien.

           terdapat variable yang ingin menambahkan value yang dimilikinya dengan value lain

           int numberWithValue10 = 10;
           numberWithValue10 = numberWithValue10 + 1;
           System.out.println(numberWithValue10); // Output 11

           dengan Augmented Assigment, baris nomor 68
           dapat dimodifikasi dengan cara yang lebih singkat yaitu dengan

           numberWithValue10 += 1;
           System.out.println(numberWithValue10); // Output 11

         */


        int numberWithValue10 = 10;
        numberWithValue10 = numberWithValue10 - 1;
        System.out.println(numberWithValue10); // Output : 9

        System.out.println(numberWithValue10 *= 5); // 9 x 5 ->  Output : 45


        /**
         *
         *  Operasi Boolean, operasi yang membandingkan dua data Boolean.
         *
         *      beberapa Operasi Boolean :
         *          && atau AND                 = jika salah satu nilai Boolean adalah false, maka hasil perbandingan yang ditampilkan adalah "False"
         *          || atau OR                  = jika salah satu nilai Boolean adalah True, maka hasil perbandingan yang akan ditampilkan adalah "True"
         *          !  atau Negation/Kebalikan  = jika nilai adalah false, maka hasil akan di negasi menjadi "True"
         *
         *      untuk mendapatkan nilai "True" dengan operator AND, kedua nilai harus bernilai "True"
         *      untuki mendapatkan nilai "True" dengan operator OR,  salah satu nilai harus bernilai "True"
         *
         *
         *  var absen = 75;
         *  var nilaiAkhir = 60;
         *
         *  boolean lulusAbsen = absen >= 75;       // true
         *  boolean lulusNIlai = nilaiAkhir >= 80; // false
         *
         *  var lulus = lulusAbsen && lulusNilai;
         *  System.out.println(lulus);              // Output:  false
         *
         *
         *
         */

        var absen = 75;
        var nilaiAkhir = 60;

        boolean lulusAbsen = absen >= 75;       // true
        boolean lulusNilai = nilaiAkhir >= 70;  // false

        var lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus);              // Output:  false

    }

}

