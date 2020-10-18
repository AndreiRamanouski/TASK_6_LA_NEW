package Service;

import Beans.User;
import DAO.DAOEXception;
import DAO.DAOREADFILES;

public class ServiseReadBooks implements ServiceInterfaceRead {
		
	DAOREADFILES read = new DAOREADFILES();
	
	@Override
	public void readBooks(User u) throws ServiceException {
		String str = u.getSatus();
		
			if (str.equals("Adult")) {
				
				System.out.println("Books for adults");
				
				try {
					read.readAdults();
				} catch (DAOEXception e) {
					throw new ServiceException(e);
				}
				try {
					read.readJuniors();
				} catch (DAOEXception e) {
					throw new ServiceException(e);
				}
				
			} else if (str.equals("Junior")){
				
				System.out.println("Books for juniors\n");
				
				try {
					read.readJuniors();
				} catch (DAOEXception e) {
					throw new ServiceException(e);
				}
				
			} 
		
	}
}
