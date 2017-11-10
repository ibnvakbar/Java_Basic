package Inheritance;

/**
 * Created by rama on 11/10/17.
 */
public class Truk extends Mobil{

//    public Truk(String kecepatan, Double hargaBaru, Double hargaBekas, String warna) {
//        super(kecepatan, hargaBaru, hargaBekas, warna);
//    }

    public Double getHargaBekas(Integer berat){
        if(berat > 2000){
            return super.getHargaBekas()*0.01;
        }else{
            return super.getHargaBekas()*0.02;
        }
    }


}
