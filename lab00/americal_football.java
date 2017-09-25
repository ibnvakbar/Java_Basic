import java.util.Scanner;

/**
 * Created by rama on 9/9/17.
 */
public class americal_football {

//    public static int[] inpoot(){
//        Scanner input = new Scanner(System.in);
//        int num=input.nextInt();
//    }

    public static void checking(int[] urutan){
        // Print all the array elements
        int x = 0;
        for (int i = 0; i < urutan.length-1; i++) {
            if(urutan[i]==urutan[i+1]){
                x ++;
            }else if(urutan[i]!=urutan[i+1]){
                x = 0;
            }
            if(x >= 6){
                System.out.println("BAHAYA");
                break;
            }
        }

        if(x < 6){
            System.out.println("TIDAK BERBAHAYA");
        }
    }
//
//    public static void main(String[] args) {
//        int[] nums=inpoot();
//        int[] myList = {1,0,0,0,0,0,0,1};
//        checking(myList);
//
//    }
}

