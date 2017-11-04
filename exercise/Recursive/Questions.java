package Recursive;

/**
 * Created by rama on 11/2/17.
 */
public class Questions {
    public static void main(String[]args){
        Questions q  = new Questions();
        System.out.println(q.banyak("hhloooo"));
        System.out.println(q.endX("rama"));
    }

//    1
    public int banyak(String a){
        int counter = 0;
//        System.out.println(a.charAt(0));
//        System.out.println(a.charAt(1));
        if(a.length()<=1){
            return counter;
        }else if(a.charAt(0)==a.charAt(1)){
            counter ++;
            banyak(a.substring(1,a.length()));
        }else{
            counter +=0;
            banyak(a.substring(1,a.length()));
        }
        return counter;
    }

    public String endX(String param){
        if(param.length()==0){
            return "";
        }else if(param.length()==1) {
            return param + "X";
        }else if(param.length()>1){
            return endX(param.substring(1,param.length()));
        }
        return param+"X";
    }
}
