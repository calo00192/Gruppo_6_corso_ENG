package it.eng.projectwork.group6.eisInterface;

public class Message {

	public static enum TYPE{TEXT, HTML};
	private final String subject;
	private final String body;
	private final TYPE type;
	
	public Message(String subject, String body, TYPE type) {
		this.subject = subject;
		this.body = body;
		this.type = type;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @return the body
	 */
	public String getBody() {
		return body;
	}

	/**
	 * @return the type
	 */
	public TYPE getType() {
		return type;
	}
	
	
}
