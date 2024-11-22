// oct 20 | 2024 | 21:59 PM

import java.util.Scanner;

public class _03DataTypeBoolean {

    public static void main(String[] args) {
        boolean tru = true;
        boolean fals = false;

        System.out.println(tru);
        System.out.println(fals);


        // memberi variable isHoliday yang bertipe data boolean bernilai "true"
        boolean isHoliday = true;
        System.out.println(isHoliday + ", Today is Holiday.");

        // merubah value variable isHoliday menjadi, false
        isHoliday = false;
        System.out.println(isHoliday + ", Today is you go to Office.");


        // boolean dengan menggunakan percabangan / if - statement
        if (!isHoliday) {
            System.out.println("Today is a Holiday, you dont work.");
        } else {

            /* output akan menampilkan bagian, else.
               karena, yang awal nya isHoliday bernilai true, dirubah nilainya menjadi false
               saat pengecekan pada if-statment, variable isHoliday telah menampung nilai false
               terlebih dahulu.

               program java, dijalankan dari atas ke bawah.

               jika ingin menampilkan bagian If, dapat menambahkan tanda ! sebelum variable isHoliday
               pada if-statment :

               ! atau negasi merupakan tanda kebalikan/tidak/bukan..

               if (!isHoliday)...

               yang artinya, jika variable isHoliday bukanlah "false".. yang artinya sekarang
               nilai pada variable pada bagian if merupakan "true", maka tampilkan/print(...)

               maka sekarang bagian, System.out.println("Today is a Holiday, you dont work.");
               akan tertampil.
             */

            System.out.println("unfortunetely, you have to go to the office and work.");
        }

        System.out.println();// membuat baris kosong baru / new line




        // boolean dengan menggunakan perulangan / loops

        boolean fanOn = true;
        byte temperatureFan = 0;
        int gearCount = 0;
        char celciusUnicode = '\u2103';

        while (fanOn) {
            temperatureFan += 25;
            System.out.println("fan on Gear : " + gearCount + " | Temperature " + temperatureFan + celciusUnicode);
            gearCount++;
            if (gearCount == 3) {
                System.out.println("Fan on TOP GEAR -> " + gearCount);
                System.out.println("Temperature fan -> " + (temperatureFan += 50) + celciusUnicode);
                if (temperatureFan >= 100) {
                    System.out.println("Fan is too HOT, the fan will turn off.");
                }
                fanOn = false;
            }
        }

        System.out.println();

        // boolean dengan menambahkan input-output user
        Scanner scanner = new Scanner(System.in);
        boolean lightOn = false;

        int counterLightOn = 0;
        int counterLightOff = 0;

        while (true) {
            System.out.println("Light is " + (lightOn ? "On" : "Off"));
            System.out.print("Toggle Light? (y/n): ");
            String input = scanner.next();

            if (!lightOn) counterLightOn += 1;
            else counterLightOff += 1;

            if (input.equalsIgnoreCase("y")){
                lightOn = !lightOn;
            } else if (input.equalsIgnoreCase("n")) {
                System.out.println("Total light on is : " + counterLightOn);
                System.out.println("Total light off is : " + counterLightOff);
                System.out.println();
                System.out.println("Exiting the program..");
                break;
            } else {
                System.out.println("Invalid Input, please enter 'y' or 'n'");
            }
        }

    }

}
