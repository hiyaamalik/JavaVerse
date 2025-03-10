import java.util.regex.*;

public class EmailValidator {
    public static void main(String[] args) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);

        String[] emails = {"test@example.com", "invalid-email.com", "user.name@domain.co", "user@sub.domain.org", "@missinguser.com"};

        for (String email : emails)
            System.out.println(email + " is valid: " + pattern.matcher(email).matches());
    }
}
