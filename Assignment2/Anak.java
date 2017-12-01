import java.text.ParseException;
import java.util.ArrayList;

public class Anak extends Manusia {
    private String derajatSekolah;

    public Anak(String nama, String tempatLahir, Integer usia, Integer tinggiBadan, Integer beratBadan,String derajatSekolah) {
        super(nama, tempatLahir, usia, tinggiBadan, beratBadan);
        this.derajatSekolah=derajatSekolah;
        this.setUsia(usia);
    }

    public String getDerajatSekolah() {
        return derajatSekolah;
    }

    private void setUsia(Integer usia) throws ArithmeticException {
        if(usia>25){
            throw new ArithmeticException("Usia anak tidak boleh lebih dari 25");
        }

    }

    public String kecepatan(){
        return "Bergerak dengan kecepatan sedang";
    }

    public String bernafas(){
        return "Bernafas dengan Oksigen";
    }

    public static String makan(){
        return "Makan hewan dan tumbuhan";
    }
}
