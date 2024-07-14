// 6510450658 Pinpawat Limsuwat
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Email implements Verification{
    private String email;
    List<String> notAllowDomains = Arrays.asList("dom1.cc","dom2.cc", "dom3.cc");
    String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    Pattern validEmailPattern = Pattern.compile(EMAIL_PATTERN);

    public Email(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean Verify() {

        if (getEmail() == null || getEmail().trim().equals("")) {
            throw new IllegalArgumentException("Email should not empty");
        }
        if(notAllowDomains.contains(getEmail().split("@")[1])) {
            throw new IllegalArgumentException("Domain Email is not allow");
        }
        if( !validEmailPattern.matcher(getEmail()).matches() ) {
            throw new IllegalArgumentException("Email is wrong format");
        }
        return true;
    }
}
