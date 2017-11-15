package Inheritance;

/**
 * Created by rama on 11/10/17.
 */
public class Truk extends Mobil{


    private int berat;
    public Truk(String kecepatan, Double hargaBaru, Double hargaBekas, String warna,Boolean kondisi, Integer berat) {
        super(kecepatan, hargaBaru, hargaBekas, warna,kondisi);
        this.berat=berat;
    }

    public double getHargaBekas(){
        if(berat > 2000){
            return super.getHargaBekas()*0.01;
        }else{
            return super.getHargaBekas()*0.02;
        }
    }


}
