import java.util.Scanner;
import java.time.Year;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter birth year: ");
        int birth = sc.nextInt();

        int currentYear = Year.now().getValue();
        int age = currentYear - birth;

        System.out.println("You were born in " + birth + " and will be (are) " + age + " this year.");
    }
}