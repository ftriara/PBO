import java.util.Scanner;

public class DiskonMiniMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total pembelian : ");
        
        // tambahkan code untuk menyimpan nominal total pembelian
        int totalBeli = sc.nextInt();

        // tambahkan code untuk mengimplementasikan ketentuan diskon yang ditetapkan
        double diskon;
        int hargaDiskon;

        if (totalBeli < 50000) {
            diskon = 0f;
        } else if (totalBeli >= 50000 && totalBeli <= 75000) {
            diskon = 0.05f;
        } else if (totalBeli >= 75000 && totalBeli <= 125000) {
            diskon = 0.15f;
        } else {
            diskon = 0.20f;
        }

        // tambahkan code untuk menampilkan nominal yang harus dibayar 
        // sesuai dengan ketentuan diskon yang diberikan
        hargaDiskon = (int) (totalBeli - (totalBeli*diskon));
        System.out.println("Total Pembelian      = Rp " + totalBeli);
        System.out.println("Diskon Barang        = " + (int)(diskon*100) + "%");
        System.out.println("Harga setelah diskon = Rp " + hargaDiskon);

        sc.close();
    }
}