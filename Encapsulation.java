package encapsulation;

// Kelas StopWatch
class StopWatch {
    private long startTime;
    private long endTime;

    // Konstruktor tanpa argumen
    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    // Metode untuk memulai stopwatch
    public void start() {
        startTime = System.currentTimeMillis();
    }

    // Metode untuk menghentikan stopwatch
    public void stop() {
        endTime = System.currentTimeMillis();
    }

    // Metode untuk mendapatkan waktu yang telah berlalu dalam milidetik
    public long getElapsedTime() {
        return endTime - startTime;
    }
}

// Kelas utama untuk program uji
public class Encapsulation {
    // Metode untuk melakukan pengurutan menggunakan selection sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        // Inisialisasi array dengan 100.000 angka acak
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }

        // Membuat objek stopwatch
        StopWatch stopwatch = new StopWatch();

        // Memulai stopwatch sebelum melakukan pengurutan
        stopwatch.start();

        // Melakukan pengurutan menggunakan selection sort
        selectionSort(arr);

        // Menghentikan stopwatch setelah pengurutan selesai
        stopwatch.stop();

        // Mendapatkan waktu yang diperlukan untuk pengurutan dalam milidetik
        long elapsedTime = stopwatch.getElapsedTime();

        // Menampilkan waktu yang diperlukan untuk pengurutan
        System.out.println("Waktu yang diperlukan untuk pengurutan: " + elapsedTime + " milidetik");
    }
}
