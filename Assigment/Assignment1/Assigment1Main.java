package Assignment1;

import java.util.Scanner;

/**
 * Created by rama on 10/11/17.
 */
public class Assigment1Main{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat Datang di Permainan Tebak Bilik");
        System.out.print("Silahkan Masukan Nama Anda: ");
//        String name = input.nextLine();
        Integer life_point = 40;
        Number_Mate nm = new Number_Mate("Rama",life_point);
        System.out.println("Pemain: "+nm.getName());
        System.out.println("Life Point: "+nm.getLife_point());
        System.out.print("Masukan jumlah bilik: ");
        Integer bilik = Integer.parseInt(input.nextLine());
        Bilik bilikA = new Bilik();
        String[][] temp_bilik;
        temp_bilik = bilikA.BuatBilik(bilik);
        for(int counter=0;counter<temp_bilik.length;counter++){
            for(int counter2=0;counter2<temp_bilik[counter].length;counter2++) {
                System.out.print(temp_bilik[counter][counter2]);
            }
                System.out.println(" ");
        }




    }
}
