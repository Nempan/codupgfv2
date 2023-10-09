import javax.swing.*;
import java.util.Scanner;

public class upgft1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(("Ange radien: "));
        double radius = keyboard.nextDouble();
        double area = 4*Math.PI*radius*radius;
        double volym = 4*Math.PI*Math.pow(radius,3)/3;
        System.out.println("Arean är " + area + "Volymen är " + volym);


    }
}