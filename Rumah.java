import java.util.Date;

public class Rumah extends Bangunan {
    private boolean memilikiGarasi;

    // Konstruktor
    public Rumah(int id, String nama, int panjang, int lebar, String tipe, boolean memilikiGarasi, Date tanggalDibuat) {
        // Memanggil konstruktor superclass (Bangunan)
        super(id, nama, panjang, lebar, tipe, tanggalDibuat);
        this.memilikiGarasi = memilikiGarasi;
    }

    // Getter untuk memilikiGarasi
    public boolean isMemilikiGarasi() {
        return memilikiGarasi;
    }

    // Override toString untuk menampilkan informasi rumah
    @Override
    public String toString() {
        return super.toString() + ", Memiliki Garasi: " + (memilikiGarasi ? "Ya" : "Tidak");
    }
}

