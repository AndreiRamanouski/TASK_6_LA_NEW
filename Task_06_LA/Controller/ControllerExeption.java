package Controller;

public class ControllerExeption extends Exception {
	private static final long serialVersionUID = 1L;

	public ControllerExeption(){
	}

	public ControllerExeption(Exception e){
		super(e);
	}
	
	public ControllerExeption(String message){
		super(message);
	}
	
	public ControllerExeption(String message, Exception e){
		super(message, e);
	}
}
