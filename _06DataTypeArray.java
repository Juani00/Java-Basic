// november 3 2024 | 21:00

public class _06DataTypeArray {

    public static void main(String[] args) {


        /**
        Array = data yang berisikan kumpulan tipe data yang sama.

        jumlah data array yang dibuat adalah fix/tidak dapat dirubah setelah pertama kali dibuat.


        untuk mengakses dan memberi nilai data pada array, menggunakan Index.

        index/angka pertama pada Array dimulai dari 0, yang arti nya 0 adalah 1
        jika terdapat 10 data Array, maka jumlah_data dikurang 1

        1 2 3 4 5 6 7 8 9 10     | membuat 10 data_Array
        0 1 2 3 4 5 6 7 8 9      | mengakses jumlah_dataArray


        memberi nilai pada array
            type_data[] namaVariable = new type_data[n(Array)]
            char[]      dataChars    = new char[3]              // membuat 3 buah data array, dengan tipe data char

            dataChars[0] = 'A';
            dataChars[1] = 'B';
            dataChars[2] = 'C';



        mengakses nilai didalam array

            System.out.println(namaVariable[index])
            System.out.println(dataChars[0])        // Output : A



         **/



        byte[] dataBytes = new byte[2];
        dataBytes[0] = 4;
        dataBytes[1] = 1;

        System.out.println(dataBytes[0] + dataBytes[1]);


        String[] dataString;
        dataString = new String[3];

        // mengisi value kedalam array
        dataString[0] = "Juani";
        dataString[1] = "Lexxi";
        dataString[2] = "Ebo";

        // mengakses value array dataString dengan for loop
        for (int index = 0; index < dataString.length; index++) {
            System.out.println( dataString[index]);
        }

        // merubah value array
        dataString[2] = "Eboni";
        System.out.println(dataString[2]); // Output : Ebo -> Eboni


        /**
         * Array Intializer : membuat array dengan tanpa harus mengisi jumlah total data satu persatu secara langsung
         *
         * dengan array intializer, dapat langsung membuat data array, tanpa perlu membuat berapa batas/jumlah
         * data array yang ingin dibuat.
         *
         *      type_Data[]  variable_name =  {value, value, value, ...};
         *      int[]        numbers       =  {1, 2, 3, 4};
         *      numbers[0]  // output : 1
         *
         *          atau bisa juga dengan cara
         *
         *      type_Data[]  variable_name =  new type_Data[] {
         *                                    value, value, value, ...
         *                                   };
         *
         *  jika tanpa Array intializer =
         *
         *      int[]       numbers        = new int[4];
         *      numbers[0] = 1;
         *      numbers[1] = 2;
         *      numbers[2] = 3;
         *      numbers[3] = 4;
         *
         *      numbers[0] // output : 1
         */


        String[] listNames = new String[] { "Androf", "Bastech", "Cordillia" };
        System.out.println("List name = " + String.join(", ", listNames)); // Output : List name = Androf, Bastech, Cordillia

        int[] arrayNumbers = {
                1, 2, 3, 4
        };
        System.out.println(arrayNumbers[2] + arrayNumbers[3]); // Output 7,  (3 + 4)


        /**
         *  Multiple Array / Array didalam Array
         *
         *  untuk mengakses data didalam, multiple array
         *  [] untuk mengambil data baris pertama (mengambil semua data, yang ada pada baris dan kolom tertentu)
         *  [][] untuk mengambil data baris pertama di kolom tertentu
         *
         *  int matrix[][] = new int[] {
         *         {1, 2},
         *         {2, 1}
         *  };
         *
         *  System.out.println(matrix[0]); // Output : 1 , 2
         *  System.out.println(matrix[0][0]); // Output : 1
         *                                                [0] -> adalah baris pertama, kolom pertama
         *                                                [0] -> adalah baris pertama, kolom pertama
         *                                                [0][0] -> mengambil data pada baris pertama dan kolom pertama
         *                                                data pada multiple array [0][0], adalah 1
         *                                                jadi hasil output adalah : 1
         *
         *
         *  System.out.println(matrix[0][1]); // Output : 2
         *                                                mengambil data pada baris pertama [0], di kolom ke dua[1]
         *                                                data pada multiple array [0][1], adalah 2
         *                                                jadi hasil output adalah : 2

         *
         * System.out.println(matrix[1][1]); // Output : 1
         *                                                mengambil data pada baris kedua [1], di kolom ke dua[1]
         *                                                data pada multiple array [1][1], adalah 1
         *                                                jadi hasil output adalah : 1
         *
         */

        int matrix[][] = {
                {1, 2},
                {2, 1},
        };
        System.out.println(matrix[1][0]); // Output : 2
                                          /**
                                          * kotak pertama [1], mengambil data pada baris ke 2
                                          * kotak kedua   [0], mengambil data pada baris ke 2, kolom ke 1
                                          * output : 2
                                          *
                                          * Baris -> kesamping
                                          * kolom -> kebawah
                                          */



        String[][] members = new String[2][2];
        members[0][0] = "Juani";
        members[0][1] = "Borka";
        members[1][0] = "Thor";
        members[1][1] = "Loki";

        /**
         * members..... {
         *     { Juani, Borka }
         *     { Thor,  Loki }
         *  };
         */

        System.out.println(members[1][1]); // Output : Loki
        for (int indexForLine = 0; indexForLine < members.length; indexForLine++){
            for (int indexForColumn = 0; indexForColumn < members[indexForLine].length; indexForColumn++) {
                System.out.println("Data[" + indexForLine + "][" + indexForColumn + "] = " + members[indexForLine][indexForColumn]);
            }
        }

    }


}

/**
 *
 *  OUTPUT :
 *
 *  5
 * Juani
 * Lexxi
 * Ebo
 * Eboni
 * List name = Androf, Bastech, Cordillia
 * 7
 * 2
 * Loki
 * Data[0][0] = Juani
 * Data[0][1] = Borka
 * Data[1][0] = Thor
 * Data[1][1] = Loki
 *
 * Process finished with exit code 0
 *
 */