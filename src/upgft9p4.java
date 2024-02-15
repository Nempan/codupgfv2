import java.util.Scanner;

public class upgft9p4 {

    public static double upphöjtTill(double x, int n) {
        double res = 1;
        int i = 1;
        if (n >= 0)
            for (; i <= n; i++)
                res = res * x;
        else
            for (; i <= -n; i++)
                res = res / x;
        return res;
    }

    public static double räntaPåRänta(double b, double r, int n) {
        return b * upphöjtTill(1 + 0.01 * r, n);
    }

    public static double beloppVidUttag(double b, double r, double uttag) {
        return b + b * 0.01 * r - uttag;
    }

    public static void printBalanceTable(double initialBalance, double interestRate, int years, double withdrawal) {
        // Rubrik för tabellen
        System.out.format("%-10s%-15s\n", "År", "Saldo");
        System.out.println("---------------------");

        // Beräkna och skriv ut saldot för varje år
        double balance = initialBalance;
        for (int year = 1; year <= years; year++) {
            // Beräkna saldo efter ränta och uttag
            balance = beloppVidUttag(balance, interestRate, withdrawal);
            // Skriv ut saldot för aktuellt år
            System.out.format("%-10d%-15.2f\n", year, balance);
            // Kontrollera om balansen är mindre än noll
            if (balance < 0) {
                System.out.println("Du har inga pengar kvar.");
                break; // Avbryt loopen om balansen är mindre än noll
            }
        }
    }

    public static void main(String[] args) {
        // Skapa en scanner för att ta in användarens input
        Scanner scanner = new Scanner(System.in);

        // Fråga användaren om initialt saldo, räntesats, uttagsbelopp och antal år
        System.out.println("Ange initialt saldo:");
        double initialBalance = scanner.nextDouble();

        System.out.println("Ange räntesats (%):");
        double interestRate = scanner.nextDouble();

        System.out.println("Ange uttagsbelopp varje år:");
        double withdrawal = scanner.nextDouble();

        System.out.println("Ange antal år:");
        int years = scanner.nextInt();

        // Anropa metoden för att skriva ut saldo-tabellen
        printBalanceTable(initialBalance, interestRate, years, withdrawal);

        // Stäng scanner
        scanner.close();
    }
}
