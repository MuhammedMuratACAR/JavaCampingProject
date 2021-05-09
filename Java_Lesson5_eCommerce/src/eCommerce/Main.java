package eCommerce;

import eCommerce.business.concretes.UserManager;
import eCommerce.core.concretes.DefaultAccountValidatorManager;
import eCommerce.core.concretes.GoogleAuthenticatortManagerAdapter;
import eCommerce.dataAccess.concretes.MemoryUserDao;
import eCommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserManager userManager1 = new UserManager(new DefaultAccountValidatorManager(), new MemoryUserDao());
		
		userManager1.signUp(new User(1,"U1","M", "ACAR","muhammedmuratacarr@gmail.com","123456",true));							//Ad hatası
		
		userManager1.signUp(new User(1,"U1","Muhammed Murat", "A","muhammedmuratacarr@gmail.com","123456",true));				//Soyad hatası
		
		userManager1.signUp(new User(1,"U1","Muhammed Murat", "ACAR","muhammedmuratacarrgmail.com","123456",true));				//E-posta hatası
		
		userManager1.signUp(new User(1,"U1","Muhammed Murat", "ACAR","muhammedmuratacarr@gmail.com","1",true));					//şifre hatası
		
		userManager1.signUp(new User(1,"U1","Muhammed Murat", "ACAR","muhammedmuratacarr@gmail.com","123456",true));			//Başarılı kayıt
		
		userManager1.signUp(new User(2,"U2","Osman", "Çetin","muhammedmuratacarr@gmail.com","456789",true));					//Kayıtlı e-posta hatası

		
//SIGN-UP TEST (GOOGLE)
		
		UserManager userManager2 = new UserManager(new GoogleAuthenticatortManagerAdapter(), new MemoryUserDao());

		userManager2.signUp(new User(2,"G1","Muhammed Murat", "ACAR","muhammedmuratacarr@hata.com","456789",true));				//Gmail olmayan e-posta hatası
		
		userManager2.signUp(new User(2,"G1","Muhammed Murat", "ACAR","muhammedmuratacarr@gmail.com","456789",true));			//Başarılı kayıt
		
		
//LOG-IN TEST

		User user = new User(3,"G2","Muhammed Murat", "ACAR","muhammedmuratacarr@gmail.com","456789",true);
		
		userManager1.logIn(user, "muhammedmuratacarr@email.com", "456789");														//E-posta uyumsuzluğu hatası
		
		userManager1.logIn(user, "muhammedmuratacarr@gmail.com", "111111");														//şifre uyumsuzluğu hatası
		
		userManager1.logIn(user, "muhammedmuratacarr@gmail.com", "456789");														//Başarılı giriş
	}

}
