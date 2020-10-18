package View;

import Beans.Book;
import Beans.User;
import Controller.ControllerExeption;
import Controller.ControllerInput;
import Controller.ControllerIntefaceInput;
import Controller.ControllerOutput;
import Controller.ControllerOutputInterface;

public class View {
	ControllerIntefaceInput input = new ControllerInput();
	ControllerOutputInterface output = new ControllerOutput();
			
	
	
	public void registration(User u) {
		try {
			input.registration(u);
		} catch (ControllerExeption e) {
			e.getStackTrace();
		}
	}
	
	
	public void addBookJunior(Book b) {
		try {
			input.newBookJunior(b);
		} catch (ControllerExeption e) {
			e.getStackTrace();
		}
	}
	
	public void addBookAdult(Book b) {
		try {
			input.newBookAdult(b);
		} catch (ControllerExeption e) {
			e.getStackTrace();
		}
	}
	
	public void logination(User u) {
		try {
			output.logination(u);
		} catch (ControllerExeption e) {
			e.getStackTrace();
		}
	}
	
	public void changeAge(User u, User b ) {
		try {
			output.changeAge(u, b);
		} catch (ControllerExeption e) {
		
			e.getStackTrace();
		}
	}
	
	public void read(User u) {
		try {
			output.readBooks(u);
		} catch (ControllerExeption e) {
			e.getStackTrace();
		}
	}
}
