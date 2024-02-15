import java.util.Scanner;
public class upgft9p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dagens mätarställning? ");
        double currentMileage = scanner.nextDouble();

        System.out.print("Mätarställning för ett år sedan? ");
        double lastYearMileage = scanner.nextDouble();

        System.out.print("Antal liter förbrukad bensin? ");
        double fuelConsumed = scanner.nextDouble();

        double milesDriven = currentMileage - lastYearMileage;

        double fuelConsumptionPerMile = fuelConsumed / milesDriven;

        System.out.println("Antal körda mil: " + milesDriven);
        System.out.println("Antal liter bensin: " + fuelConsumed);
        System.out.println("Förbrukning per mil: " + fuelConsumptionPerMile);

        scanner.close();
    }

}
