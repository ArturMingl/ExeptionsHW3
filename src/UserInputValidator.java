import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInputValidator {

    private String name;
    private String surname;
    private String patronymic;
    private String birth_date;
    private Long phone_number;
    private String gender;
    private final List<String> gender_lst = new ArrayList<>(){{
        add("f");
        add("m");
    }};

    public void addValue (String input) throws RuntimeException {
        if(input.isEmpty()){
            throw new RuntimeException("Пустая строка!");
        }

        String[] data = input.split(" ");
        if (data.length != 6) {
            if (data.length < 6) {
                System.out.println("Вы ввели меньше данных, чем требуется");
            } else {
                System.out.println("Вы ввели больше данных, чем требуется");
            }
        }



    }

    private boolean isName(String name){
        return name != null && name.matches("^[a-zA-Z0-9]*$");
    }

    private void addGender(String[] data){
        for (int i = 0; i < data.length ; i++) {
            if (gender_lst.contains(data[i])) {
                this.gender = data[i];
            }else {
                System.out.println("Вы не верно ввели гендер");
            }
        }
    }

    private void addUserInfo(String[] data) throws IllegalArgumentException {
        for (int i = 0; i < data.length; i++) {
            if (data[i].matches("\\d{2}\\.\\d{2}\\.\\d{4}")) this.birth_date = data[i];
            else throw new IllegalArgumentException("Неверный формат даты рождения. Ожидается: dd.mm.yyyy");

            if (data[i].matches("\\d+")) this.phone_number = Long.parseLong(data[i]);
            else throw new IllegalArgumentException("Неверный формат номера телефона");

            if (gender_lst.contains(data[i])) this.gender = data[i];
            else System.out.println("Не верно введён гендер. Ожидается: " + gender_lst);
        }
    }


}
