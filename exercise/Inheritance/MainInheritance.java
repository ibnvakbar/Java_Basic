package Inheritance;

/**
 * Created by rama on 11/11/17.
 */
public class MainInheritance {
    public static void main(String[]args){
        System.out.println("Mobil");
        Mobil m = new Mobil("500",(double)450000, (double) 3000000,"Merah",true);
        System.out.println("Harga Jual Barang: "+m.jualBarang(m.getHargaBekas()));
        System.out.println("Harga Bekas: "+m.getHargaBekas());

        System.out.println("\nTruk");
        Truk t = new Truk("500",(double)450000, (double) 4800000, "Merah",true,2700);
        System.out.println("Harga Bekas: "+t.getHargaBekas());
        System.out.println("Harga Jual barang: "+t.jualBarang(t.getHargaBekas()));

        System.out.println("\nHandphone");
        Handphone hp = new Handphone(3,330000.0,150000.0,4,true);
        System.out.println("Kondisi HP layak ?"+hp.getKondisi());
        System.out.println(hp.getDetailHP());
        System.out.println("Harga Jual Barang: "+hp.jualBarang(hp.getHargaBekas()));
    }
}
