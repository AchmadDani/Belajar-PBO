/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal01;

/**
 *
 * @author achma
 */
public class Mouse {
    private String merk;
    private String seri;
    private int harga;
    
    public Mouse(String merk, String seri, int Harga) {
        this.merk = merk;
        this.seri = seri;
        this.harga = Harga;
    }

    /**
     * @return the merk
     */
    public String getMerk() {
        return merk;
    }

    /**
     * @return the seri
     */
    public String getSeri() {
        return seri;
    }

    /**
     * @return the harga
     */
    public int getHarga() {
        return harga;
    }
   
 
}
