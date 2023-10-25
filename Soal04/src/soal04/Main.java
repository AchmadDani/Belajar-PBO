/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal04;

/**
 *
 * @author achma
 */
public class Main {
    public static void main(String[] args) {
        // Create a camera
        Camera camera = new Camera("Sony", "Alpha 7");


        // Create some lenses
        camera.addCompatibleLens(new Lens("Canon RF 50mm f/1.8 STM", 50));
        camera.addCompatibleLens(new Lens("Canon RF 10-24mm f/4L USM", 24));

        // Create some external filters
        ExtarnalFilter ndFilter = new ExtarnalFilter();
        ndFilter.setType("ND-500 Filter");
        ExtarnalFilter cplFilter = new ExtarnalFilter();
        cplFilter.setType("Polarizer Filter");
        camera.addExternalFilter(cplFilter);
        camera.addExternalFilter(ndFilter);

        // Create some external components
        Externalcomponent adapter = new Externalcomponent("Tripod");
        Externalcomponent exFlash = new Externalcomponent("External Flash");
        camera.addExternalcomponent(adapter);
        camera.addExternalcomponent(exFlash);
        
        // Display camera information
        System.out.println(camera);

        // Take a picture using the camera
        camera.takePicture();

        // Take a video using the camera
        camera.takeVideo();

        // Perform a time-lapse using the camera
        camera.timeLapse();
    }
}

