package Assignment1;

import java.text.MessageFormat;
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

        while(life_point>0){
            System.out.println("Pemain: "+p.getName());
            System.out.println("Life Point: "+life_point);

            System.out.println("BILIK A");
            Bilik.display(temp_arrayA);
            System.out.println("BILIK B");
            Bilik.display(temp_arrayB);

//        TEBAK BILIK
            System.out.print("Tebak Bilik: ");
            String tebakan =input.nextLine();
            String[] tebak = tebakan.split(" ");
            String[] tebakanA = tebak[0].split(",");
            String[] tebakanB = tebak[1].split(",");
            Integer horizontalA = Integer.parseInt(tebakanA[0]);
            Integer verticalA = Integer.parseInt(tebakanA[1]);
            Integer horizontalB = Integer.parseInt(tebakanB[0]);
            Integer verticalB = Integer.parseInt(tebakanB[1]);

            String resultA = A.CheckBilik(horizontalA,verticalA);
            String resultB = B.CheckBilik(horizontalB,verticalB);

            if(resultA.equals(resultB)){
                A.SetBilik(horizontalA,verticalA,resultA);
                B.SetBilik(horizontalB,verticalB,resultB);
//                A.display(temp_arrayA);
//                B.display(temp_arrayB);
                life_point+=5;
                score+=10;
            }else if (A.CheckBilik(horizontalA,verticalA)!=B.CheckBilik(horizontalB,verticalB)){
                life_point-=5;
                if(score < 0){
                    score = 0;
                }else{
                    score-=5;
                }
              System.out.println("Not Match");
            }
        }

        System.out.println("Score :"+score);
        System.out.println("LP :"+life_point);
    }
}
