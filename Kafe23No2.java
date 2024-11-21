public class Kafe23No2 {
    public static void Menu(String namaPelanggan,boolean isMember, String kodePromo) {
        System.out.println("Selamat Datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda Adalah Member, Dapatkan Diskon 10% Untuk Setiap Pembelian!");
            
        }
        if (kodePromo.equalsIgnoreCase("diskon 50")) {
            System.out.println("Selamat! Anda Mendapatkan Diskon 50%");   
        }else if (kodePromo.equalsIgnoreCase("diskon 30")) {
            System.out.println("Selamat! Anda Mendapatkan Diskon 30%");    
        }else{
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
    public static void main(String[] args) {
        Menu("Andi",true, "diskon 50");
        System.out.println();
        Menu("Rafi", false, "diskon 30");
        System.out.println();
        Menu("Wildan", false, "diskon 100");
    }
    
}