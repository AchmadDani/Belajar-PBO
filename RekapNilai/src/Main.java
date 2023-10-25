import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static int pilihan;
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double overallMax = Double.MIN_VALUE; // Nilai maksimum keseluruhan
        double overallMin = Double.MAX_VALUE; // Nilai minimum keseluruhan
        double overallSum = 0; // Jumlah nilai rata-rata semua kelas

        ArrayList<Mahasiswa> kelas = new ArrayList<>(); // ArrayList untuk menyimpan objek Mahasiswa (kelas)
        while (true) {
            mainMenu(); // Memanggil menu utama
            switch (pilihan) {
                case 1 -> {
                    System.out.println("Masukkan jumlah kelas: ");
                    int nomorKelas = input.nextInt();

                    for (int i = 1; i <= nomorKelas; i++) {
                        System.out.println("Masukkan nama kelas ke-" + i + ": ");
                        String namaKelas = input.next();
                        Mahasiswa mhs = new Mahasiswa(namaKelas); // Membuat objek Mahasiswa untuk kelas ini
                        mhs.inputData(); // Memanggil method inputData untuk mengisi nilai-nilai Mahasiswa
                        kelas.add(mhs); // Menambahkan objek Mahasiswa ke dalam ArrayList
                    }
                }
                case 2 -> {
                    for (Mahasiswa mhs : kelas) {
                        mhs.displayData(); // Menampilkan nilai-nilai untuk setiap kelas
                        System.out.println("Rata-rata perkelas: " + mhs.calculateAverage()); // Menampilkan rata-rata
                        System.out.println("Nilai tertinggi perkelas: " + mhs.findMax()); // Menampilkan nilai tertinggi
                        System.out.println("Nilai terendah perkelas: " + mhs.findMin()); // Menampilkan nilai terendah
                    }
                }
                case 3 -> {
                    for (Mahasiswa mhs : kelas) {
                        overallSum += mhs.calculateAverage(); // Menambahkan rata-rata kelas ke dalam total
                        if (mhs.findMax() > overallMax) {
                            overallMax = mhs.findMax(); // Memperbarui nilai maksimum keseluruhan
                        }
                        if (mhs.findMin() < overallMin) {
                            overallMin = mhs.findMin(); // Memperbarui nilai minimum keseluruhan
                        }
                    }
                    double overallAverage = overallSum / kelas.size(); // Menghitung rata-rata keseluruhan
                    System.out.println("Rata-rata keseluruhan: " + overallAverage); // Menampilkan rata-rata keseluruhan
                    System.out.println("Nilai tertinggi keseluruhan: " + overallMax); // Menampilkan nilai tertinggi keseluruhan
                    System.out.println("Nilai terendah keseluruhan: " + overallMin); // Menampilkan nilai terendah keseluruhan
                }
                case 4 -> System.exit(0); // Keluar dari program
                default -> System.out.println("Tidak ada pilihan yang sesuai"); // Pesan kesalahan jika input tidak valid
            }
        }
    }

    private static void mainMenu() {
        System.out.println("========================");
        System.out.println("Rekap Nilai PBO D3 RPLA");
        System.out.println("1. Input kelas dan nilai");
        System.out.println("2. Lihat nilai, rata-rata, tertinggi, dan terendah Perkelas");
        System.out.println("3. Lihat nilai, rata-rata, tertinggi, dan terendah Keseluruhan kelas");
        System.out.println("4. Keluar");
        System.out.print("Masukkan Menu : ");
        pilihan = input.nextInt(); // Meminta input pilihan menu dari pengguna
    }
}
