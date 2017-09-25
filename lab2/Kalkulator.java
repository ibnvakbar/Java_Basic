/**
 * Created by rama on 9/23/17.
 */
public class Kalkulator {
    private static int a;
    private static int b;
    String operator;

    public int addition(int a,int b){
        this.a=a;
        this.b=b;
        return a+b;
    }

    public int substraction(int a, int b){
        this.a=a;
        this.b=b;
        return a-b;
    }

    public int multiplication(int a,int b){
        this.a=a;
        this.b=b;
        return a*b;
    }

    public double division(int a, int b){
        this.a=a;
        this.b=b;
        return a/b;
    }

    public int pangkat(int a, int b){
        this.a=a;
        this.b=b;
        return (int) Math.pow(a,b);
    }

    public double akar(int a, int b){
        this.a=a;
        this.b=b;
        return Math.pow(a,1.0/b);
    }

    public int modulo(int a,int b){
        this.a=a;
        this.b=b;
        return a%b;
    }

//    public double log(int a){
//        this.a=a;
//        return Math.log(a);
//    }

    public int hitung(int a,String operator, int b){
        if(operator == "+"){
            return this.addition(a,b);
        }else if(operator == "-"){
            return this.substraction(a,b);
        }else if(operator == "*"){
            return this.multiplication(a,b);
        }else if(operator == "/"){
            return (int) this.division(a,b);
        }else if(operator == "^"){
            return this.pangkat(a,b);
        }else if(operator == "Mod"){
            return this.modulo(a,b);
        }else if(operator == "V"){
            return (int) this.akar(a,b);
        }
        return 0;
    }

    public double hitung(String operator, int a){
        if(operator=="log"){
            return Math.log10(a);
        }
        return 0;
    }

    public int hitung(String operator, int[] a){
        int result=0;
        if(operator=="V"){
            for(int i=0;i<a.length;i++){
                result+=a[i];
            }
        }
        return result/a.length;
    }
}
