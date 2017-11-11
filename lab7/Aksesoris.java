/**
 * Created by rama on 11/11/17.
 */
public class Aksesoris extends Barang{

    private String deskripsi;
    public Aksesoris(String id, String nama, Integer hargaBarang, String deskripsi) {
        super(id, nama, hargaBarang);
        this.deskripsi=deskripsi;
    }
}
