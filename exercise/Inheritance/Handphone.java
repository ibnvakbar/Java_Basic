package Inheritance;

/**
 * Created by rama on 11/15/17.
 */
public class Handphone extends TokoBekas implements BarangBekas{
    private Integer memory;
    private Integer ram;
    private Boolean kondisi;

    public Handphone(Integer memory, Double hargaBaru, Double hargaBekas, Integer ram, Boolean kondisi) {
        super(hargaBaru,hargaBekas);
        this.memory = memory;
        this.ram = ram;
        this.kondisi = kondisi;
    }
    public String getDetailHP(){
        return "Memory: "+ this.memory +"\n"+"Harga baru: "+ this.hargaBaru+"\n"+"Harga bekas: "+this.hargaBekas+"\n"
                +"RAM: "+this.ram;
    }

    @Override
    public double getHargaBekas() {
        return this.hargaBekas;
    }

    @Override
    public int getTahunKeluar() {
        return 0;
    }

    @Override
    public boolean getKondisi() {
        return true;
    }
}
