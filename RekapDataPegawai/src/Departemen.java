import java.util.ArrayList;
public class Departemen {
    ArrayList<Pegawai> listPegawai = new ArrayList<>();
    public void inputPegawai(Pegawai pegawai) {
        boolean cekId = false;
        for (Pegawai cekPegawai : listPegawai) {
            if (cekPegawai.getId() == pegawai.getId()) {
                cekId = true;
                break;
            }
        }
        if (!cekId) {
            listPegawai.add(pegawai);
        } else {
            System.out.println("Pegawai dengan id yang dimasukkan sudah ada, gagal menambahkan pegawai.");
        }
    }


    public void editPegawai(int cariId, Pegawai pegawaiBaru) {
        for (Pegawai pegawai : listPegawai) {
            if (pegawai.getId() == cariId) {
                if (!pegawaiBaru.getNamaPegawai().isEmpty()) {
                    pegawai.setNamaPegawai(pegawaiBaru.getNamaPegawai());
                }
                if (!pegawaiBaru.getAlamatPegawai().isEmpty()) {
                    pegawai.setAlamatPegawai(pegawaiBaru.getAlamatPegawai());
                }
                if (!pegawaiBaru.getDepart().isEmpty()) {
                    pegawai.setDepart(pegawaiBaru.getDepart());
                }
                if (!pegawaiBaru.getGaji().isEmpty()) {
                    pegawai.setGaji(pegawaiBaru.getGaji());
                }
            }
        }
    }

    public void displayAllPegawai() {
        for (Pegawai pegawai : listPegawai) {
            System.out.println(pegawai);
        }
    }

    public void displayPegawaiPerDept(String department) {
        for (Pegawai pegawai : listPegawai) {
            if (pegawai.getDepart().equalsIgnoreCase(department)) {
                System.out.println(pegawai);
            }
        }
    }

    public void displayDenganRangeGaji(String range) {
        int minRange = Integer.parseInt(range);
        for (Pegawai pegawai : listPegawai) {
            if (Integer.parseInt(pegawai.getGaji()) > minRange) {
                System.out.println(pegawai);
            }
        }
    }
}
