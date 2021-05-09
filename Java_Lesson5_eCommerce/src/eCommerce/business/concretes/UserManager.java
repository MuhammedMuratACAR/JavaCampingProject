package eCommerce.business.concretes;

import eCommerce.business.abstracts.UserService;
import eCommerce.core.abstracts.AccountValidatorService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService {
	
	private AccountValidatorService accountValidatorService;
	private UserDao userDao;
	public UserManager(AccountValidatorService accountValidatorService, UserDao userDao) {
		this.accountValidatorService = accountValidatorService;
		this.userDao = userDao;
	}
	@Override
	public void signUp(User user) {
		if(!accountValidatorService.isNameValid(user.getFirstName())) {
			System.out.println("Lütfen en az 2 adet harften oluşan bir ad girerek tekrar deneyiniz.\n");
			return;
		}
		
		if(!accountValidatorService.isNameValid(user.getLastName())) {
			System.out.println("Lütfen en az 2 adet harften oluşan bir soyad girerek tekrar deneyiniz.\n");
			return;
		}		
		
		if(!accountValidatorService.isEmailValid(user.getEmail().toLowerCase())) {
			System.out.println("Lütfen geçerli bir e-posta adresi girerek tekrar deneyiniz. (Örnek : name@admin.com)\n");
			return;
		}
		
		for(User other : userDao.getAll()) {
			if(user.getEmail() == other.getEmail()) {
				System.out.println("Aynı e-posta adresine kayıtlı kullanıcı mevcut. Lütfen farklı bir e-posta adresi ile kayıt olmayı deneyiniz.\n");
				return;
			}
		}
				
		if(!accountValidatorService.isPasswordValid(user.getPassword())) {
			System.out.println("Lütfen en az 6 adet karakterden oluşan bir şifre girerek tekrar deneyiniz.\n");
			return;
		}		
		
		System.out.println("Kullanıcı bilgileri geçerli.\nKayıt işleminizin tamamlanabilmesi için, e-posta adresinize gönderilen doğrulama bağlantısını tıklayınız.\n");
		if(accountValidatorService.isVerified(user.getIsVerified())) {
			System.out.println("Doğrulama işlemi başarılı.\n");
		}
		this.userDao.add(user);
		System.out.println("Profil sayfanıza yönlendiriliyorsunuz.\n");
	}

	@Override
	public void logIn(User user, String eMailInput, String passwordInput) {
		if(eMailInput != user.getEmail() || passwordInput != user.getPassword()) {
			System.out.println("Geçersiz kullanıcı e-postası ya da şifresi. Lütfen tekrar deneyiniz.\n");
			return;
		}			
		System.out.println("Giriş başarılı. Anasayfaya yönlendiriliyorsunuz.\n");
	}

	@Override
	public void update(User user) {
		this.userDao.update(user);
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);
	}

	@Override
	public void getAll() {
		this.userDao.getAll();
	}

}
