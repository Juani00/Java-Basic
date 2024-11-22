// oct 20 | 2024 | 21:42 PM
public class _01DataTypeNumber {

    public static void main(String[] args) {

        // integer number, bilangan bulat
        byte thisByte = 20; // 1 byte
        short thisShort = 1500; // 2 byte
        int thisInt = 40000; // 4 byte
        long thisLong = 1000000; // 8 byte

        System.out.println("ini adalah tipe byte dengan nilai angka  : " +thisByte);
        System.out.println("ini adalah tipe short dengan nilai angka : " + thisShort);
        System.out.println("ini adalah tipe int dengan nilai angka   : " + thisInt);
        System.out.println("ini adalah tope long dengan nilai angka  : "  + thisLong);

        // floating point number, bilangan pecahan

        float thisFloat = 10.01F;
        double thisDouble = 10.1;
        System.out.println("ini adalah tipe float dengan nilai angka : " + thisFloat);
        System.out.println("ini adalah tipe double dengan nilai angka : " + thisDouble);


        // memudahkan pembacaan jumlah angka, dengan fitur Underscore
        // released -> java versi 7
        long oneMillionNumber = 1_000_000;
        System.out.println(oneMillionNumber);

    }
}
