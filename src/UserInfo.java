import java.util.ArrayList;
import java.util.Arrays;

public class UserInfo extends FindingValue {

    private String name;
    private String surname;
    private String patronymic;
    private String birthDate;
    private Long phoneNumber;
    private String gender;


    public void addUserInfo(String input){

        ArrayList<String> data = new ArrayList<String>(Arrays.asList(input.split(" ")));

        switch (InputValidator.check(data)) {
            //InputValidator возвращает код ошибки 1, если введённая пользователем строка пустая
            // 2, если введённых данных меньше, чем требуется
            // 3, если введённых данных больше, чем требуется
            // 4, если колличество введённых данных корректно
            case  (1):
                System.out.println("Пустые строки вводить нельзя!");
                break;
            case (2):
                System.out.println("Вы ввели меньше данных, чем требуется");
                break;
            case (3):
                System.out.println("Вы ввели больше данных, чем требуется");
                break;
            case (4):
                this.gender = findGender(data);
                data.remove(gender);
                this.birthDate = findDate(data);
                data.remove(birthDate);
                try {
                    this.phoneNumber = findPhoneNumber(data);
                    data.remove(Long.toString(phoneNumber));
                }catch (NumberFormatException e){
                    throw new NumberFormatException("Не верный формат номера телефона");
                }

                this.surname = data.get(0).toUpperCase();
                this.name = data.get(1).toUpperCase();
                this.patronymic = data.get(2).toUpperCase();
        }

    }

    //Переопределение метода toString для записи в файл
    @Override
    public String toString() {
        return "<" + surname + ">" +
                "<" + name + ">" +
                "<" + patronymic + ">" +
                "<" + birthDate + ">" +
                "<" + phoneNumber + ">" +
                "<" + gender + ">";
    }


    public String getSurname() {
        return surname;
    }

}
