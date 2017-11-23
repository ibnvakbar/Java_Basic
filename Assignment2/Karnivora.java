public class Karnivora extends Hewan {

    public Karnivora(String nama, Integer ukuran, Integer jumlahKaki) {
        super(nama, ukuran, jumlahKaki);
    }

    public static String bernafas(){
        return "Bernafas dengan Oksigen";
    }

    public static String kecepatan(){
        return "Bergerak dengan kecepatan cepat";
    }

    public static String makan(){
        return "Makan hewan dan tumbuhan";
    }

}
