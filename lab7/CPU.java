/**
 * Created by rama on 11/11/17.
 */
public class CPU {
    private String nama;
    private String speed;


    public CPU(String nama, String speed) {
        this.nama = nama;
        this.speed = speed;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
}
