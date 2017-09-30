/**
 * Created by rama on 9/30/17.
 */
public class star {
    int a,b;
    public star(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void printStar(){
        int x;
        if(b % 2 == 0){
            x = b /2;
        }else{
            x = b / 2+1;
        }
        for(int i=1; i<=x;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=1; k<=this.a; k++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        for(int i = this.b/2;i>=1;i--){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=1; k<=this.a; k++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }
}
