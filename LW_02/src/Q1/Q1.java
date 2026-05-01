import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A: ");
        double A = sc.nextDouble();

        System.out.print("Enter B: ");
        double B = sc.nextDouble();

        System.out.print("Enter C: ");
        double C = sc.nextDouble();

        System.out.print("Enter X: ");
        double X = sc.nextDouble();

        System.out.print("Enter Y: ");
        double Y = sc.nextDouble();

        System.out.print("Enter radius r: ");
        double r = sc.nextDouble();


        double a = Math.sqrt(B * B + 4 * A * C);

        double b = Math.sqrt(X + 4 * Math.pow(Y, 3));

        double c = Math.cbrt(X * Y);

        double d = Math.PI * r * r;

        System.out.println("\n--- Results ---");
        System.out.println("a) sqrt(B^2 + 4AC) = " + a);
        System.out.println("b) sqrt(X + 4Y^3) = " + b);
        System.out.println("c) cube root of (X*Y) = " + c);
        System.out.println("d) Area of circle = " + d);
    }
}