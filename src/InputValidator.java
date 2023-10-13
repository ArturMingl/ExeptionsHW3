import java.util.ArrayList;

public class InputValidator {
    public static int check (ArrayList<String> data) {

        if (data.isEmpty()) return 1;

        if (data.size() != 6) {
            if (data.size() < 6) return 2;
            else return 3;
        }
        return 4;
    }
}
