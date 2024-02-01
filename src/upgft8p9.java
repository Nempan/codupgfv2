import java.util.Scanner;
public class upgft8p9 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(("Skriv något: "));
        String S1 = keyboard.nextLine();  //Input
        String S2 = S1.replaceAll("\\s", "");  // Byter ut mellanslag mot inget
        System.out.println("Ny text är: " + S2);  //Skriver ut
    }
}
