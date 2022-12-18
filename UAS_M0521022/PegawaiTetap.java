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
    private String idPegawai, namaPegawai, alamatPegawai;
    private int gajiPokok, tunjangan;

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

    /**
     * Method Getter dan Setter untuk mengambil dan memperbarui nilai variabel
     */
    public String getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }

    public String getNamaPegawai() {
        return namaPegawai;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public String getAlamatPegawai() {
        return alamatPegawai;
    }

    public void setAlamatPegawai(String alamatPegawai) {
        this.alamatPegawai = alamatPegawai;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }
}
