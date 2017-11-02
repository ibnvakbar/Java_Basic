package Recursive;

/**
 * Created by rama on 11/2/17.
 */
public class Questions {
    public static void main(String[]args){
        Questions q  = new Questions();
        System.out.println(q.banyak("haloooo"));
    }

//    1
    public int banyak(String a){
        int counter = 0;
        if(a.length()<=1){
            return counter;
        }else if(a.charAt(0)==a.charAt(1)){
            counter ++;
            banyak(a.substring(1,a.length()));
//        }else{
//            counter +=0;
//            banyak(a.substring(1,a.length()));
//        }
        return counter;
    }


}
