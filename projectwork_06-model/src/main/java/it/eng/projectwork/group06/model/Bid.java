package it.eng.projectwork.group06.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Bid extends PrimaryKey<Long> implements Serializable {
	
	private static final long serialVersionUID = 0x0002;

	/////////////////////////////////////////////////////////
	//			CAMPI
	
	/**
	 * Chiave primaria dell'entità
	 */
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PK_BID_GENERATOR")
	@SequenceGenerator(name = "PK_BID_GENERATOR", sequenceName = "GENERATOR_2", allocationSize = 1)
	private Long key;
	
	@Column(name = "PREZZO")
	private BigDecimal price;
	
	@Column(name = "UTENTE")
	@ManyToOne
	private User user;
	
	@Column(name = "ASTA")
	@ManyToOne
	private Auction auction;
	
	/////////////////////////////////////////////////////////
	//		COSTRUTTORI
	
	public Bid() {}
	
	public Bid(BigDecimal price, User user, Auction auction) {
		
		setPrice(price);
		setUser(user);
		setAuction(auction);
	}
	
	/////////////////////////////////////////////////////////
	//		REIMPLEMENTAZIONE METODI ASTRATTI
	
	public Long getKey() {
		return this.key;
	}
	
	/**
	 * Questo metodo non deve essere chiamato esplicitamente perchè
	 * la chiave è un contatore che si autoincrementa
	 */
	public void setKey(Long key) throws IllegalOperationException {
		throw new IllegalOperationException("Explicit key setting not allowed");
	}
	
	/////////////////////////////////////////////////////////////
	//			SETTER E GETTER
	
	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the auction
	 */
	public Auction getAuction() {
		return auction;
	}

	/**
	 * @param auction the auction to set
	 */
	public void setAuction(Auction auction) {
		this.auction = auction;
	}
}


