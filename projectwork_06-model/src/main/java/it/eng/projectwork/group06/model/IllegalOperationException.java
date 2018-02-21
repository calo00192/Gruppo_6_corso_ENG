package it.eng.projectwork.group06.model;

public class IllegalOperationException extends RuntimeException {

	private static final long serialVersionUID = 0x1000;
	
	public IllegalOperationException(String msg) {
		super(msg);
	}
}
