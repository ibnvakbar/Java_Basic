public class Hewan extends MakhlukHidup{
    private Integer ukuran;
    private Integer jumlahKaki;

    public Hewan(String nama, Integer ukuran, Integer jumlahKaki) {
        super(nama);
        this.ukuran = ukuran;
        this.jumlahKaki = jumlahKaki;
    }

    public static String bernafas(){
        return "Bernafas dengan Oksigen";
    }

    public static String kecepatan(){
        return "Bergerak dengan kecepatan cepat";
    }

    public String getNama() {
        return nama;
    }

    public Integer getUkuran() {
        return ukuran;
    }

    public Integer getJumlahKaki() {
        return jumlahKaki;
    }
}
