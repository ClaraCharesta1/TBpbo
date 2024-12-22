import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class ManajemenBangunan implements OperasiBangunan {

    // Create
    @Override
    public void tambahBangunan(Bangunan bangunan) {
        String query = "INSERT INTO bangunan (nama, panjang, lebar, tipe, tanggal_dibuat) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, bangunan.getNama());
            stmt.setInt(2, bangunan.getPanjang());
            stmt.setInt(3, bangunan.getLebar());
            stmt.setString(4, bangunan.getTipe());
            stmt.setDate(5, new java.sql.Date(bangunan.getTanggalDibuat().getTime())); // Menggunakan Date
            stmt.executeUpdate();
            System.out.println("Bangunan berhasil ditambahkan ke database.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Read
    @Override
    public List<Bangunan> lihatDataBangunan() {
        List<Bangunan> bangunans = new ArrayList<>();
        String query = "SELECT * FROM bangunan";
        try (Connection connection = DatabaseConnection.getConnection();
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String nama = rs.getString("nama");
                int panjang = rs.getInt("panjang");
                int lebar = rs.getInt("lebar");
                String tipe = rs.getString("tipe");
                Date tanggalDibuat = rs.getDate("tanggal_dibuat");
                Bangunan bangunan = new Bangunan(id, nama, panjang, lebar, tipe, tanggalDibuat);
                bangunans.add(bangunan);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bangunans;
    }

    // Update
    @Override
    public void updateBangunan(Bangunan bangunan) {
        String query = "UPDATE bangunan SET nama = ?, panjang = ?, lebar = ?, tipe = ?, tanggal_dibuat = ? WHERE id = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, bangunan.getNama());
            stmt.setInt(2, bangunan.getPanjang());
            stmt.setInt(3, bangunan.getLebar());
            stmt.setString(4, bangunan.getTipe());
            stmt.setDate(5, new java.sql.Date(bangunan.getTanggalDibuat().getTime())); // Menggunakan Date
            stmt.setInt(6, bangunan.getId());
            stmt.executeUpdate();
            System.out.println("Bangunan berhasil diupdate.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete
    @Override
    public void deleteBangunan(int id) {
        String query = "DELETE FROM bangunan WHERE id = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Bangunan berhasil dihapus.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
