import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class upgft11p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Object> items = new ArrayList<>();

        System.out.println("Skriv max 1000 siffor och sedan skriv done");
        int count = 0;

        while (count < 1000) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("klar")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                items.add(number);
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Skriv in giltigt nummer eller skriv klar när du är klar");
            }
        }

        List<Object> deduped = new ArrayList<>(new HashSet<>(items));

        System.out.println("Icke dubblerade nummer: ");
        System.out.println(deduped);
    }
}
