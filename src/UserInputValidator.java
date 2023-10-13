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
    private final List<Character> gender_lst = new ArrayList<>(){{
        add('f');
        add('m');
    }};

    public void add_value (String input) throws RuntimeException {
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

    private boolean is_name(String name){
        return name != null && name.matches("^[a-zA-Z0-9]*$");
    }

    private void get_gender(String[] data){
        for (int i = 0; i < data.length ; i++) {
            if (gender_lst.contains(data[i])) this.gender = data[i];
        }
    }


}
