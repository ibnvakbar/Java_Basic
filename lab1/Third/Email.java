package Third;

import java.util.Scanner;

/**
 * Created by rama on 9/16/17.
 */
public class Email {
    public static void main(String[]args){
        System.out.println("Masukan data <daftar> <nama depan> <nama belakang>: ");
        Scanner sc =  new Scanner(System.in);
        String xx = sc.next();
        String first_name = sc.next();
        String last_name = sc.next();

        System.out.println("Data berhasil dimasukan");
        System.out.println("nama: "+first_name+" "+last_name);
        System.out.println("email: "+first_name.toLowerCase()+"."+last_name.toLowerCase()+"@bingbing.com");
    }
}
