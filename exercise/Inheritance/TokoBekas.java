package Inheritance;

/**
 * Created by rama on 11/15/17.
 */
public class TokoBekas {
    public Double hargaBaru;
    public Double hargaBekas;

    private double potonganPenjual = 0.5;

    public TokoBekas(Double hargaBaru, Double hargaBekas) {
        this.hargaBaru = hargaBaru;
        this.hargaBekas = hargaBekas;
    }

    public double jualBarang(Double hargaBekas){
        return this.hargaBekas*potonganPenjual;
    }
}
