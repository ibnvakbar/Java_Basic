/**
 * Created by rama on 9/30/17.
 */
public class lab3_main {
    public static void main(String[]args){
        star st = new star(4,5);
        st.printStar();
        System.out.println("\n");
        primes p = new primes(30);
        p.isPrime();
        System.out.println("\n");
        fibonanci fb = new fibonanci();
        fb.isFibo(9);

    }
}
