import java.util.Scanner;

public class Kafe23No2 {
    static Scanner sc = new Scanner(System.in);

    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat Datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda Adalah Member, Dapatkan Diskon 10% Untuk Setiap Pembelian!");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan Pilih Menu Yang Anda Inginkan.");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItem[pilihanMenu - 1] * banyakItem;

       
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            hargaTotal *= 0.5; 
            System.out.println("Kode Promo DISKON50 berlaku. Anda mendapatkan diskon 50%!");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            hargaTotal *= 0.7; 
            System.out.println("Kode Promo DISKON30 berlaku. Anda mendapatkan diskon 30%!");
        } else {
            System.out.println("Kode promo tidak valid. Tidak ada diskon yang diberikan.");
        }

        return hargaTotal;
    }

    public static void main(String[] args) {
       
        Menu("Andi", true);

       
        int totalHargaKeseluruhan = 0;

        
        while (true) {
            System.out.print("\nMasukkan Nomor Menu Yang Ingin Anda Pesan (1-6, atau ketik 0 untuk selesai): ");
            int pilihanMenu = sc.nextInt();
            
            if (pilihanMenu == 0) {
                break; 
            }

            System.out.print("Masukkan Jumlah Item Yang Ingin Dipesan: ");
            int banyakItem = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan Kode Promo (jika ada): ");
            String kodePromo = sc.nextLine();

            
            int hargaPesanan = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
            totalHargaKeseluruhan += hargaPesanan; 

            System.out.println("Harga Untuk Pesanan Anda: Rp" + hargaPesanan);
        }
        System.out.println("\nTotal Harga Semua Pesanan Anda: Rp" + totalHargaKeseluruhan);
    }
}
