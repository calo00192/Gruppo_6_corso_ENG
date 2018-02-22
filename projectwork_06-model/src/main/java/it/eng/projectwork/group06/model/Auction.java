package it.eng.projectwork.group06.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;

import it.eng.projectwork.group06.pricing.Pricing;


@Entity
@Table(name = "ASTA")
public class Auction extends PrimaryKey<Long> implements Serializable {

	private static final long serialVersionUID = 0x0002;
	
	private static final int STATE_SUSPENDED = 0xA000;
	
	private static final int STATE_PENDING = 0xA001;
	
	private static final int STATE_ACTIVE = 0xA002;
	
	////////////////////////////////////////////
	//			CAMPI
	
	/**
	 * Chiave primaria della tabella ASTA
	 */
//	@Id
//	@Column(name = "ID")
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PK_GENERATOR")
//	@SequenceGenerator(name = "PK_GENERATOR", sequenceName = "GENERATOR_1", allocationSize = 1)
//	private Long key;
	
	
	
	/**
	 * Titolo dell'asta
	 */
	@Column(name = "TITOLO", nullable = false)
	private String title;
	
	/**
	 * Descrizione dell'asta
	 */
	@Column(name = "DESCRIZIONE")
	private String description;
	
	/**
	 * Flag che serve a indicare se l'asta è sospesa o meno
	 */
	@Transient
	private int auctionState;
	
	
	
	/**
	 * Lista delle offerte relative all'asta
	 */
	@OneToMany(mappedBy = "auction", cascade = CascadeType.ALL)
	private List<Bid> bids = new ArrayList<Bid>(); //Cambiare in bids
	
	/**
	 * Il prodotto messo all'asta
	 */
	@Column(name = "PRODOTTO", nullable = false)
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Product product;
	
	/**
	 * Riferimento al venditore
	 */
	@Column(name = "VENDITORE")
	@ManyToOne
	private Supplier supplier;
	
	/**
	 * Momento di inizio dell'asta
	 */
	@Column(name = "DATA_INIZIO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;
	
	/**
	 * Momento di fine dell'asta
	 */
	@Column(name = "DATA_FINE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date finishDate;
	
	/**
	 * Utile all'optimistic lock
	 */
	@Version
	private long version;
	
	/**
	 * Strategia di pricing
	 */
	@Transient
	Pricing pricing;

	
	///////////////////////////////////////////
	//			IMPLEMENTAZIONE METODI ASTRATTI
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PK_GENERATOR")
	@SequenceGenerator(name = "PK_GENERATOR", sequenceName = "GENERATOR_1", allocationSize = 1)
	public Long getKey() {
		return this.key;
	}
	
	/**
	 * Questo metodo non deve essere chiamato esplicitamente perchè
	 * la chiave è un contatore che si autoincrementa
	 */
	public void setKey(Long key) throws IllegalOperationException {
		throw new IllegalOperationException("Explicit key setting not allowed"); //
		//new UnsupportedOperationException()
	}
	
	//////////////////////////////////////////
	//		SETTER E GETTER

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "STATO", nullable = false)
	public String getState() {
		
		String result = "_";
		
		switch(auctionState) {
		
			case STATE_SUSPENDED : {
				result =  "Sospesa";
				break;
			}
			case STATE_ACTIVE : {
				result =  "Attiva";
				break;
			}
			case STATE_PENDING : {
				result =  "Pendente";
				break;
			}
		}
		
		return result;
	}

	/**
	 * @return the bidList
	 */
	public List<Bid> getBidList() {
		return bids;
	}

	/**
	 * @param bidList the bidList to set
	 */
	public void setBidList(List<Bid> bidList) {
		this.bids = bidList;
	}

	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	/**
	 * @return the supplier
	 */
	public Supplier getSupplier() {
		return supplier;
	}

	/**
	 * @param supplier the supplier to set
	 */
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the finishDate
	 */
	public Date getFinishDate() {
		return finishDate;
	}

	/**
	 * @param finishDate the finishDate to set
	 */
	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}

	/**
	 * @return the pricing
	 */
	public Pricing getPricing() {
		return pricing;
	}

	/**
	 * E' private perchè deve essere settato solo all'istanziamento dell'asta
	 * @param pricing the pricing to set
	 */
	private void setPricing(Pricing pricing) {
		
		
		this.pricing = pricing;
	}
	
	
	
	//////////////////////////////////////////
	//			METODI DELLA CLASSE
	
	
	
	public void addBid(Bid bid)throws IllegalOperationException {
		
		
	}

}
