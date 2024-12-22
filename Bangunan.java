import java.util.Date;

public class Bangunan {
    private int id;
    private String nama;
    private int panjang;
    private int lebar;
    private String tipe;
    private Date tanggalDibuat; // Tidak statik lagi
    
    // Constructor
    public Bangunan(int id, String nama, int panjang, int lebar, String tipe, Date tanggalDibuat) {
        this.id = id;
        this.nama = nama;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tipe = tipe;
        this.tanggalDibuat = tanggalDibuat;
    }

    // Getters dan setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public Date getTanggalDibuat() {
        return tanggalDibuat;
    }

    public void setTanggalDibuat(Date tanggalDibuat) {
        this.tanggalDibuat = tanggalDibuat;
    }

    @Override
    public String toString() {
        return "Bangunan [id=" + id + ", nama=" + nama + ", panjang=" + panjang + ", lebar=" + lebar + ", tipe=" + tipe
                + ", tanggalDibuat=" + tanggalDibuat + "]";
    }
}
