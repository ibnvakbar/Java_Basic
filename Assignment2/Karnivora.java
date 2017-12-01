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

    public static Karnivora makan(Karnivora karnivora){
        Karnivora k = new Karnivora(karnivora.getNama(),karnivora.getUkuran(),karnivora.getJumlahKaki());
        return k;
    }

    public static Herbivora makan(Herbivora herbivora){
        Herbivora h = new Herbivora(herbivora.getNama(), herbivora.getUkuran(), herbivora.getJumlahKaki());
        return h;
    }

}
