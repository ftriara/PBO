// Nama  : Fitria Rahmadani
// NIM   : M0521022
// Kelas : Informatika A

/**
 * Class PegawaiHonorer mengimplementasikan interface Pegawai sehingga
 * memiliki method yang sama dengan interface Pegawai
 */
public class PegawaiHonorer implements Pegawai {
    /**
     * Deklarasi atribut yang dibutuhkan sebagai data Pegawai Honorer
     */
    private String idPegawai, namaPegawai, alamatPegawai;
    private int gajiPokok;

    /**
     * Constructor dari class PegawaiHonorer
     */
    public PegawaiHonorer (String idPegawai, String namaPegawai, String alamatPegawai, int gajiPokok) {
        this.idPegawai = idPegawai;
        this.namaPegawai = namaPegawai;
        this.alamatPegawai = alamatPegawai;
        this.gajiPokok = gajiPokok;
    }

    /**
     * Method hitungGaji() dari interface Pegawai
     */
    @Override
    public int hitungGaji() {
        int gajiTotal = gajiPokok;
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
            "Gaji Total     : Rp%d\n",
            this.idPegawai,
            this.namaPegawai,
            this.alamatPegawai,
            "Pegawai Honorer",
            this.gajiPokok,
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
}