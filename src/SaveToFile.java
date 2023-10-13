import java.io.FileWriter;
import java.io.IOException;

public class SaveToFile {
    public void save (UserInfo user) throws IOException {
        String fileName = user.getSurname() + ".txt";

        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(user.toString() + "\n");
        }
    }
}
