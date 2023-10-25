/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal03;

/**
 *
 * @author achma
 */public class Developer {
    private String nama;
    private int gaji;

    public Developer(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public int getGaji() {
        return gaji;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "nama='" + nama + '\'' +
                ", gaji=" + gaji +
                '}';
    }
}