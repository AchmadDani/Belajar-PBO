/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal04;

/**
 *
 * @author achma
 */
public class Lens {
    public String brand;
    public int focalLenght;

    public Lens(String brand, int focalLenght) {
        this.brand = brand;
        this.focalLenght = focalLenght;
    }

    @Override
    public String toString() {
        return "Lens " + brand + " (" + focalLenght + "mm)"; 
    }
}