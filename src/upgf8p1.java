public class upgf8p1 {
    public static void main(String[] args) {
    int inputNumbers = -5;
    int resultat = beraknaheltal(inputNumbers);
    System.out.println("Resultatet är: " + resultat);

    }

    public static int beraknaheltal(int tal) {
        if (tal > 0) {
            return 1;
        }
        if (tal < 0) {
            return 0;
        }
        else {
            return 0;
        }
    }
} 
