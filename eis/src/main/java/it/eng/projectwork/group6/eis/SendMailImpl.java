package it.eng.projectwork.group6.eis;

import javax.ejb.Stateless;

import it.eng.projectwork.group6.eisInterface.MailNotSendException;
import it.eng.projectwork.group6.eisInterface.Message;
import it.eng.projectwork.group6.eisInterface.SendMail;

@Stateless
public class SendMailImpl implements SendMail {

	public void sendMailAllUser(Message message)throws MailNotSendException {
		
		System.out.println("Send Mail All User");
	}
	
	public void sendMail(Message message)throws MailNotSendException {
		
		System.out.println("Send Mail");
	}
}
