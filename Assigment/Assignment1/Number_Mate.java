package Assignment1;

import com.sun.xml.internal.bind.v2.TODO;

/**
 * Created by rama on 10/11/17.
 */
public class Number_Mate {
    String Name;
    Integer life_point;
    Integer score;
    Integer room;

    public Number_Mate(String Name, Integer life_point){
        this.Name=Name;
        this.life_point=life_point;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getLife_point() {
        return life_point;
    }

    public void setLife_point(Integer life_point) {
        this.life_point = life_point;
    }

//    TODO

    public static void PlayTheGame(int x){
        int [][] bilik = new int[x][x];
        System.out.print("Bilik A");
        System.out.print("\t"+"\t");
        System.out.println("Bilik B");
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                System.out.print("* ");
            }
            System.out.print("\t"+"\t");

            for(int j=0;j<x;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}
