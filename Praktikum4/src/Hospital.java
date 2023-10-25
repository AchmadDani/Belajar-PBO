public class Hospital {
    private int id;
    private String name;
    private  Nurse[] nurses = new Nurse[3];

    public Hospital(int id, String name, Nurse[] nurses) {
        this.id = id;
        this.name = name;
        this.nurses = nurses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Nurse[] getNurses() {
        return nurses;
    }

    public void setNurses(Nurse[] nurses) {
        this.nurses = nurses;
    }
}
