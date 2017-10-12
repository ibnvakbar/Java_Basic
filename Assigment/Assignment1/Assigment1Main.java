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
        String name = input.nextLine();
        Integer life_point = 40;
        Number_Mate nm = new Number_Mate(name,life_point);
        System.out.println("Pemain: "+nm.getName());
        System.out.println("Life Point: "+nm.getLife_point());
        System.out.print("Masukan jumlah bilik: ");
        Integer bilik = Integer.parseInt(input.nextLine());
        nm.PlayTheGame(bilik);



    }
}
