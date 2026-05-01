import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double loan = sc.nextDouble();

        System.out.print("Annual Interest Rate: ");
        double rate = sc.nextDouble();

        System.out.print("Loan Period (years): ");
        int years = sc.nextInt();

        double monthlyRate = rate / 100 / 12;
        int n = years * 12;

        double monthlyPayment = (loan * monthlyRate) /
                (1 - Math.pow(1 / (1 + monthlyRate), n));

        double totalPayment = monthlyPayment * n;

        System.out.println("Monthly Payment: " + monthlyPayment);
        System.out.println("Total Payment: " + totalPayment);
    }
}