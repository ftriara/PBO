public class ForLoopDemoDoWhile {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 3};
        int i = 0;
        do {
            System.out.println("elemen ke-" + i + " = " + arr[i]);
            i++;
        } while (i < 6);
    }
}
