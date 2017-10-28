import java.util.Scanner;

/**
 * Created by rama on 10/28/17.
 */
public class anagram {
    public void printAnagram(String name, String regex) {
        if (name.length() == 0) {
            System.out.println(regex);
        }
        for (int i = 0; i < name.length(); i++) {
            printAnagram(name.substring(0, i) + name.substring(i + 1, name.length()), name.charAt(i) + regex);
        }
    }


    public static void main(String[] args) {
        anagram ana = new anagram();
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert you name: ");
        String nama = sc.next();
        System.out.println(nama);
        ana.printAnagram(nama, "");
    }
}
