package Assignment1;

import java.util.Random;
/**
 * Created by rama on 10/23/17.
 */
public class Bilik {
    Integer jumlah_bilik;
    String bilik_matriks[][];
    public Bilik(Integer jumlah_bilik){
        this.jumlah_bilik=jumlah_bilik;
    }

    public String[][] GetBilik(){
        bilik_matriks=new String[jumlah_bilik][jumlah_bilik];
        for(int i=0;i<bilik_matriks.length;i++){
            for(int j=0;j<bilik_matriks[i].length;j++){
                bilik_matriks[i][j] = "* ";
            }
        }
        return bilik_matriks;
    }

    public void SetBilik(int horizon, int vertica, String result){
        bilik_matriks[horizon-1][vertica-1]= result+" ";
    }

    public String CheckBilik(int horizon, int vertica){
        Random rand = new Random();
        String[][] random_bilik=new String[jumlah_bilik][jumlah_bilik];
        for(int i=0;i<random_bilik.length;i++){
            for(int j=0;j<random_bilik[i].length;j++){
                random_bilik[i][j] = String.valueOf(rand.nextInt((jumlah_bilik*jumlah_bilik)-jumlah_bilik)+jumlah_bilik)+" ";
            }
        }
        return random_bilik[horizon-1][vertica-1];
    }

    public static void display(String[][] ArrayBilikA, String[][] ArrayBilikB){
        System.out.println("BILIK A");
        for (int counter = 0; counter < ArrayBilikA.length; counter++) {
            for (int counter2 = 0; counter2 < ArrayBilikA[counter].length; counter2++) {
                System.out.print(ArrayBilikA[counter][counter2]);
            }
            System.out.println(" ");
        }
        System.out.println("\t \t");
        System.out.println("BILIK B");
        for (int counter = 0; counter < ArrayBilikB.length; counter++) {
            for (int counter2 = 0; counter2 < ArrayBilikB[counter].length; counter2++) {
                System.out.print(ArrayBilikB[counter][counter2]);
            }
            System.out.println(" ");
        }
    }
}
