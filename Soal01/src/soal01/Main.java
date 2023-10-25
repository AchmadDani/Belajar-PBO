/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal01;

/**
 *
 * @author achma
 */
public class Main {
    public static void main(String[] args) {
        Murid m1 = new Murid("2301", "Ssuszi", 20);
        Murid m2 = new Murid("2300", "sasukw", 30);

        Guru d1 = new Guru("Kakashi", "Wakasek I");
        Guru d2 = new Guru("Jiraya", "Kepala Sekolah");
        Guru d3 = new Guru("Yamato", "Wakasek II");

        Komputer lp1 = new Komputer("Acer", "Predator", 10000);
        lp1.addKomponen(new Mouse("Rexus", "ARKA-II", 200),
            new Keyboard("Rexus", "DAIVA-68SF", 400));

        Komputer lp2 = new Komputer("Asus", "ROG", 12000);
        lp2.addKomponen(new Mouse("Fantech", "ARIA-XD7", 800),
            new Keyboard("Fantech", "MAXFIT-67", 1000));

        m1.addGuru(d1.getNama());
        m1.addGuru(d2.getNama());
        m1.addGuru(d3.getNama());
        m1.addAset(lp1);
        m1.addAset(lp2);

        // m2.addGuru(d2.getNama());

        System.out.println("\n---------- Data Mahasiswa -----------");
        System.out.println("Nama : " + m1.getNama() + " (" + m1.getUmur() + " tahun)\nNIM : " + m1.getNim());
        System.out.println("Pernah diajar oleh : " + m1.getListGuru());
        System.out.println("Total Nilai Aset : Ryo " + m1.getNilaiAsetKomputer());
        System.out.println("--------- Aset yang Dimiliki --------");
        m1.showListAset();

        System.out.println("\n---------- Data Mahasiswa -----------");
        System.out.println("Nama : " + m2.getNama() + " (" + m2.getUmur() + " tahun)\nNIM : " + m2.getNim());
        System.out.println("Pernah diajar oleh : " + m2.getListGuru());
        System.out.println("Total Nilai Aset : Ryo " + m2.getNilaiAsetKomputer());
        System.out.println("--------- Aset yang Dimiliki --------");
        m2.showListAset();
    }
}
