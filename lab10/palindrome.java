import com.sun.org.apache.xpath.internal.operations.Bool;

public class palindrome {

    private boolean isPalindrome = true;
    private stack s;
    public palindrome(){
        s=new stack();
    }
    public Boolean isPalindrome(String string){
        String karakter = string.replaceAll("\\s","").replace("!","").replace(",","").replace(".","").toLowerCase();
        int position=0;
//        System.out.println(karakter);
        for(int i = 0; i<string.length(); i++){
            s.push(karakter.substring(i,i+1));
//            System.out.println(i+" "+ (i+1));
        }
        while(s.count()>0){
            if(!karakter.substring(position,position+1).equalsIgnoreCase(s.pop().toString())){
                isPalindrome=false;
                break;
            }
            position++;
        }
        return isPalindrome;
    }

    public static void main(String args[]){
        palindrome p = new palindrome();
        String karakter = "Draw, O coward!";
        System.out.println(p.isPalindrome(karakter));
//        p.isPalindrome(karakter);

    }
}
