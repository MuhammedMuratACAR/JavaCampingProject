package eCommerce.core.abstracts;

public abstract class AccountValidatorService implements ValidatorService {

	@Override
	public boolean isEmailValid(String eMail) {
		return true;
	}

	@Override
	public boolean isPasswordValid(String password) {
		return true;
	}
	
	@Override
	public boolean isNameValid(String name) {
		return true;
	}

	@Override
	public boolean isVerified(boolean clickOnTheVerificationLink) {
		return true;
	}
}
