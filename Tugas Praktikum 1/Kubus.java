public class Kubus {
    int sisiKubus = 5;

    public Double hitungVolume() {
        Double volume = 0.0;
        volume = (double) (this.sisiKubus * this.sisiKubus * this.sisiKubus);
        return volume;
    }

    public int hitungLuasPermukaan() {
        int luasPermukaan = 0;
        luasPermukaan = 6 * this.sisiKubus * this.sisiKubus;
        return luasPermukaan;
    }

    /**
     * buat main method
     * buat objek dari class Kubus
     * tampilkan hasil perhitungan volume kubus
     * tampilkan hasil perhitungan luas permukaan kubus
     */
    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        System.out.println("Sisi Kubus : " + kubus.sisiKubus);
        System.out.println("Volume Kubus : " + kubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus : " + kubus.hitungLuasPermukaan());
    }
}
