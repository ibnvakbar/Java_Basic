/**
 * Created by rama on 11/11/17.
 */
public class PerangkatLunak extends Barang {

    private String jenis;
    private OS os;

    public PerangkatLunak(String id, String nama, String hargaBarang, OS os, String jenis) {
        super(id, nama, hargaBarang);
        this.os = os;
        this.jenis=jenis;
    }
}
