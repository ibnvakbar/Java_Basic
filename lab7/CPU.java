/**
 * Created by rama on 11/11/17.
 */
public class CPU {
    private String nama;
    private Double speed;


    public CPU(String nama, Double speed) {
        this.nama = nama;
        this.speed = speed;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }
}
