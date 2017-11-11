/**
 * Created by rama on 11/11/17.
 */
public class PerangkatKeras extends Barang {

    private CPU cpu;
    private Memory memory;
    private HardDisk hd;

    public PerangkatKeras(String id, String nama, Integer hargaBarang, CPU cpu, Memory memory, HardDisk hd) {
        super(id, nama, hargaBarang);
        this.cpu = cpu;
        this.memory = memory;
        this.hd = hd;
    }
}
