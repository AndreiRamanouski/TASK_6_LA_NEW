package Controller;

import Beans.User;

public interface ControllerOutputInterface {
	public void logination(User u) throws ControllerExeption;
	public void changeAge(User u, User b ) throws ControllerExeption;
	public void readBooks(User u)  throws ControllerExeption ;
}
