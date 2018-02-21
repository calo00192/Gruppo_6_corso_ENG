package it.eng.projectwork.group06.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import it.eng.unipa.projectwork.model.User;

@Entity
@Table(name = "OFFERTA")
public class Bid extends PrimaryKey <Long>  implements Serializable {
	
	
	private static final long serialVersionUID = 0x0003;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BID_ID_SEQ") 
	@SequenceGenerator(name="BID_ID_SEQ", sequenceName="BID_ID_SEQ", allocationSize = 1)
	@Column(name = "CODICE OFFERTA")
	private Long bidKey;
	
	@ManyToOne
	private Auction auction;
	
	@Column(name = "PREZZO")
	private BigDecimal price;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date time;
	
	@ManyToOne
	private User user;

	public Auction getAuction() {
		return auction;
	}

	public void setAuction(Auction auction) {
		this.auction = auction;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public Long getKey() {
		return bidKey;
	}
	
	@Deprecated
	public void setKey(Long key) throws IllegalOperationException {
		throws new IllegalOperationException("Explicit key setting not allowed");
	}
	
	
	
	public Bid() {
		
	}
	
	
	public Bid(User user, BigDecimal price){
		this.user = user;
		this.price = price;
		this.time = new Timestamp(System.currentTimeMillis());
	}
	
	
	
	
	
	
	
	
	
	
	


	

}
