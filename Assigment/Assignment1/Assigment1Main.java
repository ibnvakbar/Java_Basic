package Assignment1;

import java.util.Scanner;

/**
 * Created by rama on 10/11/17.
 */
public class Assigment1Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat Datang di Permainan Tebak Bilik");
        System.out.print("Silahkan Masukan Nama Anda: ");
        String name = input.nextLine();
        System.out.print("Masukan jumlah bilik: ");
        Integer bilik = Integer.parseInt(input.nextLine());
        Game_Play main = new Game_Play(name,bilik);
        main.Play();


//        if(A.CheckBilik(1,2)==B.CheckBilik(2,2)){
//            String resultA = A.CheckBilik(1,2);
//            System.out.println(resultA);
//            String resultB = B.CheckBilik(2,2);
//            System.out.println(resultB);
//            A.SetBilik(1,2,resultA);
//            B.SetBilik(2,2,resultB);
//            A.display(temp_arrayA);
//            B.display(temp_arrayB);
//        }else if(A.CheckBilik(1,2)!=B.CheckBilik(2,2)){
////            A.display(temp_arrayA);
////            B.display(temp_arrayB);
//            String resultA = A.CheckBilik(1,2);
//            System.out.println(resultA);
//            String resultB = B.CheckBilik(2,2);
//            System.out.println(resultB);
//            A.SetBilik(1,2,resultA);
//            System.out.println("Not Match");
//        }
//
    }
}

