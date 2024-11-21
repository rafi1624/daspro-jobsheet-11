import java.util.Scanner;

public class Kubus23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int s,LuasPermukaan,Volume;

        System.out.println("Masukkan Sisi");
        s = input.nextInt();
        

        LuasPermukaan = 6*s*s;
        System.out.println("Luas Permukaan Kubus Adalah: " + LuasPermukaan);

        Volume = s*s*s;
        System.out.println("Volume Kubus Adalah " + Volume);

    }
    static int hitungLuasPermukaan (int s){
        int LPermukaan = 6 *s*s;
        return LPermukaan;
    }
    static int hitungVolume (int s){
        int VKubus = s*s*s;
        return VKubus;
    }
}