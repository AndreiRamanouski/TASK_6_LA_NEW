package MainForTests;

import Beans.User;
import View.View;

public class Main {
	
	public static void main(String[] args) {
	View view = new View();
	User u = new User("Andrei" , "Ramanouski" , "Adult");
	User junior = new User("My_Small", "Ego", "Junior");
	User u2 = new User("Andre" , "Ramanouski" , "Adult");
	
	
	view.registration(u);
	view.logination(u2);
	
	view.changeAge(u, junior);
	view.read(junior);

	}
}
