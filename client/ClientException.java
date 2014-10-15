package client;

/** handles a failed operation on the client side*/
@SuppressWarnings("serial")
public class ClientException extends Exception {

	public ClientException() {
		return;
	}
	
	public ClientException(String message) {
		super(message);
	}

	public ClientException(Throwable throwable) {
		super(throwable);
	}

	public ClientException(String message, Throwable throwable) {
		super(message, throwable);
	}

}