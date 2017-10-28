package Assignment1;

import com.sun.xml.internal.bind.v2.TODO;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        Player p = new Player(Name,45, 0);
        Bilik A = new Bilik(JmlBilik);
        String[][] temp_arrayA = A.GetBilik();
        Bilik B = new Bilik(JmlBilik);
        String[][] temp_arrayB = B.GetBilik();
        int life_point = p.getLP();
        int score = p.getScore();

        while(life_point > 0){
            System.out.println("Pemain: "+p.getName());
            System.out.println("Life Point: "+life_point);

            Bilik.display(temp_arrayA,temp_arrayB);

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
                life_point+=5;
                score+=10;
            }else if (!resultA.equals(resultB)){
                life_point-=5;
                if(score <= 0){
                    score = 0;
                }else{
                    score-=5;
                }
              System.out.println("Not Match");
            }

            if(checkWin(temp_arrayA,temp_arrayB)==true){
                Bilik.display(temp_arrayA,temp_arrayB);
                System.out.println("Wah, lo jago ya");
                System.out.print("Ingin bermain kembali (y/n)?");
                String replay = input.next();
                if(replay.equals("y")) {
                    System.out.print("Masukan jumlah bilik: ");
                    Scanner x = new Scanner(System.in);
                    Integer bilik = Integer.parseInt(x.nextLine());
                    new Game_Play(p.getName(),bilik);
                    Play();
                }else if(replay.equals("n")) {
                    break;
                }
            }
        }
        System.out.println("\n Result");
        System.out.println("Score :"+score);
        System.out.println("LP :"+life_point);
        System.out.println("Terima kasih "+p.getName()+" sudah bermain!");
    }

    public static boolean checkWin(String[][] arrA, String[][] arrB){
        List<String> l_a = new ArrayList();
        List<String> l_b = new ArrayList();
        for(int i=0;i<JmlBilik;i++){
            l_a = Arrays.asList(Arrays.asList(arrA).get(i));
            l_b = Arrays.asList(Arrays.asList(arrB).get(i));
        }
        if(!l_a.contains("* ") && !l_b.contains("* ")){
            return true;
        }else{
            return false;
        }
    }
}
