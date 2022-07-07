package common;

public class Validate {

    public static final String NAME = "^([A-Z][a-z]*)+(\\s([A-Z][a-z]*))*$";
    public static final String PHONE = "^09[0|1][0-9]{7}$";
    public static final String ID_CARD = "^[0-9]{9}$";
    public static final String EMAIL = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    public static final String SALARY = "^[1-9][0-9]*";

    public static boolean regexName(String name) {
        return name.matches(NAME);
    }

    public static boolean regexPhone(String phone) {
        return phone.matches(PHONE);
    }

    public static boolean regexIdCard(String idCard) {
        return idCard.matches(ID_CARD);
    }

    public static boolean regexEmail(String email) {
        return email.matches(EMAIL);
    }

    public static boolean regexSalary(String salary) {
        return salary.matches(SALARY);
    }
}
