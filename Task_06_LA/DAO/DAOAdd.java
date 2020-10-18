package DAO;

import Beans.Book;
import Beans.User;

public interface DAOAdd {
	
	public void addUser(User e) throws DAOEXception;
	public void addBookJuniors(Book e) throws DAOEXception;
	public void addBookAdults(Book e) throws DAOEXception;
}
