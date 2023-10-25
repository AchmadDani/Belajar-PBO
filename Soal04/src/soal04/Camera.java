/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal04;

/**
 *
 * @author achma
 */
import java.util.ArrayList;

public class Camera {
    private String brand, model;
    private ArrayList<Lens> compatibleLenses;
    private ArrayList<Externalcomponent> externalcomponents;
    private ArrayList<ExtarnalFilter> extarnalFilters;

    public Camera(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.compatibleLenses = new ArrayList<>();
        this.externalcomponents = new ArrayList<>();
        this.extarnalFilters = new ArrayList<>();
    }

    public void takePicture() {
        // TAKE PICTURE
    }

    
    public void takeVideo() {
        // TAKE VIDEO
    }

    
    public void timeLapse() {
        // TIME LAPSE
    }

    public void addCompatibleLens(Lens Lens) { compatibleLenses.add(Lens); }

    public void addExternalcomponent(Externalcomponent component) { externalcomponents.add(component); }

    public void addExternalFilter(ExtarnalFilter filter) { extarnalFilters.add(filter); }


    @Override
    public String toString() {
        return "Camera{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", compatibleLenses=" + compatibleLenses +
                ", externalComponents=" + externalcomponents +
                '}';
    }
}