package DAO;


import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import Beans.Book;
import Beans.User;

public class WritingToFile {

	
	
	public void addUsers(List<User> e) {
		List<User> users = new ArrayList<>();
		users = e;
		try(FileWriter writer = new FileWriter("C:\\Work\\ListOfUsers.txt")){
			
			for ( int i = 0 ; i < users.size() ; i++ ) {
				String user = users.get(i).getLogin() + " " + users.get(i).getParol() + " " + users.get(i).getSatus();
				writer.write(user);
				writer.append("\n");
			}
			writer.close();
		} catch (FileNotFoundException a) {
			a.getMessage();
		} catch (IOException a) {
			
			a.getMessage();
		} 
	}
	
	
	public void addBooksAdults(List<Book> e) {
		List<Book> books = new ArrayList<>();
		books = e;
		try(FileWriter writer = new FileWriter("C:\\Work\\ListOfBooksAdults.txt")){
			
			for ( int i = 0 ; i < books.size() ; i++ ) {
				String book = books.get(i).getTitle() + " " + books.get(i).getAuthor() ;
				writer.write(book);
				writer.append("\n");
			}
			writer.close();
		} catch (FileNotFoundException a) {
			a.getMessage();
		} catch (IOException a) {
			a.getMessage();
		} 
	}
	
	public void addBooksJuniors(List<Book> e) {
		List<Book> books = new ArrayList<>();
		books = e;
		try(FileWriter writer = new FileWriter("C:\\Work\\ListOfBooksJuniors.txt")){
			
			for ( int i = 0 ; i < books.size() ; i++ ) {
				String book = books.get(i).getTitle() + " " + books.get(i).getAuthor() ;
				writer.write(book);
				writer.append("\n");
			}
			writer.close();
		} catch (FileNotFoundException a) {
			a.getMessage();
		} catch (IOException a) {
			a.getMessage();
		} 
	}
	
	
	
}
