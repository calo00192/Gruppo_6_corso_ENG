package it.eng.projectwork.group06.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 * classe di rappresentazione utenti per dati anagrafici
 * che viene convertita in tabella
 */

@Entity
@Table(name = "UTENTE")
@Inheritance (strategy = InheritanceType.JOINED)
public abstract class User extends PrimaryKey <String>  implements Serializable  {

	/**
	 * codice per la serializzazione
	 */
	private static final long serialVersionUID = 0x0001;
	
	//////////////////////////////////////////////////////
	//			campi
	
	@Id
	@Column(name = "CF", length = 16)
	private String codiceFiscale;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "COGNOME")
	private String surname;
	
	/*
	
	@Column(name = "EMAIL")
	@OneToMany(mappedBy = "utente")
	private List<EmailAddress> emailAddressList;
	
	*/
	
	@Column(name = "DATA_DI_NASCITA")
	@Temporal(TemporalType.DATE)
	private Date dataNascita;
	
	///////////////////////////////////////////////////////////////
	//			IMPLEMENTAZIONE METODI ASTRATTO
	
	public String getKey() {
		return getCodiceFiscale();
	}

	/**
	 * @return the codiceFiscale
	 */
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	
	/**
	 * Dopo aver effettuato dei controlli sulla stringa passata
	 * imposta il campo codiceFiscale come chiave primaria di questa tabella
	 * @param codFisc = Stringa rappresentante un codice fiscale
	 */
	public void setKey(String codFisc) {
		
	}
	
	////////////////////////////////////////////////////////////////////
	//			METODI DELLA CLASSE

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	/*

																	
	public List<EmailAddress> getEmailAddressList() {
		return emailAddressList;
	}
	

	public void setEmailAddressList(List<EmailAddress> emailAddressList) {
		this.emailAddressList = emailAddressList;
	}
	
	*/

	/**
	 * @return the dataNascita
	 */
	public Date getDataNascita() {
		return dataNascita;
	}

	/**
	 * @param dataNascita the dataNascita to set
	 */
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	
	
	//TODO: Implementare il toString()
}
