package common;

public class Validate {

    public static final String NAME = "^([A-Z][a-z]*)+(\\s([A-Z][a-z]*))*$";
    public static final String PHONE = "^09[0|1][0-9]{7}$";
    public static final String ID_CARD = "^[0-9]{9}$";
    public static final String EMAIL = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    public static final String SALARY = "^[1-9][0-9]*";

    private static final String REGEX_CUSTOMER_ID = "^(KH-)\\d{4}$";
    private static final String REGEX_SERVICE_ID = "^(DV-)\\d{4}$";
    private static final String REGEX_PHONE = "^(09|\\(84\\)\\+9)[01]\\d{7}$";
    private static final String REGEX_DATE = "^([0-1][0-9]{1,2}|(1)[0-9]{3}|(20)[0-2]{2})(\\/|-)\\d{2}(\\/|-)\\d{2}$";
    private static final String REGEX_ID_CARD = "^\\d{9}|\\d{12}$";
    private static final String REGEX_EMAIL = "^\\w{3,}(\\.?\\w+)*@[a-z]{2,7}(.[a-z]{2,5}){1,3}$";
    private static final String REGEX_SD = "^\\d+|\\d+\\.\\d+$";

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
