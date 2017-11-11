/**
 * Created by rama on 11/11/17.
 */
public class Barang {
    public String id;
    public String nama;
    public Integer hargaBarang;

    public Barang(String id, String nama, Integer hargaBarang) {
        this.id = id;
        this.nama = nama;
        this.hargaBarang = hargaBarang;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(Integer hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

}
