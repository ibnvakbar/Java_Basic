import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by rama on 9/16/17.
 */
public class main {

    public static void main(String[]args) throws ParseException {
        Account agung = new Account();
        Account david = new Account(10000);
        agung.setBalance(10000);
//        Nomer 1.
//        david.getBalance();
//        agung.getBalance();
//        Beda karena parameter untuk david diisi 10000
//        agung.balance = 1000; error karena untuk mengisi nilai balance harus melalui sebuah method tidak bisa langsung
//        diisi seperti diatas.
        david.deposit(20000);
        david.withdraw(5000);
        System.out.println("Nomer 1");
        System.out.print(david.getBalance());


//        KALENDER
        System.out.println("\n");
        System.out.println("Nomer 2");
        System.out.println("\n");

        Kalender kal = new Kalender();
        kal.AddDay(100);
        String strToDate = String.format("%d-%d-%d", kal.Year,kal.Month,kal.dayOfMonth);
        DateFormat dtFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date dt = dtFormat.parse(strToDate);
        String day = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(dt);
        String tgl = new SimpleDateFormat("dd", Locale.ENGLISH).format(dt);
        System.out.println("100 hari kedapan adalah tanggal"+" "+tgl+" "+"hari "+ day);

        Kalender kal2 = new Kalender();
        kal2.AddDay(10000);
        String strToDate2 = String.format("%d-%d-%d", kal2.Year,kal2.Month,kal2.dayOfMonth);
        DateFormat dtFormat2 = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date dt2 = dtFormat2.parse(strToDate2);
        String bln = new SimpleDateFormat("MMMM", Locale.ENGLISH).format(dt2);
        String tgl2 = new SimpleDateFormat("dd", Locale.ENGLISH).format(dt2);
        String thn = new SimpleDateFormat("YYYY", Locale.ENGLISH).format(dt2);
        System.out.println("10000 hari kedapan adalah "+tgl2+" "+thn+" "+bln);

        Kalender kal3 = new Kalender(22,03,1993);
        String tahun_lahir = kal3.ultahDiTahun(2017);
        System.out.println("Hari lahir kamu adalah"+" "+tahun_lahir);
    }
}
