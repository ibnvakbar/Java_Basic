package Inheritance;

/**
 * Created by rama on 11/11/17.
 */
public class MainInheritance {
    public static void main(String[]args){
//        Mobil m = new Mobil("500",(double)450000, (double) 3000000, "Merah");
//        System.out.println("Harga Bekas: "+m.getHargaBekas());
        Truk t = new Truk("500",(double)450000, (double) 4800000, "Merah",2700);
        System.out.println("Harga Bekas: "+t.getHargaBekas());
    }
}
