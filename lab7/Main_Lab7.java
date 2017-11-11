import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rama on 11/11/17.
 */
public class Main_Lab7 {
    private static final String FILENAME = "/media/rama/ANYTHING/Kuliah di UI/daftarBarang.txt";
    public static void main(String[]args) throws IOException {
        BufferedReader br = null;
        FileReader fr = null;

        //br = new BufferedReader(new FileReader(FILENAME));
        fr = new FileReader(FILENAME);
        br = new BufferedReader(fr);

        String sCurrentLine;
        List<String> daftarBarang = new ArrayList<String>();

        while ((sCurrentLine = br.readLine()) != null) {
//                String[] words = sCurrentLine.split("/");
            if(sCurrentLine.contains("//")){
                continue;
            }
            daftarBarang.add(sCurrentLine);
        }
        br.close();
        String[] list_pk;
        String[] list_cpu;
        String[] list_memory;
        String[] list_hardisk;
        String list_aksesoris;
        String list_cpu_name = "";
        String[] list_pl;
        List<String> list_as = new ArrayList<String>();

        for(String s:daftarBarang){
            if(s.contains("PerangkatKeras")){
                list_pk = s.split(",");
                list_cpu = list_pk[4].split(" ");
                list_memory = list_pk[5].split(" ");
                list_hardisk = list_pk[6].split(" ");
                String cpu_name = "";
                String cpu_speed = "";
                String memory_tipe = "";
                String memory_kapasistas = "";
                String hardisk_tipe = "";
                String hardisk_kapasistas="";

//                CPU
                for(int i=0;i<list_cpu.length -2;i++){
                    cpu_name += list_cpu[i]+" ";
                }
                for(int i=list_cpu.length -2;i<list_cpu.length;i++){
                    cpu_speed += list_cpu[i]+" ";
                }
//              MEMORY
                if(list_memory.length==3) {
                    for (int i = 0; i < list_memory.length - 2; i++) {
                        memory_tipe += list_memory[i] + " ";
                    }
//                    System.out.println(memory_tipe);
                    for (int i = list_memory.length - 2; i < list_memory.length; i++) {
                        memory_kapasistas += list_memory[i] + " ";
                    }
//                    System.out.println(memory_kapasistas);
                }else if(list_memory.length==2){
                    memory_tipe = "";
                    for (int i = 0; i < list_memory.length; i++) {
                        memory_kapasistas += list_memory[i] + " ";
                    }
                }
//              HARD DISK
                if(list_hardisk.length==3) {
                    for (int i = 0; i < list_hardisk.length - 2; i++) {
                        hardisk_tipe += list_hardisk[i] + " ";
                    }
                    for (int i = list_hardisk.length - 2; i < list_hardisk.length; i++) {
                        hardisk_kapasistas += list_hardisk[i] + " ";
                    }
//                    System.out.println(hardisk_kapasistas);
                }else if(list_memory.length==2){
                    hardisk_tipe = "";
                    for (int i = 0; i < list_hardisk.length; i++) {
                        hardisk_kapasistas += list_hardisk[i] + " ";
                    }
                }
//                System.out.println(list_pk[0]+","+list_pk[2]+","+list_pk[3]+","+cpu_name+","+cpu_speed+","
//                        +memory_tipe+","+memory_kapasistas+","+hardisk_tipe+","+hardisk_kapasistas);
//                Barang pk = new PerangkatKeras(list_pk[0],list_pk[2],list_pk[3],)

            }else if(s.contains("PerangkatLunak")){


            }else if(s.contains("Aksesoris")){

            }
        }
    }
}
