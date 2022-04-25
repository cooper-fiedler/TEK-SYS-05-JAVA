package Main;



public class negativeBalanceException extends Exception{
	
	
String message = "[NEGATIVE BALANCE EXCEPTION] Cannot withdraw ammount as this would result in a negative value!";

	public negativeBalanceException() {
		// TODO Auto-generated constructor stub
	}

	public String getMessage() {
		return message;
	}
	
	
	
	
	
	private static final long serialVersionUID = 1L;

}
