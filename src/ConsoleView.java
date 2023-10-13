import java.util.Scanner;

public class ConsoleView {
    Scanner scanner =new Scanner(System.in);

    public String getInput(String message) {
        System.out.printf("%s", message);
        return scanner.nextLine();
    }
}
