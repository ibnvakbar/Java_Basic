package Assignment1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by rama on 10/23/17.
 */
public class Game_Play {
    static String Name;
    static Integer JmlBilik;

    public Game_Play(String name, Integer jmlBilik) {
        Name = name;
        JmlBilik = jmlBilik;
    }

    public static void Play() {
        Scanner input = new Scanner(System.in);
        Player p = new Player(Name, 10, 0);
        Bilik A = new Bilik(JmlBilik);
        String[][] temp_arrayA = A.GetBilik();
        Bilik B = new Bilik(JmlBilik);
        String[][] temp_arrayB = B.GetBilik();
        int life_point = p.getLP();
        int score = p.getScore();

        while(life_point>=0){
            System.out.println("Pemain: "+p.getName());
            System.out.println("Life Point: "+life_point);

            System.out.println("BILIK A");
            A.display(temp_arrayA);
//            System.out.print("\t");
            System.out.println("BILIK B");
            B.display(temp_arrayB);

//        TEBAK BILIK
            System.out.print("Tebak Bilik: ");
            String tebakan =input.nextLine();
            String[] tebak = tebakan.split(" ");
            String[] tebakanA = tebak[0].split(",");
            String[] tebakanB = tebak[1].split(",");
            Integer H_A = Integer.parseInt(tebakanA[0]);
            Integer V_A = Integer.parseInt(tebakanA[1]);
            Integer H_B = Integer.parseInt(tebakanB[0]);
            Integer V_B = Integer.parseInt(tebakanB[1]);

            String resultA = A.CheckBilik(H_A,V_A);
            System.out.println(resultA);
            String resultB = B.CheckBilik(H_B,V_B);
            System.out.println(resultB);
//            if(resultA.equals(resultB)){
//                System.out.println("True");
//            }else{
//                System.out.println("False");
//            }

            if(resultA.equals(resultB)){
//                String resultA = A.CheckBilik(H_A,V_A);
//                System.out.println(resultA);
//                String resultB = B.CheckBilik(H_B,V_B);
//                System.out.println(resultB);
                A.SetBilik(H_A,V_A,resultA);
                B.SetBilik(H_B,V_B,resultB);
//                A.display(temp_arrayA);
//                B.display(temp_arrayB);
                life_point+=5;
                score+=10;
            }else if (A.CheckBilik(H_A,V_A)!=B.CheckBilik(H_B,V_B)){
//            String resultA = A.CheckBilik(1,2);
//            System.out.println(resultA);
//            String resultB = B.CheckBilik(2,2);
//            System.out.println(resultB);
//            A.SetBilik(1,2,resultA);
                life_point-=5;
                score-=5;
              System.out.println("Not Match");
            }
        }

        System.out.println("Score :"+score);
        System.out.println("LP :"+life_point);
    }
}
