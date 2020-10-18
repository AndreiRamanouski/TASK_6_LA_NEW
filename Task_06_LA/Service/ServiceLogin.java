package Service;

import java.util.ArrayList;
import java.util.List;

import Beans.User;
import DAO.DAOEXception;
import DAO.DAOREADFILES;

public class ServiceLogin implements ServiceInterface {
	List<User> list = new ArrayList<>();
	DAOREADFILES logic = new DAOREADFILES();
	List<String> liststr = new ArrayList<>();
	
	

	
	@Override
	public boolean logination(User u) throws ServiceException  {
		boolean x = false;
		String str = u.getLogin() + " " + u.getParol() + " " + u.getSatus();
		try {
			liststr = logic.readUsers();
			for(int i = 0 ; i < liststr.size(); i++) {
				if(str.equals(liststr.get(i))) {
				x = true;
				}
			}
			
		} catch (DAOEXception e) {
			throw new ServiceException("Can't login");
		}
		return x;
	}
	
	
}
