/**
 * Created by rama on 11/11/17.
 */
public class PerangkatLunak extends Barang {

    private String jenis;

    public PerangkatLunak(String id, String nama, Integer hargaBarang, String jenis) {
        super(id, nama, hargaBarang);
        this.jenis=jenis;
    }
}
