//M0521022_Fitria Rahmadani

public class Karyawan_Kontrak extends Karyawan{
    private float gajiHarian;
    private int jumlahHariMasuk;

    public Karyawan_Kontrak(int id, String nama, String alamat, float gajiHarian, int jumlahHariMasuk) {
        super(id, nama, alamat);
        this.gajiHarian = gajiHarian;
        this.jumlahHariMasuk = jumlahHariMasuk;
    }

    public float getGajiHarian() {
        return gajiHarian;
    }

    public void setGajiHarian(float gajiHarian) {
        this.gajiHarian = gajiHarian;
    }

    public int getJumlahHariMasuk() {
        return jumlahHariMasuk;
    }

    public void setJumlahHariMasuk(int jumlahHariMasuk) {
        this.jumlahHariMasuk = jumlahHariMasuk;
    }

    public static void main(String[] args) {
        Karyawan_Kontrak karKontrak = new Karyawan_Kontrak(22, "Fitria", "Wonogiri", 50000, 25);
        
        karKontrak.gajiTotal = karKontrak.getGajiHarian() * karKontrak.getJumlahHariMasuk();

        System.out.println("Data Karyawan :");
        System.out.println("Id          : " + karKontrak.getId());
        System.out.println("Nama        : " + karKontrak.getNama());
        System.out.println("Alamat      : " + karKontrak.getAlamat());
        System.out.println("Gaji Total  : Rp " + karKontrak.hitungGaji());
    }
}