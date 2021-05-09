package eCommerce.googleAccountValidator;
import java.util.regex.Pattern;

public class GoogleAuthenticatorManager {
	private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@(gmail)+.(com)(.[A-Z]{2})?$";	

	public static boolean gMailValidation(String gMailInput) {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
		return pattern.matcher(gMailInput).find();
	}
}
