import java.util.Scanner;

public class multiplikator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ange vilken tabell du vill se. (med siffror): ");
        int siffra = keyboard.nextInt();
        for (int i = 0; i < 11; i++){
            System.out.println(siffra + "*" + i + "=" + (siffra * i));
        }


    }
}
