import java.util.ArrayList;
import java.util.List;

/**
 * Created by rama on 9/30/17.
 */
public class fibonanci {
    public void isFibo(int x){
        int firstNum=0;
        int secondNum=1;
        int thirdNum=0;
        List<Integer> fiboList=new ArrayList<Integer>();
        fiboList.add(secondNum);
        for(int i=1;i<x;i++){
            thirdNum=firstNum+secondNum;
//            System.out.print(thirdNum+" ");
            fiboList.add(thirdNum);
            firstNum=secondNum;
            secondNum=thirdNum;
        }
        System.out.println(fiboList.get(fiboList.size()-1));
    }
}
