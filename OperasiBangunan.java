import java.util.List;

public interface OperasiBangunan {
    void tambahBangunan(Bangunan bangunan);
    List<Bangunan> lihatDataBangunan();
    void updateBangunan(Bangunan bangunan);
    void deleteBangunan(int id);
}
