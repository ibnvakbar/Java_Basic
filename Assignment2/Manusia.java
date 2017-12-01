public class Manusia extends MakhlukHidup {
    private String tempatLahir;
    public int usia;
    private Integer tinggiBadan;
    private Integer beratBadan;

    public Manusia(String nama, String tempatLahir, Integer usia, Integer tinggiBadan, Integer beratBadan) {
        super(nama);
        this.tempatLahir = tempatLahir;
        this.usia = usia;
        this.tinggiBadan = tinggiBadan;
        this.beratBadan = beratBadan;
    }
    /* TODO
    Check methods below, use polymorphism or not
    */
    public String kecepatan(){
        return "Bergerak dengan kecepatan sedang";
    }

    public String bernafas(){
        return "Bernafas dengan Oksigen";
    }

    public static Tumbuhan makan(Tumbuhan tumbuhan){
        Tumbuhan t = new Tumbuhan(tumbuhan.getNama(),tumbuhan.getTinggi(),tumbuhan.getHasBuah());
        return t;
    }

    public static Hewan makan(Hewan hewan){
        Hewan h = new Hewan(hewan.getNama(),hewan.getUkuran(),hewan.getJumlahKaki());
        return h;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public Integer getUsia() {
        return usia;
    }

    public Integer getTinggiBadan() {
        return tinggiBadan;
    }

    public Integer getBeratBadan() {
        return beratBadan;
    }

}
