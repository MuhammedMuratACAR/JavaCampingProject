package eCommerce.core.concretes;

import eCommerce.core.abstracts.AccountValidatorService;
import eCommerce.googleAccountValidator.GoogleAuthenticatorManager;

public class GoogleAuthenticatortManagerAdapter extends AccountValidatorService {
	@Override
	public boolean isEmailValid(String eMail) {
		return GoogleAuthenticatorManager.gMailValidation(eMail);
	}
}
