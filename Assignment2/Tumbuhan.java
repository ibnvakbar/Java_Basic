public class Tumbuhan extends MakhlukHidup {
    private Integer tinggi;
    private Boolean hasBuah;

    public Tumbuhan(String nama, Integer tinggi, Boolean hasBuah) {
        super(nama);
        this.tinggi = tinggi;
        this.hasBuah = hasBuah;
    }

    public static String bernafas(){
        return "Bernafas dengan Oksigen";
    }

    public Integer getTinggi() {
        return tinggi;
    }

    public Boolean getHasBuah() {
//        if(true) {
//            return "Berbuah";
//        }else{
//            return "Tidak Berbuah";
//        }
        return hasBuah;
    }
}
