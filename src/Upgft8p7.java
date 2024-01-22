import java.text.SimpleDateFormat;
import java.util.Date;

public class Upgft8p7 {

    public static String Klocka() {
        Date nuvarandeTid = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        return dateFormat.format(nuvarandeTid);
    }

    public static void main(String[] args) {
        System.out.println("Aktuellt klockslag: " + Klocka());
    }
}
