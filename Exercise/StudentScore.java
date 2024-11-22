package Exercise;

// 11 - 11 - 2024 | 21:01


public class StudentScore {

    public static void main(String[] args) {
        // membuat kumpulan data yang berisikan,
        // nama dan hasil nilai belajar dari daftar nama yang dibuat didalam array

        String[] listOfStudentName = {"Juani", "Byork", "Stella", "Doflamingo"}; // daftar nama pelajar
        byte[] listOfStudentScore = {75, 59, 100, 41}; // hasil nilai belajar


        // menampilkan daftar nama dan nilai yang tersimpan didalam array, dengan for-loop

        /**
         *  setiap nilai getListStudentNameAndScore berangka/mulai dari 0;
         *  dan getListStudentNameAndScore (0) kurang dari panjang dataArray listOfStudentName (3);
         *  maka tambahkan getListStudentNameAndScore (0), sampai dengan ukuran data_Array yang ada didalam listOfStudentName
         *
         *  lalu masukan ukuran data_Array yang ada didalam listOfStudentName ("Juani", "Byork", ...")
         *  kedalam variable getListStudentNameAndScore
         *
         *  variable listOfStudentScore yang berisikan data_Array nilai, kemudian
         *  gabungkan kembali bersamaan dengan data_Array listOfStudentName yang telah ada di dalam variable getListStudentNameAndScore
         *
         *  lalu tampilkan.
         */

        for (int getListStudentNameAndScore = 0; getListStudentNameAndScore < listOfStudentName.length; getListStudentNameAndScore++) {
            System.out.println(listOfStudentName[getListStudentNameAndScore] + " mendapatkan nilai = " + listOfStudentScore[getListStudentNameAndScore]);


            /**
             * jika nilai yang di peroleh, lebih dari atau sama dengan 90. maka tampilkan memperoleh Nilai A
             * selain itu jika kondisi pertama pada bagian "If" tidak terpenuhi,
             * maka periksa apakah nilainya sama dengan data yang diminta?
             *
             * jika tidak, maka lanjutkan periksa kondisi else if berikutnya..
             *
             * sampai dengan, jika tidak ada kondisi lain yang terpenuhi/sesuai dengan data yang diminta
             * maka jalankan proses pada bagian else
             *
             *
             *
             * jika, nilai sesuai dengan kondisi pada blok "If", bagian isi "If" akan dijalankan/diproses.
             * jika, nilai tidak sesuai dengan kondisi pada blok "if", maka bagian isi blok "else-if" akan dijalankan.
             *
             * jika, terdapat dua kondisi dengan "else-if", dan pada blok "else-if" pertama kondisi nya tidak sesuai
             *       dengan yang diminta, maka blok "else-if" kedua akan dijalankan.
             *
             * jika, semua blok "if" dan "else-if" tidak sesuai dengan kondisi yang diminta, maka
             *       bagian blok "else" akan dijalankan.
             *
             */

            if (listOfStudentScore[getListStudentNameAndScore] >= 90) {
                System.out.println("Nilai yang kamu peroleh : A.");
                System.out.println("Selamat " + listOfStudentName[getListStudentNameAndScore] + " kamu telah berhasil lulus dengan nilai Sempurna\n");
            } else if (listOfStudentScore[getListStudentNameAndScore] >= 75) {
                System.out.println("Nilai yang kamu peroleh : B.");
                System.out.println("Selamat " + listOfStudentName[getListStudentNameAndScore] + " kamu telah berhasil lulus dengan nilai yang cukup memuaskan\n");
            } else if (listOfStudentScore[getListStudentNameAndScore] >= 50) {
                System.out.println("Nilai yang kamu peroleh : C.");
                System.out.println("Tidak terlalu buruk, tingkatkan kembali semangat dan motivasi belajar kamu " + listOfStudentName[getListStudentNameAndScore] + "\n");
            } else {
                System.out.println("Nilai yang kamu peroleh : D.");
                System.out.println("Mohon maaf, " + listOfStudentName[getListStudentNameAndScore] + " tidak lulus!. semangat untuk mengulang ujian ditahun depan.\n");
            }
        }


    }
}


/*

Output :

Juani mendapatkan nilai = 75
Nilai yang kamu peroleh : B.
Selamat Juani kamu telah berhasil lulus dengan nilai yang cukup memuaskan

Byork mendapatkan nilai = 59
Nilai yang kamu peroleh : C.
Tidak terlalu buruk, tingkatkan kembali semangat dan motivasi belajar kamu Byork

Stella mendapatkan nilai = 100
Nilai yang kamu peroleh : A.
Selamat Stella kamu telah berhasil lulus dengan nilai Sempurna

Doflamingo mendapatkan nilai = 41
Nilai yang kamu peroleh : D.
Mohon maaf, Doflamingo tidak lulus!. semangat untuk mengulang ujian ditahun depan.


Process finished with exit code 0



 */