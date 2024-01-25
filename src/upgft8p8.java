import java.text.SimpleDateFormat;
import java.util.Calendar;

public class upgft8p8 {

    public static void main(String[] args) {
        String aktuelltDatum = datum();
        System.out.println("Aktuellt datum: " + aktuelltDatum);
    }

    public static String datum() {
        Calendar calendar = Calendar.getInstance();

        // Returnera aktuellt datum direkt som en sträng i önskat format
        return new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime());
    }
}
