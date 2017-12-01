public class Herbivora extends Hewan{

    public Herbivora(String nama, Integer ukuran, Integer jumlahKaki) {
        super(nama, ukuran, jumlahKaki);
    }

    public static String bernafas(){
        return "Bernafas dengan Oksigen";
    }

    public static String kecepatan(){
        return "Bergerak dengan kecepatan cepat";
    }

    public static Tumbuhan makan(Tumbuhan tumbuhan){
        Tumbuhan t = new Tumbuhan(tumbuhan.getNama(),tumbuhan.getTinggi(),tumbuhan.getHasBuah());
        return t;
    }
}
