public class Manusia extends MakhlukHidup {
    private String nama;
    private String tempatLahir;
    private Integer usia;
    private Integer tinggiBadan;
    private Integer beratBadan;

    public Manusia(String nama, String tempatLahir, Integer usia, Integer tinggiBadan, Integer beratBadan) {
        this.nama = nama;
        this.tempatLahir = tempatLahir;
        this.usia = usia;
        this.tinggiBadan = tinggiBadan;
        this.beratBadan = beratBadan;
    }
    /* TODO
    Check methods below, use polymorphism or not
    */
    public static String kecepatan(){
        return "Bergerak dengan kecepatan sedang";
    }

    public static String bernafas(){
        return "Bernafas dengan Oksigen";
    }

    public static String makan(){
        return "Makan hewan dan tumbuhan";
    }
}
