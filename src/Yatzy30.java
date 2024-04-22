import java.util.*;

public class Yatzy30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ange antal spelare: ");
        int numPlayers = scanner.nextInt();

        List<Player> players = new ArrayList<>();
        // Skapa spelare och lägg till dem i listan
        for (int i = 1; i <= numPlayers; i++) {
            players.add(new Player("Spelare " + i));
        }

        int currentPlayerIndex = 0;
        // Spela tills endast en spelare är kvar
        while (players.size() > 1) {
            Player currentPlayer = players.get(currentPlayerIndex);
            System.out.println("\nDet är " + currentPlayer.getName() + "'s tur.");
            currentPlayer.rollDice();
            currentPlayer.keepDice();
            int points = currentPlayer.calculatePoints();
            System.out.println("Poäng: " + points);
            // Om spelaren får exakt 30 poäng händer ingenting
            if (points == 30) {
                System.out.println("Du fick exakt 30 poäng. Ingenting händer.");
            } else {
                // Annars tar spelaren skada
                currentPlayer.takeDamage();
            }

            // Om spelarens hälsa går under 0 är hen ute ur spelet
            if (currentPlayer.getHealth() <= 0) {
                System.out.println(currentPlayer.getName() + " är ute ur spelet.");
                players.remove(currentPlayer);
                numPlayers--;
                // Om det bara finns en spelare kvar bryts loopen
                if (numPlayers == 1) {
                    break;
                }
            }

            // Om spelaren har tagit upp alla tärningar byts till nästa spelare
            if (currentPlayer.getRemainingDice() == 0) {
                currentPlayerIndex = (currentPlayerIndex + 1) % numPlayers;
            }
        }

        // Meddela vilken spelare som vann när loopen är klar
        System.out.println("Spelare " + players.get(0).getName() + " vann!!");
    }
}

class Player {
    private String name;
    private List<Integer> dice;
    private int health;

    public Player(String name) {
        this.name = name;
        this.dice = new ArrayList<>();
        this.health = 30;
    }

    public String getName() {
        return name;
    }

    // Kasta tärningar och lagra resultaten
    public void rollDice() {
        Random random = new Random();
        dice.clear();
        for (int i = 0; i < 6; i++) { // Kasta 6 tärningar
            dice.add(random.nextInt(6) + 1);
        }
        System.out.println("Du slog: " + dice);
    }

    // Välj vilka tärningar som ska sparas
    public void keepDice() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> newDice = new ArrayList<>(dice);

        while (true) {
            System.out.println("Välj vilka tärningar du vill spara (Ange index separerade med mellanslag).");
            for (int i = 0; i < newDice.size(); i++) {
                System.out.println(i + ": " + newDice.get(i));
            }
            System.out.println("Valda tärningar att spara (ange index separerade med mellanslag): ");
            String[] keptIndices = scanner.nextLine().split(" ");
            if (keptIndices.length == 0) {
                System.out.println("Inga tärningar sparades. Du måste spara minst en tärning.");
                continue;
            }
            List<Integer> savedDice = new ArrayList<>();
            for (String index : keptIndices) {
                int idx = Integer.parseInt(index);
                if (idx >= 0 && idx < newDice.size()) {
                    savedDice.add(newDice.get(idx));
                    newDice.remove(idx);
                }
            }
            if (!savedDice.isEmpty()) {
                System.out.println("Du sparade: " + savedDice);
                break;
            }
        }
        dice = newDice;
    }

    // Beräkna poängen för sparade tärningar
    public int calculatePoints() {
        return dice.stream().mapToInt(Integer::intValue).sum();
    }

    // Beräkna skada baserat på poängen
    public void takeDamage() {
        int totalDiceValue = calculatePoints();
        int points = 30 - totalDiceValue;
        int damage = Math.max(0, points);
        health -= damage;
        System.out.println("Du förlorade " + damage + " liv. Liv kvar: " + health);
    }

    // Hämta spelarens hälsa
    public int getHealth() {
        return health;
    }

    // Hämta antalet kvarvarande tärningar
    public int getRemainingDice() {
        return dice.size();
    }
}
