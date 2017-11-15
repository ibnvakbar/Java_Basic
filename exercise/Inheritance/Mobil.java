package Inheritance;

/**
 * Created by rama on 11/10/17.
 */
public class Mobil  extends TokoBekas implements BarangBekas {
    private String kecepatan;
    private String warna;
    private Boolean kondisi;

    public Mobil(String kecepatan, Double hargaBaru, Double hargaBekas, String warna, Boolean kondisi){
        super(hargaBaru,hargaBekas);
        this.kecepatan=kecepatan;
        this.warna=warna;
        this.kondisi=kondisi;
    }

    public double getHargaBekas(){
        return this.hargaBekas;
    }

    @Override
    public int getTahunKeluar() {
        return 0;
    }

    public boolean getKondisi(){
        return this.kondisi;
    }


}
