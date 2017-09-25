/**
 * Created by rama on 9/23/17.
 */
public class IceCream {

    private Integer red;
    private Integer green;
    private Integer blue;
//    private Integer merah;

    public static final IceCream MerahMerona = new IceCream(255,0,255);
    public static final IceCream BiruDaun = new IceCream(0,0,127);

    public IceCream(Integer red, Integer green, Integer blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;

    }

    public Integer getRed() {
        return red;
    }


    public Integer getBlue() {
        return blue;
    }

    public Integer getGreen() {

        return green;
    }


    public static IceCream GuessIceCream(IceCream ICA, IceCream ICB, double position){

        int R = (int) Math.abs((ICA.getRed()+ICB.getRed())*position);
        int G = (int) Math.abs((ICA.getGreen()+ICB.getGreen())*position);
        int B = (int) Math.abs((ICA.getBlue()+ICB.getBlue())*position);
        IceCream gueesIceCream = new IceCream(R,G,B);
        return gueesIceCream;
    }

    public static void FusionIceCream(IceCream ICA, IceCream ICB, double position){
        String rasa = null;
        IceCream ICC = GuessIceCream(ICA, ICB, position);
        int R = Math.abs((ICA.getRed()+ICB.getRed()+ICC.getRed())/3);
        int G = Math.abs((ICA.getGreen()+ICB.getGreen()+ICC.getGreen())/3);
        int B = Math.abs((ICA.getBlue()+ICB.getBlue()+ICC.getBlue())/3);

        if(R > G && R > B){
            rasa = "Strawberry Asem Manis";
        }else if(G > R && G > B){
            rasa = "Melon Papua";
        }else if(B > R && B > G){
            rasa = "Blueberry Amazon";
        }else if(G == R || G == B || B == R ){
            rasa = "Rendang";
        }
        System.out.println("Ice Cream baru dengan warna RGB("+R+","+G+","+B+") dengan rasa " +rasa+", gurih sekali");
    }
}
