import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Fahrenheit: ");
        double f = sc.nextDouble();

        double c = (5.0 / 9) * (f - 32);

        System.out.println("Celsius: " + c);
    }
}