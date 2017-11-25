package exception;

public class Example3 {
    public void coba(int a){
        int arrayA[]=new int[a];
        int arrayB;
        for(;a>=0;a--){
            arrayA[a]=a;
            System.out.println(a);
        }
//        try{
//            for(int x=0;x<a;x++){
//                arrayA[a]=a;
//                System.out.println(a);
//            }
////            arrayB = a;
//        }
//        catch (IndexOutOfBoundsException e){
//            System.out.println("Error index" +a);
//        }
//        catch (NullPointerException e){
//            System.out.println("Error null pointer"+ a);
//        }
//        catch (Exception e){
//            System.out.println("Error Lain"+ a);
//        }
//        finally {
//            System.out.println("Selesai"+ a);
//        }
//        return a;
    }

    public static void main(String[]args){
        Example3 e = new Example3();
        e.coba(5);
    }
}
