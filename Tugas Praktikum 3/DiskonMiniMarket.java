import java.util.Scanner;

public class DiskonMiniMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total pembelian : ");
        // tambahkan code untuk menyimpan nominal total pembelian
        int totalBeli = sc.nextInt();
        sc.close();

        int harga;
        double diskon;

        // tambahkan code untuk mengimplementasikan ketentuan diskon yang ditetapkan
        // tambahkan code untuk menampilkan nominal yang harus dibayar sesuai dengan ketentuan diskon yang diberikan
        if (totalBeli < 50000) {
            harga = totalBeli;
            System.out.println("Diskon 0%");
            System.out.println("Harga setelah diskon  = " + harga);
        } else if (totalBeli >= 50000 && totalBeli <= 75000) {
            diskon = 0.05 * totalBeli;
            harga = (int) (totalBeli - diskon);
            System.out.println("Diskon 5%");
            System.out.println("Harga setelah diskon  = " + harga);
        } else if (totalBeli >= 75000 && totalBeli <= 125000) {
            diskon = 0.15 * totalBeli;
            harga = (int) (totalBeli - diskon);
            System.out.println("Diskon 15%");
            System.out.println("Harga setelah diskon    = " + harga);
        } else {
            diskon = 0.20 * totalBeli;
            harga = (int) (totalBeli - diskon);
            System.out.println("Diskon 20%");
            System.out.println("Harga setelah diskon    = " + harga);
        }
    }
}
