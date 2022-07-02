
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int length = 0;

        do {
            System.out.print("Please enter a number greater than 0: ");
            while (!input.hasNextInt()) {
                System.out.print("Please enter a number greater than 0: ");
                input.next();
            }
            length = input.nextInt();
        } while (length <= 0);

        input.close();

        System.out.println(length);
    }
}
