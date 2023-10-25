/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal01;

/**
 *
 * @author achma
 */
public class Keyboard {
    private String merk;
    private String seri;
    private int harga;

    public Keyboard(String merk, String seri, int harga) {
        this.merk = merk;
        this.seri = seri;
        this.harga = harga;
    }

    public String getMerk() {
        return merk;
    }

    public String getSeri() {
        return seri;
    }

    public int getHarga() {
        return harga;
    }
}
