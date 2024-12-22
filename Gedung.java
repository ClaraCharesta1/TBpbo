import java.util.Date;

public class Gedung extends Bangunan {
    private int jumlahLantai;

    // Konstruktor
    public Gedung(int id, String nama, int panjang, int lebar, String tipe, int jumlahLantai, Date tanggalDibuat) {
        // Memanggil konstruktor superclass (Bangunan)
        super(id, nama, panjang, lebar, tipe, tanggalDibuat);
        this.jumlahLantai = jumlahLantai;
    }

    // Getter untuk jumlahLantai
    public int getJumlahLantai() {
        return jumlahLantai;
    }

    // Override toString untuk menampilkan informasi gedung
    @Override
    public String toString() {
        return super.toString() + ", Jumlah Lantai: " + jumlahLantai;
    }
}
