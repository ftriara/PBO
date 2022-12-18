// Nama  : Fitria Rahmadani
// NIM   : M0521022
// Kelas : Informatika A

/**
 * Class PegawaiTetap mengimplementasikan interface Pegawai sehingga
 * memiliki method yang sama dengan interface Pegawai
 */
public class PegawaiTetap implements Pegawai {
    /**
     * Deklarasi atribut yang dibutuhkan sebagai data Pegawai Tetap
     */
    public String idPegawai, namaPegawai, alamatPegawai;
    public int gajiPokok, tunjangan;

    /**
     * Constructor dari class PegawaiTetap
     */
    public PegawaiTetap (String idPegawai, String namaPegawai, String alamatPegawai, int gajiPokok, int tunjangan) {
        this.idPegawai = idPegawai;
        this.namaPegawai = namaPegawai;
        this.alamatPegawai = alamatPegawai;
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
    }

    /**
     * Method hitungGaji() dari interface Pegawai
     */
    @Override
    public int hitungGaji() {
        int gajiTotal = gajiPokok + tunjangan;
        return gajiTotal;
    }

    /**
     * Method toString() yang merupakan method bawaan dari Java
     */
    @Override
    public String toString() {
        return String.format (
            "ID Pegawai     : %s\n" +
            "Nama Pegawai   : %s\n" +
            "Alamat Pegawai : %s\n" +
            "Status Pegawai : %s\n" +
            "Gaji Pokok     : Rp%d\n" +
            "Tunjangan      : Rp%d\n" +
            "Gaji Total     : Rp%d\n",
            this.idPegawai,
            this.namaPegawai,
            this.alamatPegawai,
            "Pegawai Tetap",
            this.gajiPokok,
            this.tunjangan,
            this.hitungGaji()
        );
    }
}
