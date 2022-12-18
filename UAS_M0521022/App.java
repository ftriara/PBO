// Nama  : Fitria Rahmadani
// NIM   : M0521022
// Kelas : Informatika A

/**
 * Class App sebagai class yang memiliki main method untuk mengeksekusi program java.
 * Digunakan untuk mengisi data array dari class PegawaiTetap dan PegawaiHonorer.
 * Digunakan untuk mengeksekusi thread dari array data PegawaiTetap dan PegawaiHonorer.
 */
public class App {
    public static void main(String[] args) throws Exception {
        PegawaiTetap[] arrayPegawaiTetap = new PegawaiTetap[5];
        PegawaiHonorer[] arrayPegawaiHonorer = new PegawaiHonorer[5];

        arrayPegawaiTetap[0] = new PegawaiTetap("PT01001", "Fitria", "Wonogiri", 2500000, 500000);
        arrayPegawaiTetap[1] = new PegawaiTetap("PT01002", "Rahmadani", "Surakarta", 2000000, 400000);
        arrayPegawaiTetap[2] = new PegawaiTetap("PT01003", "Budi", "Sukoharjo", 2500000, 350000);
        arrayPegawaiTetap[3] = new PegawaiTetap("PT01004", "Andi", "Boyolali", 1500000, 500000);
        arrayPegawaiTetap[4] = new PegawaiTetap("PT01005", "Putri", "Sragen", 3000000, 300000);

        arrayPegawaiHonorer[0] = new PegawaiHonorer("PH02001", "Rahma", "Karanganyar", 1500000);
        arrayPegawaiHonorer[1] = new PegawaiHonorer("PH02002", "Astuti", "Pekalongan", 1000000);
        arrayPegawaiHonorer[2] = new PegawaiHonorer("PH02003", "Indri", "Madiun", 1500000);
        arrayPegawaiHonorer[3] = new PegawaiHonorer("PH02004", "Kirania", "Pati", 2500000);
        arrayPegawaiHonorer[4] = new PegawaiHonorer("PH02005", "Eka", "Yogyakarta", 1000000);

        ThreadPrint threadPT = new ThreadPrint(arrayPegawaiTetap);
        ThreadPrint threadPH = new ThreadPrint(arrayPegawaiHonorer);
        threadPT.start();
        threadPH.start();
    }
}