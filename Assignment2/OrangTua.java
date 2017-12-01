import java.util.ArrayList;
import java.util.List;

public class OrangTua extends Manusia{
    private String pekerjaan;
    private ArrayList<Anak> kid;
    public OrangTua(String nama, String tempatLahir, Integer usia, Integer tinggiBadan, Integer beratBadan, String pekerjaan) {
        super(nama, tempatLahir, usia, tinggiBadan, beratBadan);
        this.pekerjaan=pekerjaan;
        this.setUsia(usia);
        kid = new ArrayList<Anak>();

    }

    private void setUsia(Integer usia) {
        if(usia<25){
            throw new ArithmeticException("Usia orang tua tidak boleh lebih kurang 25");
        }
    }

    public String kecepatan(){
        return "Bergerak dengan kecepatan sedang";
    }
    public  void addAnak(Anak anak) {
        kid.add(anak);
    }

    public List<Anak> daftarAnak(){
        return kid;
    }

    public String bernafas(){
        return "Bernafas dengan Oksigen";
    }



    public boolean cekUsia(int usia){
        if(usia>25){
            return true;
        }else{
            return false;
        }
    }

    public String getPekerjaan() {
        return pekerjaan;
    }
}
