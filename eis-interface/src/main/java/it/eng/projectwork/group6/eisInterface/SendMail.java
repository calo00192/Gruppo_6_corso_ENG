package it.eng.projectwork.group6.eisInterface;

import javax.ejb.Local;

@Local
public interface SendMail {

	public void sendMailAllUser(Message message)throws MailNotSendException;
	public void sendMail(Message message)throws MailNotSendException;
}
