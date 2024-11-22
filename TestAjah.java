//
//class Siswa {
//    String nama;
//    int umur;
//
//    Siswa(String nama, int umur) {
//        this.nama = nama;
//        this.umur = umur;
//    }
//}
//
//
//class Barang {
//    String nama;
//    float harga;
//
//    Barang(String nama, float harga) {
//        this.nama  = nama;
//        this.harga = harga;
//    }
//
//}
//public class TestAjah {
//        public static void main(String... args) throws InterruptedException {
//
//            Siswa[] siswa = {
//                    new Siswa("Juani", 11),
//                    new Siswa("kosr", 1),
//            };
//
//            for (Siswa i : siswa) {
//                System.out.println("Name = " + i.nama + ", Age = " + i.umur);
//            }
//
//
//
//            Barang[] stuff = {
//                    new Barang("Aqua", 10.000f),
//                    new Barang("Surya", 31.000f)
//            };
//
//            for (Barang barang : stuff) {
////                System.out.println("[Name = " + x.nama + "], [Price = " + x.harga + "]");
//                System.out.printf("[Name = %s], [Price = %.3f]%n", barang.nama, barang.harga);
//            }
//
//
//        }
//}


import java.util.HashMap;
import java.util.Map;


public class TestAjah {

       public static void main(String[] args) {

//           String[] category = {
//                "Low", "Medium", "High",
//                "Medium", "Low"
//           };
//
//           String[] frequency = new String[0];
//
//           for (String categorys : category) {
//               frequency[Integer.parseInt(categorys)] += 1;
//           }

           String[] category = {
                "Low", "Medium", "High",
                "Medium", "Low"
           };

           Map<String, Integer> frequency = new HashMap<>();

           for (String cat :  category) {
               if (frequency.containsKey(cat)) {
                   frequency.put(cat, frequency.get(cat) + 1);
               } else {
                   frequency.put(cat, 1);
               }
           }

           for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
               System.out.println(entry.getKey() + " " + entry.getValue());
           }

    }
}

