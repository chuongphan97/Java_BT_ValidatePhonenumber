import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExample {
    private static final String REGEX = "^\\([0-9]{2}\\).\\([0]\\d{9}\\)$";

    public PhoneNumberExample(){

    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
