import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) throws Exception, ParseException {
        String path = "/Users/ramadhana/Downloads/order_pulsa.txt";
        List<Integer> daftarNominal = Arrays.asList(10,25,50,100);
        ArrayList<Integer> howard = new ArrayList<Integer>();
        ArrayList<Integer> jarvis = new ArrayList<Integer>();
        ArrayList<Integer> happy = new ArrayList<Integer>();
        ArrayList<Integer> pepper = new ArrayList<Integer>();
        ArrayList<Integer> friday = new ArrayList<Integer>();



        try {
            FileReader fr = new FileReader(path);
            Scanner sc = new Scanner(fr);
            ArrayList<String> trx_arr = new ArrayList();
            String tanggal;
            String trx[];
            String jenis;
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            String date = sc.nextLine();

            df.parse(date);
            tanggal = date;

            while(sc.hasNextLine()) {
                String l = sc.nextLine();
                trx_arr.add(l);
            }
            sc.close();

            for(int i=1;i<trx_arr.size();i++) {
                trx = trx_arr.get(i).split("\\s");
                String provider = trx[0];
                String pulsa  = trx[1];
                String tipePembelian = pulsa.substring(0,1) ;
                int nominal = Integer.parseInt(pulsa.substring(1,pulsa.length()));


                cekProvider(provider);

                if(provider.equals("Howard")){
                    if(tipePembelian.contains("V")){
                        howard.add(nominal+3);
                    }else {
                        howard.add(nominal+2);
                    }
                }else if(provider.equals("Jarvis")){
                    if(tipePembelian.contains("V")){
                        jarvis.add(nominal+2);
                    }else {
                        jarvis.add(nominal+1);
                    }
                }else if(provider.contains("Happy")){
                    if(tipePembelian.contains("V")){
                        happy.add(nominal+3);
                    }else {
                        happy.add(nominal+2);
                    }
                }else if(provider.contains("Pepper")){
                    if(tipePembelian.contains("V")){
                        pepper.add(nominal+3);
                    }else {
                        pepper.add(nominal+2);
                    }
                }else if(provider.contains("Friday")){
                    if(tipePembelian.contains("V")){
                        friday.add(nominal+2);
                    }else {
                        friday.add(nominal+1);
                    }
                }
                int grandTotal=0;
                String grandTotalStr = "";
                PrintWriter saveHappy = new PrintWriter("/Users/ramadhana/Downloads/Happy.txt");
                for(int j=0;j<happy.size();j++){
                    grandTotal+=happy.get(j);
                    if(j==0){
                        grandTotalStr=grandTotalStr+happy.get(j);
                    }else{
                        grandTotalStr=grandTotalStr+"+"+happy.get(j);
                    }
                }
                saveHappy.println(tanggal+"Total Penjualan = Rp"+ grandTotal*1000+"("+grandTotalStr+")");
                saveHappy.close();

                grandTotal=0;
                grandTotalStr = "";
                PrintWriter saveJarvis = new PrintWriter("/Users/ramadhana/Downloads/Jarvis.txt");
                for(int j=0;j<jarvis.size();j++){
                    grandTotal+=jarvis.get(j);
                    if(j==0){
                        grandTotalStr=grandTotalStr+jarvis.get(j);
                    }else{
                        grandTotalStr=grandTotalStr+"+"+jarvis.get(j);
                    }
                }
                saveJarvis.println(tanggal+"Total Penjualan = Rp"+ grandTotal*1000+"("+grandTotalStr+")");
                saveJarvis.close();

                grandTotal=0;
                grandTotalStr = "";
                PrintWriter savePepper = new PrintWriter("/Users/ramadhana/Downloads/Pepper.txt");
                for(int j=0;j<pepper.size();j++){
                    grandTotal+=pepper.get(j);
                    if(j==0){
                        grandTotalStr=grandTotalStr+pepper.get(j);
                    }else{
                        grandTotalStr=grandTotalStr+"+"+pepper.get(j);
                    }
                }
                savePepper.println(tanggal+"Total Penjualan = Rp"+ grandTotal*1000+"("+grandTotalStr+")");
                savePepper.close();

                grandTotal=0;
                grandTotalStr = "";
                PrintWriter saveFriday = new PrintWriter("/Users/ramadhana/Downloads/Friday.txt");
                for(int j=0;j<friday.size();j++){
                    grandTotal+=friday.get(j);
                    if(j==0){
                        grandTotalStr=grandTotalStr+friday.get(j);
                    }else{
                        grandTotalStr=grandTotalStr+"+"+friday.get(j);
                    }
                }
                saveFriday.println(tanggal+"Total Penjualan = Rp"+ grandTotal*1000+"("+grandTotalStr+")");
                saveFriday.close();

                grandTotal=0;
                grandTotalStr = "";
                PrintWriter saveHoward = new PrintWriter("/Users/ramadhana/Downloads/Howard.txt");
                for(int j=0;j<howard.size();j++){
                    grandTotal+=howard.get(j);
                    if(j==0){
                        grandTotalStr=grandTotalStr+howard.get(j);
                    }else{
                        grandTotalStr=grandTotalStr+"+"+howard.get(j);
                    }
                }
                saveHoward.println(tanggal+"Total Penjualan = Rp"+ grandTotal*1000+"("+grandTotalStr+")");
                saveHoward.close();
            }
        }catch (FileNotFoundException expt){
            System.out.println("File Tidak Ditemukan");
        }catch (NumberFormatException expt){
            System.out.println("Terdapat kesalahan dalam penulisan angka");
        }finally {
            System.out.println("Success!");
        }
    }

    public static void cekProvider(String provider) throws NotFoundException {
        List<String> daftarProvider = Arrays.asList("Jarvis", "Friday", "Pepper","Happy","Howard");
        if(!daftarProvider.contains(provider)){
            throw new NullPointerException("Data Tidak ada di Daftar");
        }
    }
}
