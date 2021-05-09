package eCommerce.core.concretes;

import eCommerce.core.abstracts.AccountValidatorService;
import java.util.regex.Pattern;

public class DefaultAccountValidatorManager extends AccountValidatorService  {

	private final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";	
	private final String PASSWORD_PATTERN = "^[A-Z0-9._%+-?!]{6,}+$";	
	private final String NAME_PATTERN = "^[A-Z]{2,}+$";
	
	@Override
	public boolean isEmailValid(String eMail) {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
		return pattern.matcher(eMail).find();
	}

	@Override
	public boolean isPasswordValid(String password) {
		Pattern pattern = Pattern.compile(PASSWORD_PATTERN, Pattern.CASE_INSENSITIVE);
		return pattern.matcher(password).find();
	}
	
	@Override
	public boolean isNameValid(String name) {
		Pattern pattern = Pattern.compile(NAME_PATTERN, Pattern.CASE_INSENSITIVE);
		return pattern.matcher(name).find();
	}

	@Override
	public boolean isVerified(boolean clickOnTheVerificationLink) {
		return clickOnTheVerificationLink;
	}
}
