import java.util.Scanner;

public class Kafe23No2 {
   
    static Scanner sc = new Scanner(System.in);

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat Datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda Adalah Member, Dapatkan Diskon 10% Untuk Setiap Pembelian!");
        }

        if (kodePromo.equalsIgnoreCase("diskon 50")) {
            System.out.println("Selamat! Anda Mendapatkan Diskon 50%");
        } else if (kodePromo.equalsIgnoreCase("diskon 30")) {
            System.out.println("Selamat! Anda Mendapatkan Diskon 30%");
        } else {
            System.out.println("Kode Tidak Valid");
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

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};
        return hargaItem[pilihanMenu - 1] * banyakItem;
    }

    public static void main(String[] args) {
        Menu("Andi", true, "diskon 50");
        System.out.println();
        Menu("Rafi", false, "diskon 30");
        System.out.println();
        Menu("Wildan", false, "diskon 100");

      
        System.out.print("\nMasukkan Nomor Menu Yang Ingin Anda Pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan Jumlah Item Yang Ingin Dipesan: ");
        int banyakItem = sc.nextInt();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem);
        System.out.println("Total Harga Untuk Pesanan Anda: Rp " + totalHarga);
        System.out.println("Terimakasih!");
    }
}
