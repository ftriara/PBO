// Nama  : Fitria Rahmadani
// NIM   : M0521022
// Kelas : Informatika A

/**
 * Class ThreadPrint merupakan class yang mewarisi class Thread dari Java
 */
public class ThreadPrint extends Thread {
    /**
     * Deklarasi atribut yang diperlukan berbentuk array
     */
    Object[] printObject;

    /**
     * Constructor dari class ThreadPrint
     */
    ThreadPrint(Object[] printObject) {
        this.printObject = printObject;
    }

    /**
     * Method run() yang merupakan method bawaan dari class Thread
     */
    @Override
    public void run() {
        for (Object object : printObject) {
            System.out.println(object);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}