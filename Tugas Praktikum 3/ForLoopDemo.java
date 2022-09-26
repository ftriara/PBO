// file ForLoopDemo.java
public class ForLoopDemo {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 3};

        //ForLoop Sebelum
        /*for (int i = 1; i < 6; i++) {
            System.out.println("elemen ke-" + i + " = " + arr[i]);
        }*/

        //ForLoop Sesudah Perbaikan
        for (int i = 0; i < 5; i++) {
            System.out.println("elemen ke-" + (i+1) + " = " + arr[i]);
        }
    }
}

//Penulisan kode perulangan dengan for pada code tersebut belum tepat karena perulangan seharusnya dimulai dari
//indeks ke-nol untuk dapat mengakses elemen pertama
