import java.io.IOException;

public class Presenter {

    public void start (){
        UserInfo user1 = new UserInfo();
        ConsoleView consoleView = new ConsoleView();
        SaveToFile saveToFile = new SaveToFile();
        String message = "Введите данные, разделенные пробелом:\n" +
                "Фамилия Имя Отчество датарождения номертелефона пол(f,m)\n";
        try {
            user1.addUserInfo(consoleView.getInput(message));
            saveToFile.save(user1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
