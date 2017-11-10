package Inheritance;

/**
 * Created by rama on 11/10/17.
 */
public class Mobil {
    public String kecepatan;
    public Double hargaBaru;
    public Double hargaBekas;
    public String warna;

    public Mobil(String kecepatan, Double hargaBaru, Double hargaBekas, String warna){
        this.kecepatan=kecepatan;
        this.hargaBaru=hargaBaru;
        this.hargaBekas=hargaBekas;
        this.warna=warna;
    }

    public Double getHargaBekas(){
        return this.hargaBekas;
    }


}
