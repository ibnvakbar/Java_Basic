import java.util.ArrayList;

public class OrangTua extends Manusia{
    private String pekerjaan;
    private ArrayList anak;
    public OrangTua(String nama, String tempatLahir, Integer usia, Integer tinggiBadan, Integer beratBadan, String pekerjaan, ArrayList anak) {
        super(nama, tempatLahir, usia, tinggiBadan, beratBadan);
        this.pekerjaan=pekerjaan;
        this.anak=anak;

    }

    public static String kecepatan(){
        return "Bergerak dengan kecepatan sedang";
    }

    public static String bernafas(){
        return "Bernafas dengan Oksigen";
    }

    public static String makan(){
        return "Makan hewan dan tumbuhan";
    }

    public boolean cekUsia(int usia){
        if(usia>25){
            return true;
        }else{
            return false;
        }
    }
}
