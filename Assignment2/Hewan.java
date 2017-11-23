public class Hewan extends MakhlukHidup{
    private String nama;
    private Integer ukuran;
    private Integer jumlahKaki;

    public Hewan(String nama, Integer ukuran, Integer jumlahKaki) {
        this.nama = nama;
        this.ukuran = ukuran;
        this.jumlahKaki = jumlahKaki;
    }

    public static String bernafas(){
        return "Bernafas dengan Oksigen";
    }

    public static String kecepatan(){
        return "Bergerak dengan kecepatan cepat";
    }

}
