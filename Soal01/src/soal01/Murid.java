/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal01;

/**
 *
 * @author achma
 */
import java.util.ArrayList;

public class Murid {
    private String nama;
    private String nim;
    private int umur;
    private ArrayList<String> arrGuru;
    private ArrayList<Komputer> arrKomputer;

    public Murid(String nim, String nama, int umur) {
        this.nim = nim;
        this.nama = nama;
        this.umur = umur;
        this.arrGuru = new ArrayList<>();
        this.arrKomputer = new ArrayList<>();
    }

    public void addGuru(String namaGuru) {
        arrGuru.add(namaGuru);
    }

    public void addAset(Komputer komputer) {
        arrKomputer.add(komputer);
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public int getUmur() {
        return umur;
    }

    public String getListGuru() {
        if (arrGuru.isEmpty()) {
            return "Tidak punya Guru";
        }
        return String.join(", ", arrGuru);
    }

    public int getNilaiAsetKomputer() {
        int totalHarga = 0;
        for (Komputer komputer : arrKomputer) {
            totalHarga += komputer.getHargaKomponen();
        }
        return totalHarga;
    }

    public void showListAset() {
        if (arrKomputer.isEmpty()) {
            System.out.println("Tidak punya Aset");
        } else {
            System.out.println("Aset Komputer:");
            for (Komputer komputer : arrKomputer) {
                komputer.showAsetKomputer();
            }
        }
    }
}

