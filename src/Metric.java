import java.util.Scanner;

public class Metric {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double meters = 0;
        double inches = 0;
        double miles = 0;
        double feet = 0;


        System.out.print("Give the measurement in meters: ");
        if (in.hasNextDouble()) {
            meters = in.nextDouble();
        } else {
            System.out.println("Invalid");
            return;
        }
            //meters = in.nextDouble();
            System.out.println("");

            inches = meters * 39.3701;
            miles = meters / 1609;
            feet = meters * 3.281;

            System.out.println("Meters conversions");
            System.out.printf("Inches: %.2f%n", +inches);
            System.out.printf("Feet: %.2f%n", +feet);
            System.out.printf("Miles: %.2f%n", +miles);

        }
}
