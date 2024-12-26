// Oct 26 , 2024 | 21:18
public class _05Variable {
    public static void main(String[] args) {

        // Tipe_Data Nama_Variable = Value

        // Tipe_Data Nama_Variable
        // Nama_Variable = Value

        String name = "Juani";
        System.out.println(name);

        String name1;
        name1 = "I love Java";
        System.out.println(name1);

        int thisVariableNumber;
        thisVariableNumber = 1;
        System.out.println(thisVariableNumber + 1);

        /* var dirilis pada java versi 10
           dengan menggunakan 'var', jenis Tipe_Data tidak perlu dituliskan.
           jadi, langsung -> var Nama_Variable = Value;

           saat membuat variable dengan 'var' nilai/value harus langsung di isi, 
           jika tidak akan langsung Error.

           var Nama_Variable = value;
           var name = "Juani";
           var age  = 21;

        // ERROR
//        var withVar;
//        withVar = "menggunakan var";

        */

        
        var characterValue = 'A';
        System.out.println(characterValue);

        var numberValue = 1;
        System.out.println(numberValue + 9);


        /*
            final, dipakai untuk membuat value/nilai dari sebuah variable supaya datanya tidak boleh diubah.
            data variable dengan final, tetap dan tidak bisa dimodifikasi.

            final Tipe_Data Nama_Variable = Value;

         */

        final Double TemperatureRoom = 10.0;
        System.out.println(TemperatureRoom);

        //  TemperatureRoom = 5.0;
        //  System.out.println(TemperatureRoom);  // ERROR
                                                  // value TemperatureRoom 10.0
                                                  // tidak dapat dimodifikasi menjadi 5.0

        final String fixedValue = "This Data, cannot be modified.";
        System.out.println(fixedValue);

        final String company = "Juani Inc is Unicorn Company with Worth $1.000 Trillion Dollar's";
        // company = "Juani Inc is Unicorn Company with Worth $10.000 Trillion Dollar's"; // ERROR
        System.out.println(company);

    }
}
