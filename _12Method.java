// 17 - 11 -2024 | 20:43


public class _12Method {

    /**
     * Method / Function, block kode program yang akan berjalan saat dipanggil.
     *
     *  Syntax pembuatan method :
     *
     *      static void nama_Method () {
     *          ....
     *      }
     *
     * untuk memanggil method, bisa dengan = menggunakan nama method diikuti tanda kurung
     *  contoh:
     *      nama_Method();
     *
     *
     *
     *  contoh method yang telah ada/bawaan dari java =
     *      println()  -> method yang berfungsi untuk menampilkan output
     *      toString() -> method yang berfungsi untuk mengembalikan nilai kedalam tipe data String
     */


    static void sayGreeting() {
        String name = "Juani";
        System.out.println("Hello, " + name);
    }




    /**
     *  Method Parameter, method yang bersikan argument/parameter didalam nya.
     *
     *  dibanding membuat variable baru terus menerus,
     *  untuk mengisi sebuah value(nilai) kedalam method
     *
     *  dapat dengan memanfaatkan 'Method Parameter'
     *
     *      contoh :
     *
     *          static void nama_Method (Tipe_data  Argument/Parameter) {
     *            ....
     *          }
     *
     *  dengan 'method parameter',  value parameter nya dapat berbeda-beda
     *  ketika method nya dipanggil, dan tak perlu lagi membuat variable baru untuk
     *  menyimpan data yang berbeda di dalam blok method.
     *
     *      contoh :
     *
     *          'ini tanpa parameter'
     *
     *          static void nama_Method () {
     *                 String name = "...";
     *                 String name2 = "...";
     *                 int ageName = 0;
     *                 int ageName2 = 0;
     *
     *                 System.out.println("Hello, " + name + "Your age : " + ageName);
     *                 System.out.println("Hello, " + name2 + "Your age : " + ageName2);
     *
     *          }
     *
     *          'ini dengan method parameter'
     *
     *          static void nama_Method(String name, int age) {
     *              System.out.println("Hello, " + name + "Your age : " + ageName);
     *          }
     *
     *
     *  saat memanggil Method/Function dengan parameter didalam nya,
     *  harus dimasukan juga isi dari parameter sesuai dengan Tipe_Data yang telah dibuat.
     *  jika tidak.... akan error broo
     *      Contoh :
     *
     *          nama_Method(...);
     */

    static void sayGreetingWithArgument(String name) {

        // tidak perlu membuat variable lagi, untuk menampung value 'name'
        // cukup masukan didalam tanda kurung method '(..)'

        // String name = "Juani";
        System.out.println("Whats'up!, " + name);
    }


    /**
     *
     * Method overloading, kemampuan membuat method
     * dengan nama yang sama lebih dari satu kali
     *
     * hanya saja, jumlah / tipe data parameter di method yang dibuat harus berbeda
     * dari method yang bernama sama lainnya.
     *
     *      contoh :
     *
     *          static void person() {
     *              ...
     *          }
     *
     *          static void person(String name) {
     *              ....
     *          }
     *
     *          static void person(String name, String address, int age) {
     *              .....
     *              ......
     *          }
     *
     *
     */


    static void sayHello() {
        System.out.println("\nHello.");
    }

    static void sayHello(String name) {
        System.out.println("Yo! , i'm " + name);
    }

    static void sayHello(String name, String gender) {
        System.out.println("Yo! , " + name + " | " + gender);
    }


    /**
     *
     * Method return value, method yang berisikan pengembalian value(nilai)
     *
     * void artinya tidak mengembalikan apa-apa.
     *
     * mengembalikan value pada method, disesuaikan dengan value apa yang diinginkan
     * jika ingin mengembalikan value integer, maka void diganti menjadi int
     *
     *      contoh syntax:
     *
     *          public static int sumNumber() {
     *              ...
     *
     *              return ...
     *          }
     *
     */

    public static int sumNumber(int number1, String operator, int number2) {

        switch (operator) {
            case "+" : return number1 + number2;
            case "-" : return number1 + number2;
            case "*" : return number1 + number2;
            case "/" : return number1 + number2;
            default: return 0;
        }
    }

    public static String isNameEmpty(String name) {

        if (name == "") {
            System.out.println("..NUll..");
        }

        System.out.println(name);
        return name;
    }

    public static void main(String[] args) {

        // memanggil method sayGreeting();
        sayGreeting();
        sayGreeting();
        sayGreeting();


        // memanggil method sayGreetingWithArgument();
        sayGreetingWithArgument("Roronoa Zaburo");
        sayGreetingWithArgument("Juani");
        sayGreetingWithArgument("Bjork");




        // memanggil method overloading
        sayHello();
        sayHello("Vinsmoke Sanji");
        sayHello("Bonclay", "Non-binary");

        // memanggil method return value
        sumNumber(10, "+", 10);
        sumNumber(10, "-", 10);
        sumNumber(10, "*", 10);
        sumNumber(10, "/", 10);

        isNameEmpty("");
        isNameEmpty("Okarun | Ken Takakura");
    }

}
/*
Hello, Juani
Hello, Juani
Hello, Juani
Whats'up!, Roronoa Zaburo
Whats'up!, Juani
Whats'up!, Bjork

Hello.
Yo! , i'm Vinsmoke Sanji
Yo! , Bonclay | Non-binary
..NUll..

Okarun | Ken Takakura

Process finished with exit code 0

 */
