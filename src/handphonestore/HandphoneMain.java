
package handphonestore;

//class
import java.util.Scanner;

public class HandphoneMain {
    public static void main(String[] args) {
        //IO sederhana
        Scanner input = new Scanner(System.in);

        //array
        HandphoneGaming[] hpGaming = new HandphoneGaming[5];
        HandphoneKamera[] hpKamera = new HandphoneKamera[5];

        //object (gaming series)
        hpGaming[0] = new HandphoneGaming("ROG Phone 7", 9500000, "ASUS", "Snapdragon 8 Gen 2");
        hpGaming[1] = new HandphoneGaming("POCO X6 Pro", 4600000, "POCO", "Dimensity 8300");
        hpGaming[2] = new HandphoneGaming("Black Shark 5", 5800000, "Xiaomi", "Snapdragon 870");
        hpGaming[3] = new HandphoneGaming("RedMagic 8 Pro", 9200000, "Nubia", "Snapdragon 8 Gen 2");
        hpGaming[4] = new HandphoneGaming("Infinix GT 10 Pro", 3300000, "Infinix", "Dimensity 8050");

        //object (kamera series)
        hpKamera[0] = new HandphoneKamera("Vivo V27", 5200000, "Vivo", 64);
        hpKamera[1] = new HandphoneKamera("Samsung Galaxy A55", 5500000, "Samsung", 50);
        hpKamera[2] = new HandphoneKamera("iPhone 15 Pro", 20000000, "Apple", 48);
        hpKamera[3] = new HandphoneKamera("Oppo Reno 11F", 4600000, "Oppo", 64);
        hpKamera[4] = new HandphoneKamera("Realme 11 Pro+", 5600000, "Realme", 200);

        try {
            System.out.print("Pilih kategori (Gaming / Kamera): ");
            String kategori = input.nextLine();

            //seleksi
            if (kategori.equalsIgnoreCase("Gaming")) {
                System.out.println("\n=== Daftar Handphone Gaming ===");
                //perulangan
                for (HandphoneGaming hp : hpGaming) {
                    System.out.println("- " + hp.getNama());
                }

                System.out.print("\nMasukkan nama produk: ");
                String namaCari = input.nextLine();

                boolean ditemukan = false;
                for (HandphoneGaming hp : hpGaming) {
                    if (hp.getNama().equalsIgnoreCase(namaCari)) {
                        System.out.println("\n=== Detail Produk ===");
                        hp.tampilkanInfo(); //polymorphism
                        ditemukan = true;
                        break;
                    }
                }

                if (!ditemukan) {
                    throw new Exception("Produk tidak ditemukan.");
                }

            } else if (kategori.equalsIgnoreCase("Kamera")) {
                System.out.println("\n=== Daftar Handphone Kamera ===");
                //perulangan
                for (HandphoneKamera hp : hpKamera) {
                    System.out.println("- " + hp.getNama());
                }

                System.out.print("\nMasukkan nama produk: ");
                String namaCari = input.nextLine();

                boolean ditemukan = false;
                for (HandphoneKamera hp : hpKamera) {
                    if (hp.getNama().equalsIgnoreCase(namaCari)) {
                        System.out.println("\n=== Detail Produk ===");
                        hp.tampilkanInfo(); //polymorphism
                        ditemukan = true;
                        break;
                    }
                }

                if (!ditemukan) {
                    throw new Exception("Produk tidak ditemukan.");
                }

            } else {
                //lempar error manual agar catch aktif
                throw new Exception("Kategori tidak dikenali.");
            }

        } catch (Exception e) {
            //error handling
            System.out.println("\nTerjadi kesalahan: " + e.getMessage());
        }
    }
}
