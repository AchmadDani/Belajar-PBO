import java.util.Scanner;

public class Main {
    private static int pilihan;
    private static final Scanner input = new Scanner(System.in);
    private static final Departemen departemen = new Departemen();

    public static void main(String[] args) {
        while (true) {
            mainMenu();
            switch (pilihan) {
                case 1 -> {
                    Pegawai pegawai = createPegawai();
                    departemen.inputPegawai(pegawai);
                }
                case 2 -> {
                    System.out.print("Masukkan ID pegawai yang ingin di edit: ");
                    int editId = input.nextInt();
                    input.nextLine();
                    Pegawai pegawaiBaru = createPegawai();
                    departemen.editPegawai(editId, pegawaiBaru);
                }
                case 3 -> {
                    System.out.println("Menampilkan seluruh data pegawai:");
                    departemen.displayAllPegawai();
                }
                case 4 -> {
                    System.out.print("Masukkan departemen yang ingin ditampilkan: ");
                    String pegawaiPerdept = input.nextLine();
                    System.out.println("Menampilkan data pegawai per departemen " + pegawaiPerdept + ":");
                    departemen.displayPegawaiPerDept(pegawaiPerdept);
                }
                case 5 -> {
                    System.out.print("Masukkan gaji minimum untuk ditampilkan: ");
                    String gajiMin = input.nextLine();
                    System.out.println("Menampilkan data pegawai dengan gaji di atas " + gajiMin + ":");
                    departemen.displayDenganRangeGaji(gajiMin);
                }
                case 6 -> System.exit(0);
                default -> System.out.println("Input tidak valid. Silakan coba lagi.");
            }
        }
    }

    private static void mainMenu() {
        System.out.println("========================");
        System.out.println("Rekap Data Pegawai");
        System.out.println("1. Input data pegawai");
        System.out.println("2. Edit data pegawai");
        System.out.println("3. Menampilkan seluruh data pegawai");
        System.out.println("4. Menampilkan data pegawai per-departemen");
        System.out.println("5. Menampilkan data pegawai berdasarkan range gaji");
        System.out.println("6. Keluar");
        System.out.print("Pilihan Anda: ");
        pilihan = input.nextInt();
        input.nextLine();
    }

    private static Pegawai createPegawai() {
        System.out.println("Masukkan Biodata Pegawai:");
        System.out.print("ID: ");
        int id = Main.input.nextInt();
        Main.input.nextLine();
        System.out.print("Nama: ");
        String nama = Main.input.nextLine();
        System.out.print("Alamat: ");
        String alamat = Main.input.nextLine();
        System.out.print("Departemen: ");
        String departemen = Main.input.nextLine();
        System.out.print("Gaji: ");
        String gaji = Main.input.nextLine();
        return new Pegawai(id, nama, alamat, departemen, gaji);
    }
}