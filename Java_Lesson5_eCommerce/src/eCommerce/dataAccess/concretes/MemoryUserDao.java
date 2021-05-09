package eCommerce.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class MemoryUserDao implements UserDao {

List<User> users = new ArrayList<User>();
	
	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("Kullanıcı eklendi.\nKullanıcı Ad : " + user.getFirstName());
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanıcı güncellendi.\nKullanıcı Id : " + user.getId());
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanıcı silindi.\nKullanıcı Id : " + user.getId());
	}

	@Override
	public List<User> getAll() {
		return this.users;
	}	


}
