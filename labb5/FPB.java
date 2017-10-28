import java.util.Scanner;

/**
 * Created by rama on 10/28/17.
 */
public class FPB {

    public static Integer fpb(Integer a,Integer b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else {
            return fpb(b, a % b);
        }
    }
    public static Integer curBat(Integer a, Integer b, Integer c){
        int sisa = fpb(a,c);
        c -= sisa;
        if(c == 0){
            return a;
        }else{
            return curBat(b, a, c);
        }
    }

    public static void main(String[]args){
        FPB f = new FPB();
        Scanner input = new Scanner(System.in);
        Integer pemainA = input.nextInt();
        Integer pemainB = input.nextInt();
        Integer batu = input.nextInt();

        Integer play = f.curBat(pemainA,pemainB,batu);
        if(play==pemainA){
            System.out.println(0);
        }else if(play==pemainB){
            System.out.println(1);
        }
    }
}
