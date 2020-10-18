package DAO;

public class DAOEXception extends Exception {

	private static final long serialVersionUID = 1L;

	public DAOEXception(){
	}

	public DAOEXception(Exception e){
		super(e);
	}
	
	public DAOEXception(String message){
		super(message);
	}
	
	public DAOEXception(String message, Exception e){
		super(message, e);
	}
}
