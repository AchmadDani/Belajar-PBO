public class Pegawai {
    private int id;
    private String namaPegawai;
    private String alamatPegawai;
    private String  Depart;
    private String  Gaji;

    public Pegawai(int id, String namaPegawai, String alamatPegawai, String depart, String gaji) {
        this.id = id;
        this.namaPegawai = namaPegawai;
        this.alamatPegawai = alamatPegawai;
        this.Depart = depart;
        this.Gaji = gaji;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaPegawai() {
        return namaPegawai;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public String getAlamatPegawai() {
        return alamatPegawai;
    }

    public void setAlamatPegawai(String alamatPegawai) {
        this.alamatPegawai = alamatPegawai;
    }

    public String getDepart() {
        return Depart;
    }

    public void setDepart(String depart) {
        Depart = depart;
    }

    public String getGaji() {
        return Gaji;
    }

    public void setGaji(String gaji) {
        Gaji = gaji;
    }

    @Override
    public String toString() {
        return "============================================\n" +
                "ID: " + id + "\n" +
                "Nama Pegawai: " + namaPegawai + "\n" +
                "Alamat Pegawai: " + alamatPegawai + "\n" +
                "Departemen: " + Depart + "\n" +
                "Gaji: " + Gaji + "\n" +
                "============================================";
    }

}
