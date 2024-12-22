import java.util.Date;
import java.util.Scanner;

public class ProgramManajemenBangunan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManajemenBangunan manajemenBangunan = new ManajemenBangunan();

        while (true) {
            // Menu utama
            System.out.println("+----------------------------------+");
            System.out.println("|          Menu Utama             |");
            System.out.println("+----------------------------------+");
            System.out.println("1. Tambah Bangunan");
            System.out.println("2. Lihat Data Bangunan");
            System.out.println("3. Update Bangunan");
            System.out.println("4. Hapus Bangunan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (pilihan) {
                case 1:
                    // Tambah Bangunan
                    System.out.println("\n=== Tambah Bangunan ===");
                    System.out.print("Masukkan nama bangunan: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan panjang bangunan (meter): ");
                    int panjang = scanner.nextInt();
                    System.out.print("Masukkan lebar bangunan (meter): ");
                    int lebar = scanner.nextInt();
                    scanner.nextLine(); // Clear buffer
                    System.out.print("Masukkan tipe bangunan (Gedung/Rumah): ");
                    String tipe = scanner.nextLine();
                    Date tanggalDibuat = new Date(); // Mendapatkan tanggal saat ini
                    Bangunan bangunan = new Bangunan(0, nama, panjang, lebar, tipe, tanggalDibuat);
                    manajemenBangunan.tambahBangunan(bangunan);
                    break;

                case 2:
                    // Lihat Data Bangunan
                    System.out.println("\n=== Data Bangunan ===");
                    manajemenBangunan.lihatDataBangunan().forEach(b -> {
                        System.out.println("Nama: " + b.getNama() + ", Panjang: " + b.getPanjang() +
                                ", Lebar: " + b.getLebar() + ", Tipe: " + b.getTipe() + 
                                ", Tanggal Dibuat: " + b.getTanggalDibuat());
                    });
                    break;

                case 3:
                    // Update Bangunan
                    System.out.println("\n=== Update Bangunan ===");
                    System.out.print("Masukkan ID bangunan yang ingin diupdate: ");
                    int idUpdate = scanner.nextInt();
                    scanner.nextLine(); // Clear buffer
                    System.out.print("Masukkan nama bangunan baru: ");
                    String namaUpdate = scanner.nextLine();
                    System.out.print("Masukkan panjang baru (meter): ");
                    int panjangUpdate = scanner.nextInt();
                    System.out.print("Masukkan lebar baru (meter): ");
                    int lebarUpdate = scanner.nextInt();
                    scanner.nextLine(); // Clear buffer
                    System.out.print("Masukkan tipe bangunan baru: ");
                    String tipeUpdate = scanner.nextLine();
                    Date tanggalUpdate = new Date(); // Tanggal saat update
                    Bangunan updateBangunan = new Bangunan(idUpdate, namaUpdate, panjangUpdate, lebarUpdate, tipeUpdate, tanggalUpdate);
                    manajemenBangunan.updateBangunan(updateBangunan);
                    break;

                case 4:
                    // Hapus Bangunan
                    System.out.println("\n=== Hapus Bangunan ===");
                    System.out.print("Masukkan ID bangunan yang ingin dihapus: ");
                    int idDelete = scanner.nextInt();
                    manajemenBangunan.deleteBangunan(idDelete);
                    break;

                case 5:
                    // Keluar
                    System.out.println("Terima kasih! Program selesai.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
            }
        }
    }
}
