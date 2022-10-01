import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil1, bil2;
        boolean lanjut = true;

        while (lanjut) {
            try {
                System.out.print("Ketik bilangan pertama : ");
                bil1 = sc.nextInt();
                System.out.print("Ketik bilangan kedua : ");
                bil2 = sc.nextInt();
                double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);

                /* ===== Tambahan ===== */
                //int hasil = bil1 / bil2;

                System.out.println(bil1 + " / " + bil2 + " = " + hasil);
                lanjut = false;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Input salah, masukkan angka");
            } 

            /* ========== Tambahan ========== */
            /*catch (ArithmeticException a) {
                System.out.println("Bilangan kedua tidak boleh nol");
            }*/
        }
    }
}



/*
a. Ketik huruf untuk digunakan sebagai input bilangan pertama kemudian klik ENTER.
   Jelaskan perbedaannya dengan ExceptionDemo1.java!
   => Pada program ExceptionDemo2 ketika user menginputkan huruf maka user akan diminta untuk menginputkan ulang melalui kode "try" karena
      program telah menangkap Exception pada "catch (...)", jadi program akan tetap berjalan. Sedangkan, pada ExceptionDemo1
      program akan mengalami error dan berhenti karena adanya InputMismatchException.

b. Pembagian bilangan dengan 0 seharusnya tidak dapat dilakukan.
   Tambahkan code exception handling untuk menangani pembagian dengan 0 pada source code tersebut.
    =>  catch (ArithmeticException a) {
            System.out.println("Bilangan kedua tidak boleh nol");
        }
       Selain itu, tipe data untuk hasil diubah menjadi integer sehingga program dapat mendeteksi adanya exception
        double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);
        --> int hasil = bil1 / bil2;
*/