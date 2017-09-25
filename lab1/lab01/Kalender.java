import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by rama on 9/16/17.
 */

public class Kalender {
    int dayOfMonth;
    int Month;
    int Year;

    public Kalender(){
        Calendar cal = Calendar.getInstance();
        this.dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        this.Month = cal.get(Calendar.MONTH)+1;
        this.Year = cal.get(Calendar.YEAR);

    }

    public void AddDay(int hari){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH,hari);
        this.dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        this.Month = cal.get(Calendar.MONTH) + 1;
        this.Year = cal.get(Calendar.YEAR);

    }
    public Kalender(int hari, int bulan, int tahun){

        this.dayOfMonth = hari;
        this.Month = bulan;
        this.Year = tahun;

    }

    public String ultahDiTahun(int tahun) throws ParseException {
        this.Year = tahun;
        String dtToStr = String.format("%d-%d-%d", this.Year, this.Month, this.dayOfMonth);
        DateFormat dtFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date dt = dtFormat.parse(dtToStr);

        String day = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(dt);
        return day;
    }

//    public void ultahDiTahun(int )

}
