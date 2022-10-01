// file ExceptionDemo1.java
import java.util.Scanner;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ketik bilangan pertama : ");
        int bil1 = sc.nextInt();
        System.out.print("Ketik bilangan kedua : ");
        int bil2 = sc.nextInt();
        double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);
        System.out.println(bil1 + " / " + bil2 + " = " + hasil);
    }
}


/*
a. Ketik huruf misalnya f untuk input bilangan pertama kemudian tekan ENTER
    1) Apakah program masih dapat dijalankan setelah user memasukkan f sebagai input untuk bilangan pertama?
        => Setelah user menginputkan "f" maka program akan berhenti dan tidak lanjut running
    2) Tulis output yang muncul!
        => Exception in thread "main" java.util.InputMismatchException      
        at java.base/java.util.Scanner.throwFor(Scanner.java:939)
        at java.base/java.util.Scanner.next(Scanner.java:1594)   
        at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
        at ExceptionDemo1.main(ExceptionDemo1.java:8)
    3) Jelaskan maksud dari output tersebut!
        => Output tersebut maksudnya adalah terjadi exception pada saat user memasukkan input. Jenis exceptionnya
           yaitu InputMismatchException yang artinya input yang diberikan oleh user tidak sesuai dengan tipe data
           yang diminta oleh program.
           
b. Pilih salah satu angka sebagai bilangan pertama misal 5, kemudian ketik angka 0 untuk input bilangan kedua. Jelaskan output yang muncul!
    1) Tulis output yang muncul!
        => 5 / 0 = Infinity
    2) Jelaskan maksud dari output tersebut!
        => Output tersebut maksudnya adalah ketika bilangan kedua diinputkan angka 0 maka akan menyebabkan hasil
           nilai yang infinity atau tak terhingga karena jenis tipe data double. Apabila tipe data "hasil" adalah
           integer maka akan menyebabkan error division by zero.
*/