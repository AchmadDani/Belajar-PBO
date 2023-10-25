public class Main2 {
    public static void main(String[] args) {
        Hospital hsp1 = new Hospital(
                1,"RS-Bakti Timah",
                new Nurse[]{
                        new Nurse(1, "Inka"),
                        new Nurse(2, "Laras"),
                        new Nurse(3, "Dwi")
                }
        );
        Hospital hsp2 = new Hospital(
                2,"Mayapada",
                new Nurse[]{
                        new Nurse(1, "Affa"),
                        new Nurse(2, "Hawa"),
                        new Nurse(3, "Lestari")
                }
        );
        System.out.println("Perawat Rumah Sakit Bakti Timah");
        for (Nurse nurse : hsp1.getNurses()){
            System.out.println(nurse);
        }
        System.out.println();

        System.out.println("Perawat Rumah Sakit Mayapada");
        for (Nurse nurse : hsp2.getNurses()){
            System.out.println(nurse);
        }
    }
}
