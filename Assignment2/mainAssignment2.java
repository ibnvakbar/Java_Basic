import com.sun.tools.corba.se.idl.constExpr.Or;

import java.util.ArrayList;

public class mainAssignment2 {
    public static void main(String[]args){
        ArrayList<Tumbuhan> listTumbuhan = new ArrayList<Tumbuhan>();
        ArrayList<Herbivora> listHerbivora = new ArrayList<Herbivora>();
        ArrayList<Karnivora> listKarnivora = new ArrayList<Karnivora>();
        ArrayList<OrangTua> listOrangTua = new ArrayList<OrangTua>();

//  Add Anak
        Anak vegeta = new Anak("Vegeta", " Namex", 16, 180, 70, "SMA");
        Anak melodi = new Anak("Melodi", "Solo", 24,165,45, "S1");
        Anak gohan = new Anak("Gohan", "Namex", 18, 179, 59,"S2");
        Anak bulma = new Anak("Bulma", "Manado", 19, 186, 55, "S1");

//  Add Orang Tua
        OrangTua goku = new OrangTua("Goku","Pamekasan", 35,170,65,"Mobile Engineer");
        goku.addAnak(gohan);
        goku.addAnak(melodi);


        OrangTua picolo = new OrangTua("Picolo", "Namex", 80, 189, 70, "Menteri Olahraga");
        picolo.addAnak(vegeta);
        picolo.addAnak(bulma);

        listOrangTua.add(picolo);
        listOrangTua.add(goku);

        //  Add tumbuhan
        Tumbuhan mangga = new Tumbuhan("Mangga", 200,true);
        Tumbuhan wortel = new Tumbuhan("Wortel", 15, false);
        Tumbuhan rumput = new Tumbuhan("Rumput", 5, false);
        listTumbuhan.add(mangga);
        listTumbuhan.add(wortel);
        listTumbuhan.add(rumput);

//  Add Hewan Karnivora
        Karnivora harimau = new Karnivora("Harimau", 2, 4);
        Karnivora ular = new Karnivora("Ular", 10, 0);
        Karnivora beruang = new Karnivora("Beruang", 80, 4);
        listKarnivora.add(harimau);
        listKarnivora.add(ular);
        listKarnivora.add(beruang);

//  Add Hewan Herbivora
        Herbivora ayam = new Herbivora("Ayam", 20, 2);
        Herbivora sapi = new Herbivora("Sapi", 100, 4);
        Herbivora kambing = new Herbivora("kambing", 80, 4);
        listHerbivora.add(ayam);
        listHerbivora.add(sapi);
        listHerbivora.add(kambing);


//  PRINT ALL

        for(int i=1;i<listOrangTua.size()+1;i++) {
            System.out.print(i + ". ");
            System.out.println("Nama : " + listOrangTua.get(i - 1).getNama());
            System.out.println("   "+listOrangTua.get(i-1).bernafas());
            System.out.println("   "+listOrangTua.get(i-1).kecepatan());
            System.out.println("   Makanan: "+listOrangTua.get(i-1).makan(wortel).getNama()+" dan "+listOrangTua.get(i-1).makan(ayam).getNama());
            System.out.println("   Tempat Lahir : "+listOrangTua.get(i-1).getTempatLahir());
            System.out.println("   Usia : "+listOrangTua.get(i-1).getUsia());
            System.out.println("   Tinggi Badan : "+listOrangTua.get(i-1).getTinggiBadan());
            System.out.println("   Berat Badan : "+listOrangTua.get(i-1).getBeratBadan());
            System.out.println("   Pekerjaan : "+listOrangTua.get(i-1).getPekerjaan());
            System.out.println("   Daftar Anak: ");
            int counter = 1;
            for (Anak anak:listOrangTua.get(i-1).daftarAnak()) {
                System.out.println("      "+ counter++ +". "+anak.getNama());
                System.out.println("         "+ anak.bernafas());
                System.out.println("         "+ anak.kecepatan());
                System.out.println("         Usia: "+ anak.getUsia());
                System.out.println("         Tempat Lahir: "+ anak.getTempatLahir());
                System.out.println("         Tinggi Badan: "+ anak.getTinggiBadan());
                System.out.println("         Berat Badan: "+ anak.getBeratBadan());
                System.out.println("         Pendidikan: "+ anak.getDerajatSekolah());
                System.out.println("         Makanan: "+ anak.makan(sapi).getNama()+" dan "+anak.makan(wortel).getNama());
            }
        }

        System.out.println();
        System.out.println("Daftar Tummbuhan");
        for(int i=1;i<listTumbuhan.size()+1;i++){
            System.out.print(i+". ");
            System.out.println("Nama: "+ listTumbuhan.get(i-1).getNama());
            System.out.println("   Tinggi: "+listTumbuhan.get(i-1).getTinggi());
            System.out.println("   Berbuah: "+ listTumbuhan.get(i-1).getHasBuah());
            System.out.println();

        }

        System.out.println();
        System.out.println("Daftar Hewan Herbivora");
        for(int i=1;i<listHerbivora.size()+1;i++){
            System.out.print(i+". ");
            System.out.println("Nama: "+ listHerbivora.get(i-1).getNama());
            System.out.println("   Tinggi: "+listHerbivora.get(i-1).getUkuran());
            System.out.println("   Jumlah Kaki: "+ listHerbivora.get(i-1).getJumlahKaki());
            System.out.println("   "+listHerbivora.get(i-1).bernafas());
            System.out.println("   "+listHerbivora.get(i-1).kecepatan());
            System.out.println("   Suka makan "+listHerbivora.get(i-1).makan(wortel).getNama());

        }
        System.out.println();
        System.out.println("Daftar Hewan Karnivora");
        for(int i=1;i<listKarnivora.size()+1;i++){
            System.out.print(i+". ");
            System.out.println("Nama: "+ listKarnivora.get(i-1).getNama());
            System.out.println("   Tinggi: "+listKarnivora.get(i-1).getUkuran());
            System.out.println("   Jumlah Kaki: "+ listKarnivora.get(i-1).getJumlahKaki());
            System.out.println("   "+listKarnivora.get(i-1).bernafas());
            System.out.println("   "+listKarnivora.get(i-1).kecepatan());
            System.out.println("   Suka makan "+listKarnivora.get(i-1).makan(sapi).getNama()+" dan "+listKarnivora.get(i-1).makan(ayam).getNama());

        }

    }


}
