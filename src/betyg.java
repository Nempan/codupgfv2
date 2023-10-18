import java.util.Scanner;

public class betyg {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ange poäng: ");
        int poäng = keyboard.nextInt();
        if (poäng < 15 ){
            System.out.println("Ej godkänd");

        } else if (poäng > 14 && poäng < 18 ) {
            System.out.println("Du fick E");

        } else if (poäng > 17 && poäng <21 ) {
            System.out.println("Du fick D");

        } else if (poäng > 20 && poäng <25) {
            System.out.println("DU fick C");

        } else if (poäng > 23 && poäng <27) {
            System.out.println("Du fick B");

        } else if (poäng >= 27) {
            System.out.println("Du fick A");

        }
    }
}
