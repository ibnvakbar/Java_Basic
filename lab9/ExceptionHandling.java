import com.sun.javafx.logging.PulseLogger;

import java.util.Scanner;

public class ExceptionHandling {
    public Integer pulsa(String provider, String tipePulsa){
        String jenis = tipePulsa.substring(0,1);
        int nominal = Integer.valueOf(tipePulsa.substring(1,tipePulsa.length()))*1000;
        int hargaJual=0;

        if(jenis=="E") {
            if (provider == "Jarvis") {
                hargaJual = nominal + 1000;
            } else if (provider == "Friday") {
                hargaJual = nominal + 1000;
            } else {
                hargaJual = nominal + 2000;
            }
        }else if(jenis=="V"){
            hargaJual = nominal+1000;
        }
        return hargaJual;
    }

    public static void main(String[] args){
        String path = "/Users/ramadhana/Downloads/order_pulsa.txt";
        Scanner sc = new Scanner(System.in);
        String provider = sc.next();
        String tipe = sc.next();

        ExceptionHandling p = new ExceptionHandling();
        System.out.println(p.pulsa(provider,tipe));

    }
}
