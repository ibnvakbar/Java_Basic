/**
 * Created by rama on 9/23/17.
 */
public class lab2_main {
    public static void main(String[]args){
        System.out.println("SOAL NOMER 1");
        System.out.println("########################################");
        int a[] = {1,2,3,4,5};
        Kalkulator k = new Kalkulator();
        System.out.println(k.hitung(12,"+",3));
        System.out.println(k.hitung(12,"-",3));
        System.out.println(k.hitung(12,"*",3));
        System.out.println(k.hitung(12,"/",3));
        System.out.println(k.hitung(12,"^",3));
        System.out.println(k.hitung(36,"V",2));
        System.out.println(k.hitung("V",a));
        System.out.println(k.hitung(12,"Mod",3));
        System.out.println(k.hitung("log",100));

        System.out.println("\n");
        System.out.println("SOAL NOMER 2");
        System.out.println("#########################################");
        IceCream MerahMerona = IceCream.MerahMerona;
        IceCream BiruDaun = IceCream.BiruDaun;
        IceCream icA = new IceCream(MerahMerona.getRed(),MerahMerona.getGreen(),MerahMerona.getBlue());
        IceCream icB = new IceCream(BiruDaun.getRed(),BiruDaun.getGreen(),BiruDaun.getBlue());
        IceCream tebak = IceCream.GuessIceCream(icA,icB,0.50);
        System.out.println("RGB("+ tebak.getRed() +","+ tebak.getGreen() +","+ tebak.getBlue() +")");
        IceCream.FusionIceCream(icA,icB,0.50);
    }
}
