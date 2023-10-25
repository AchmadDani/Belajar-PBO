import java.util.ArrayList;
import java.util.Scanner;

// Mendefinisi kelas Mahasiswa yang mengimplementasikan interface NilaiPbo.
public class Mahasiswa implements NilaiPbo {
    // Deklarasi ArrayList untuk menyimpan nilai-nilai PBO dari mahasiswa.
    private final ArrayList<Double> scores = new ArrayList<>();
    // Deklarasi variabel untuk menyimpan nama kelas.
    private final String namaKelas;

    // Konstruktor untuk kelas Mahasiswa, menerima nama kelas sebagai parameter.
    public Mahasiswa(String namaKelas) {
        // Inisialisasi nama kelas menggunakan nilai yang diterima dari parameter konstruktor.
        this.namaKelas = namaKelas;
    }

    // Implementasi metode inputData() dari interface NilaiPbo.
    @Override
    public void inputData() {
        // Masukkan input, baca nilai dan tambah nilai ke dalam ArrayList.
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai PBO untuk kelas " + namaKelas + " (selesaikan input dengan -1): ");
        while (true) {
            double nilai = input.nextDouble();
            // Jika input nilai -1 dimasukkan, proses input akan dihentikan.
            if (nilai == -1) {
                break;
            }
            // Menambahkan nilai ke dalam ArrayList.
            scores.add(nilai);
        }
    }

    // Implementasi metode displayData() dari interface NilaiPbo.
    @Override
    public void displayData() {
        // Tampilkan nilai-nilai PBO untuk kelas yang sesuai.
        System.out.println("Nilai PBO untuk kelas " + namaKelas + ": " + scores);
    }

    // Implementasi metode calculateAverage() dari interface NilaiPbo.
    @Override
    public double calculateAverage() {
        double sum = 0;
        // Hitung jumlah total dari nilai-nilai PBO.
        for (double nilai : scores) {
            sum += nilai;
        }
        // Hitung rata-rata nilai PBO dan return hasilnya.
        return sum / scores.size();
    }

    // Implementasi metode findMax() dari interface NilaiPbo.
    @Override
    public double findMax() {
        double max = Double.MIN_VALUE;
        // Cari nilai maksimum dari nilai-nilai PBO.
        for (double nilai : scores) {
            if (nilai > max) {
                max = nilai;
            }
        }
        // return nilai maksimum yang ditemukan.
        return max;
    }

    // Implementasi metode findMin() dari interface NilaiPbo.
    @Override
    public double findMin() {
        double min = Double.MAX_VALUE;
        // Cari nilai minimum dari nilai-nilai PBO.
        for (double nilai : scores) {
            if (nilai < min) {
                min = nilai;
            }
        }
        // return nilai minimum yang ditemukan.
        return min;
    }
}
