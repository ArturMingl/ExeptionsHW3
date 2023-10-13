import java.util.ArrayList;

public class FindingValue {
    private final ArrayList<String> genderLst = new ArrayList<>(){{
        add("f");
        add("m");
    }};

    public String findGender (ArrayList<String> data){
        boolean found = false;
        String gender = null;

        for (String i : data) {
            if (this.genderLst.contains(i)) {
                found = true;
                gender = i;
                break;
            }
        }

        if (found) return gender;
        else throw new IllegalArgumentException("Неверный формат пола. Ожидается: " + genderLst);
    }

    public String findDate(ArrayList<String> data){
        boolean found = false;
        String date = null;

        for (String i : data) {
            if (i.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
                found = true;
                date = i;
                break;
            }
        }

        if (found) return date;
        else throw new IllegalArgumentException("Неверный формат даты рождения. Ожидается: dd.mm.yyyy");
    }

    public Long findPhoneNumber(ArrayList<String> data) throws NumberFormatException{
        boolean found = false;
        String num = null;

        for (String i : data) {
            if (i.matches("\\d+")) {
                found = true;
                num = i;
                break;
            }
        }
        return Long.parseLong(num);
    }
}
