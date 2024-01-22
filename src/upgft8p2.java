import java.util.Scanner;

public class upgft8p2 {
    public static void main(String[] args) {
        double moms = 1.25;
        Scanner kb = new Scanner(System.in);
        System.out.print("Ange hur mycket dina varor kostar: ");
        double pris = kb.nextDouble();
        double summa = (moms * pris);
        double moms1 = (moms * pris) - pris;
        System.out.println("Pris utan moms:" + pris);
        System.out.println("Pris med moms blev:" + summa);
        System.out.println("Momsen blev:" + moms1 );





    }

}
