/**
 * Created by rama on 11/11/17.
 */
public class HardDisk {
    private String tipe;
    private String kapasitas;

    public HardDisk(String tipe, String kapasitas) {
        this.tipe = tipe;
        this.kapasitas = kapasitas;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(String kapasitas) {
        this.kapasitas = kapasitas;
    }
}
