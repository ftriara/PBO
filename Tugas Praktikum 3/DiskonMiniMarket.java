import java.util.Scanner;

public class DiskonMiniMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total pembelian : ");
        
        // tambahkan code untuk menyimpan nominal total pembelian
        double totalBeli = sc.nextDouble();

        // tambahkan code untuk mengimplementasikan ketentuan diskon yang ditetapkan
        double diskon, hargaDiskon;

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
        hargaDiskon = totalBeli - (totalBeli*diskon);
        System.out.printf("Total Pembelian      = Rp %.2f\n", totalBeli);
        System.out.println("Diskon Barang        = " + (int)(diskon*100) + "%");
        System.out.printf("Harga setelah diskon = Rp %.2f\n", hargaDiskon);

        sc.close();
    }
}
