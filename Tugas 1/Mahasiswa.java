public class Mahasiswa {
    //atribut
    String NIM, nama, gender, alamat;

    //method untuk mengisi data
    public void isiData(String NIM, String nama, String gender, String alamat) {
        this.NIM = NIM;
        this.nama = nama;
        this.gender = gender;
        this.alamat = alamat;
    }

    //method untuk menampilkan data
    public void printData() {
        System.out.println("NIM            = " + this.NIM);
        System.out.println("Nama           = " + this.nama);
        System.out.println("Jenis Kelamin  = " + this.gender);
        System.out.println("Alamat         = " + this.alamat);
    }

    //main method
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();

        mahasiswa.isiData("M0521022", "Fitria Rahmadani", "Perempuan", "Wonogiri");
        mahasiswa.printData();
    }
}
