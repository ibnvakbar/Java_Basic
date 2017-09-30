import java.util.ArrayList;

/**
 * Created by rama on 9/30/17.
 */
public class primes {
    int x;
    public primes(int x){
        this.x = x;
    }
    public void isPrime(){
        boolean prime;
        int z;
        int counter=1;
        for(int i = 0; i<=this.x; i++){
            prime = true;
            z = 2;
            while(z<i){
                if(i%z==0){
                    prime = false;
                }
                z++;
            }
            if(prime==true){
                System.out.println("Bilangan prima ke "+counter+" = "+i);
                counter++;
            }
        }
    }
}
