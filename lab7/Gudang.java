import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rama on 11/11/17.
 */
public class Gudang {
    private List<Barang> daftarBarang = new ArrayList<Barang>();

    public List<Barang> getDaftarBarang() {
        return daftarBarang;
    }

    public void setDaftarBarang(List<Barang> daftarBarang) {
        this.daftarBarang = daftarBarang;
    }

    public void GenerateBarang() throws IOException {
        String FILENAME = "/media/rama/ANYTHING/Kuliah di UI/daftarBarang.txt";
        BufferedReader br = null;
        FileReader fr = null;

        //br = new BufferedReader(new FileReader(FILENAME));
        fr = new FileReader(FILENAME);
        br = new BufferedReader(fr);

        String sCurrentLine;
        List<String> daftarBarang = new ArrayList<String>();

        while ((sCurrentLine = br.readLine()) != null) {
//                String[] words = sCurrentLine.split("/");
            if (sCurrentLine.contains("//")) {
                continue;
            }
            daftarBarang.add(sCurrentLine);
        }
        br.close();
        String[] list_pk;
        String[] list_cpu;
        String[] list_memory;
        String[] list_hardisk;
        String[] list_pl;
        String[] list_as;

        for (String s : daftarBarang) {
            if (s.contains("PerangkatKeras")) {
                list_pk = s.split(",");
                list_cpu = list_pk[4].split(" ");
                list_memory = list_pk[5].split(" ");
                list_hardisk = list_pk[6].split(" ");
                String cpu_name = "";
                String cpu_speed = "";
                String memory_tipe = "";
                String memory_kapasistas = "";
                String hardisk_tipe = "";
                String hardisk_kapasistas = "";

//                CPU
                for (int i = 0; i < list_cpu.length - 2; i++) {
                    cpu_name += list_cpu[i] + " ";
                }
                for (int i = list_cpu.length - 2; i < list_cpu.length; i++) {
                    cpu_speed += list_cpu[i] + " ";
                }

//              MEMORY
                if (list_memory.length == 3) {
                    for (int i = 0; i < list_memory.length - 2; i++) {
                        memory_tipe += list_memory[i] + " ";
                    }
//                    System.out.println(memory_tipe);
                    for (int i = list_memory.length - 2; i < list_memory.length; i++) {
                        memory_kapasistas += list_memory[i] + " ";
                    }
//                    System.out.println(memory_kapasistas);
                } else if (list_memory.length == 2) {
                    memory_tipe = "";
                    for (int i = 0; i < list_memory.length; i++) {
                        memory_kapasistas += list_memory[i] + " ";
                    }
                }
//              HARD DISK
                if (list_hardisk.length == 3) {
                    for (int i = 0; i < list_hardisk.length - 2; i++) {
                        hardisk_tipe += list_hardisk[i] + " ";
                    }
                    for (int i = list_hardisk.length - 2; i < list_hardisk.length; i++) {
                        hardisk_kapasistas += list_hardisk[i] + " ";
                    }
//                    System.out.println(hardisk_kapasistas);
                } else if (list_memory.length == 2) {
                    hardisk_tipe = "";
                    for (int i = 0; i < list_hardisk.length; i++) {
                        hardisk_kapasistas += list_hardisk[i] + " ";
                    }
                }

                CPU cpu = new CPU(cpu_name,cpu_speed);
                Memory memory = new Memory(memory_tipe,memory_kapasistas);
                HardDisk hd = new HardDisk(hardisk_tipe,hardisk_kapasistas);
                PerangkatKeras pk = new PerangkatKeras(list_pk[0],list_pk[2],list_pk[3],cpu,memory,hd);
                this.daftarBarang.add(pk);

            } else if (s.contains("PerangkatLunak")) {
                list_pl = s.split(",");
                String pl_os = "";
                pl_os = list_pl[4];

                OS os = new OS(pl_os);
                PerangkatLunak pl = new PerangkatLunak(list_pl[0],list_pl[2],list_pl[3],os,list_pl[4]);
                this.daftarBarang.add(pl);

            } else if (s.contains("Aksesoris")) {
                list_as = s.split(",");
                String as_deskripsi = "";
                as_deskripsi = list_as[4];

                Aksesoris as = new Aksesoris(list_as[0],list_as[2],list_as[3],as_deskripsi);
                this.daftarBarang.add(as);
            }

        }
        setDaftarBarang(this.daftarBarang);
    }

    public void CetakBarang() throws IOException {
        GenerateBarang();
        System.out.println("DAFTAR BARANG:");
        for(int x=0; x<this.daftarBarang.size();x++){
            System.out.println(this.daftarBarang.get(x).getNama()+" - "+this.daftarBarang.get(x).getHargaBarang());
        }
    }
}
