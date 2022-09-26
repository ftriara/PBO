public class ForLoopDemoDoWhile {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 3};
        int i = 0;
        
         //ForLoop Sebelum
        /*for (int i = 1; i < 6; i++) {
            System.out.println("elemen ke-" + i + " = " + arr[i]);
        }*/

        //Do While Sesudah Perbaikan
        do {
            System.out.println("elemen ke-" + (i+1) + " = " + arr[i]);
            i++;
        } while (i < 5);
    }
}
