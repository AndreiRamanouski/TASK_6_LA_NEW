package DAO;

import java.util.ArrayList;
import java.util.List;

import Beans.Book;
import Beans.User;

public class Lists_of_items implements DAOAdd {
	List<User> users = new ArrayList<>();
	List<Book> booksAdults = new ArrayList<>();
	List<Book> booksJuniors = new ArrayList<>();
	WritingToFile write = new WritingToFile();	
	
	@Override
	public void addBookJuniors(Book e) {
		booksJuniors.add(e);
		write.addBooksJuniors(getBooksJuniors());
	}
	
	public List<Book> getBooksJuniors() {
		return booksJuniors;
	}
	
	@Override
	public void addBookAdults(Book e) {
		booksAdults.add(e);
		write.addBooksAdults(getBooksAdults());
	}
	
	public List<Book> getBooksAdults() {
		return booksAdults;
	}
	
	@Override
	public void addUser(User e) {
		users.add(e);
		write.addUsers(getUsers());
	}
	
	public List<User> getUsers() {
		return users;
	}
	
	
	
	
}
