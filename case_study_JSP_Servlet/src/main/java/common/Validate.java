package common;

public class Validate {

    public static final String REGEX_NAME = "^([A-Z]{1}[a-z]{1,}\\s{1}){1,}([A-Z]{1}[a-z]{1,})$";
    public static final String REGEX_PHONE = "^(091|090|\\(\\+84\\)90|\\(\\+84\\)91)\\d{7}$";
    public static final String REGEX_ID_CARD = "^\\d{9}|\\d{12}$";
    public static final String REGEX_EMAIL = "^([a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+[a-zA-Z]{2,6})*$";

    public static boolean regexName(String name) {
        return name.matches(REGEX_NAME);
    }

    public static boolean regexPhone(String phone) {
        return phone.matches(REGEX_PHONE);
    }

    public static boolean regexIdCard(String idCard) {
        return idCard.matches(REGEX_ID_CARD);
    }

    public static boolean regexEmail(String email) {
        return email.matches(REGEX_EMAIL);
    }
}
