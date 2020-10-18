package Controller;

import Beans.Book;
import Beans.User;
import DAO.DAOAdd;
import DAO.DAOEXception;
import DAO.Lists_of_items;

public class ControllerInput implements ControllerIntefaceInput {
	
	DAOAdd add = new Lists_of_items();
	
	@Override
	public void registration(User u) throws ControllerExeption {
		try {
			add.addUser(u);
		} catch (DAOEXception e) {
			throw new ControllerExeption("Cannot register the user");
		}
	}
	
	@Override
	public void newBookAdult(Book b) throws ControllerExeption {
		try {
			add.addBookAdults(b);
		} catch (DAOEXception e) {
			throw new ControllerExeption("Cannot add the book");
		}
	}
	
	@Override
	public void newBookJunior(Book b) throws ControllerExeption {
		try {
			add.addBookJuniors(b);
		} catch (DAOEXception e) {
			throw new ControllerExeption("Cannot add the book");
		}
	}
}
