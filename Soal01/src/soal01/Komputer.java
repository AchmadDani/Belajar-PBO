/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal01;

/**
 *
 * @author achma
 */
public class Komputer {
    private String merk;
    private String tipe;
    private int harga;
    private Mouse mouse;
    private Keyboard keyboard;

    public Komputer(String merk, String tipe, int harga) {
        this.merk = merk;
        this.tipe = tipe;
        this.harga = harga;
    }

    public void addKomponen(Mouse mouse, Keyboard keyboard) {
        this.mouse = mouse;
        this.keyboard = keyboard;
    }

    public String getMerk() {
        return merk;
    }

    public String getTipe() {
        return tipe;
    }

    public int getHarga() {
        return harga;
    }

    public int getHargaKomponen() {
        int totalHarga = harga;
        if (mouse != null) {
            totalHarga += mouse.getHarga();
        }
        if (keyboard != null) {
            totalHarga += keyboard.getHarga();
        }
        return totalHarga;
    }

    public void showAsetKomputer() {
        System.out.println("Komputer: " + merk + " " + tipe);
        System.out.println("Harga: " + harga);
        if (mouse != null) {
            System.out.println("Mouse: " + mouse.getMerk() + " " + mouse.getSeri());
        }
        if (keyboard != null) {
            System.out.println("Keyboard: " + keyboard.getMerk() + " " + keyboard.getSeri());
        }
    }
}
