package Controller;

import Beans.Book;
import Beans.User;

public interface ControllerIntefaceInput {
	public void registration(User u) throws ControllerExeption;
	public void newBookAdult(Book b) throws ControllerExeption;
	public void newBookJunior(Book b) throws ControllerExeption;
}
