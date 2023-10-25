/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal04;

/**
 *
 * @author achma
 */
public class Externalcomponent {
    private String brand;

    public Externalcomponent(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "External Component {" + brand + "}";
    }
}