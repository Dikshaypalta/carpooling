package example.service;

import example.dao.UserDao;
import example.domain.Register;

public class Service {

	UserDao userDao = new UserDao();
	
	public boolean validateLogin(String username , String password){
		
		return false;
	}

	public void registerNewUser(Register registerUser) {
		
		userDao.registerNewUser(registerUser);
	}
}
