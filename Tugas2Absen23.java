import java.util.Scanner;

public class Tugas2Absen23 {
   
    static int[][] penjualan = {
        {20, 20, 25, 20, 10, 60, 10},
        {30, 80, 40, 20, 15, 15, 25}, 
        {5, 9, 8, 7, 5, 10, 45},      
        {50, 0, 0, 17, 18, 10, 6},    
        {15, 10, 16, 20, 15, 10, 55} 
    };

    static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};

    public static void inputPenjualan() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < menu.length; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("Masukkan penjualan " + menu[i] + " untuk hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = input.nextInt();
            }
        }
    }

    public static void tampilkanPenjualan() {
        System.out.println("\nData Penjualan:");
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + ": ");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void menuPenjualanTertinggi() {
        int maxPenjualan = 0;
        String menuTerlaris = "";

        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            if (total > maxPenjualan) {
                maxPenjualan = total;
                menuTerlaris = menu[i];
            }
        }

        System.out.println("\nMenu dengan penjualan tertinggi: " + menuTerlaris + " dengan total " + maxPenjualan);
    }

    public static void rataRataPenjualan() {
        System.out.println("\nRata-rata penjualan per menu:");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double rataRata = (double) total / penjualan[i].length;
            System.out.println(menu[i] + ": " + rataRata);
        }
    }

    public static void main(String[] args) {
        tampilkanPenjualan();
        menuPenjualanTertinggi();
        rataRataPenjualan();
    }
}
