//M0521022_Fitria Rahmadani

public class Karyawan_Tetap extends Karyawan{
    private float gaji, uangMakan, tunjangan;

    public Karyawan_Tetap(int id, String nama, String alamat, float gaji, float uangMakan, float tunjangan) {
        super(id, nama, alamat);
        this.gaji = gaji;
        this.uangMakan = uangMakan;
        this.tunjangan = tunjangan;
    }

    public float getGaji() {
        return gaji;
    }

    public void setGaji(float gaji) {
        this.gaji = gaji;
    }

    public float getUangMakan() {
        return uangMakan;
    }

    public void setUangMakan(float uangMakan) {
        this.uangMakan = uangMakan;
    }

    public float getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(float tunjangan) {
        this.tunjangan = tunjangan;
    }

    public static void main(String[] args) {
        Karyawan_Tetap karTap = new Karyawan_Tetap(22, "Fitria", "Wonogiri", 1500000, 500000, 500000);
       
        karTap.gajiTotal = karTap.getGaji() + karTap.getUangMakan() + karTap.getTunjangan();

        System.out.println("Data Karyawan :");
        System.out.println("Id          : " + karTap.getId());
        System.out.println("Nama        : " + karTap.getNama());
        System.out.println("Alamat      : " + karTap.getAlamat());
        System.out.println("Gaji Total  : Rp " + karTap.hitungGaji());
    }
}