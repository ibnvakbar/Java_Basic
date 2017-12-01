import java.util.Scanner;

public class CountElement {
    public static int hitung(String[] arr, int nilai){
        if(nilai == 0){
            return Integer.valueOf(arr[nilai]);
        }else{
            return Integer.valueOf(arr[nilai])+hitung(arr,nilai-1);
        }
    }
    public static void main(String[] args) {
        System.out.print("Masukan nilai dalam Array: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] tmp_list = input.replace("[", "").replace("]", "").replace("{", "").replace("}", "").split(",");
        System.out.println(hitung(tmp_list,tmp_list.length-1));
    }

}
