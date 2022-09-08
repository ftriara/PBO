// file LatihanVariabel.java
public class LatihanVariabel {
    public static void main(String[] args) {
    int a = 10;
    double b = 3.0;
    float c = 4.3f;

    // ubah variabel a dan c ke tipe data double
    double a1 = Double.valueOf(a);
    double c1 = Double.valueOf(c);

    // jumlahkan variabel a, b, dan c
    double sum = a1 + b + c1;

    // tampilkan hasil penjumlahan ketiga variabel
        System.out.println(sum);
    }
}
