public class Tumbuhan extends MakhlukHidup {
    private String nama;
    private Integer tinggi;
    private Boolean hasBuah;

    public Tumbuhan(String nama, Integer tinggi, Boolean hasBuah) {
        this.nama = nama;
        this.tinggi = tinggi;
        this.hasBuah = hasBuah;
    }

    public static String bernafas(){
        return "Bernafas dengan Oksigen";
    }
    
}
