package Assignment1;

/**
 * Created by rama on 10/23/17.
 */
public class Bilik {
    Integer jumlah_bilik;
    public String[][] BuatBilik(int jumlah_bilik){
        String bilik_matriks[][]=new String[jumlah_bilik][jumlah_bilik];

        for(int i=0;i<bilik_matriks.length;i++){
            for(int j=0;j<bilik_matriks[i].length;j++){
                bilik_matriks[i][j] = "* ";
            }
        }
        return bilik_matriks;
    }
}
