// 16 - 11 -2024 | 22:32

public class    _10ForLoop     {

    /**
     *
     * for adalah cara untuk melakukan perulangan, selama kondisi dalam for terpenuhi, perulangan akan
     * terus diulangi sampai kondisinya false/tidak terpenuhi lagi.
     *
     *
     *  Syntax perulangan for
     *
     *  for(init statement; kondisi; post statement){
     *      // block perulangan
     *  }
     *
     *
     * Init statement akan dieksekusi hanya sekali di awal sebelum perulangan
     * Kondisi akan dilakukan pengecekan dalam setiap perulangan, jika true perulangan akan dilakukan, jika false perulangan akan berhenti
     * Post statement akan dieksekusi setiap kali diakhir perulangan
     * Init statement, Kondisi dan Post Statement tidak wajib diisi, jika Kondisi tidak diisi, berarti kondisi selalu bernilai true
     *
     */

    public static void main(String[] args) {

//        for (;;) {
//            System.out.println("ini akan terus di ulang, karena kondisi bernilai true..");
//        }


        // perulangan hanya dengan kondisi
        var counter = 1;
        for (; counter <= 3; ) {
            System.out.println("Perulangan ke- " + counter);
            counter++;
        }

        // perulangan dengan init statement + kondisi
        for (var counters = 1; counters <= 3;) {
            System.out.println("Perulangan ke- " + counters + " (2)");
            counters++;
        }

        // perulangan dengan init statement + kondisi + post statement
        for (int countersss = 1; countersss <= 3 ; countersss++) {
            System.out.println("Perulangan ke- " + countersss + "\t(3)");
        }



    /**
     *  terdapat cara lain untuk mengambil semua data yang ada didalam array,
     *  yaitu dengan menggunakan "For Each".
     *
     *  yang lebih sederhana, tanpa perlu menuliskan counter, post statement didalam kondisi
     *  untuk mengambil data yang ada di array.
     *
     *   Syntax for each =
     *
     *    for (Tipe_data Nama_Variable : Nama_variable_Array) {
     *      ....
     *    }
     *
     */


        // membuat array dengan initializer
        String[] listName = {
                "Juani", "Byork", "Batman",
                "Luffy", "Zoro", "Sanji"
        };


        // jika mengakses array dengan for loop
        System.out.println("\nini perulangan dengan menggunakan 'For Loop'.");
        System.out.println("List name : ");
        for (int getListName = 0; getListName < listName.length; getListName++) {
            System.out.println(getListName + " -> " + listName[getListName]);
        }

        System.out.println("\nini perulangan dengan menggunakan 'For Each'.");
        for (String getListName : listName) {
            System.out.println(getListName);
        }
    }

}

/*
output :

Perulangan ke- 1
Perulangan ke- 2
Perulangan ke- 3
Perulangan ke- 1 (2)
Perulangan ke- 2 (2)
Perulangan ke- 3 (2)
Perulangan ke- 1	(3)
Perulangan ke- 2	(3)
Perulangan ke- 3	(3)

ini perulangan dengan menggunakan 'For Loop'.
List name :
0 -> Juani
1 -> Byork
2 -> Batman
3 -> Luffy
4 -> Zoro
5 -> Sanji

ini perulangan dengan menggunakan 'For Each'.
Juani
Byork
Batman
Luffy
Zoro
Sanji

Process finished with exit code 0
 */