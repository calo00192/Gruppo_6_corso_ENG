package it.eng.projectwork.group06.pricing;

import it.eng.projectwork.group06.model.Auction;
import it.eng.projectwork.group06.model.Bid;

public class Pricing {

	/**
	 * Strategia di pricing
	 */
	
	protected static final int TYPE_FORWARD = 0x0000;
	
	protected static final int TYPE_BACKWARDS = 0x0001;
	
	/**
	 * Tipo di strategia di pricing
	 */
	protected final int strategyType;
	
	/**
	 * Minima multiplo di offerta. Se 1 si accetta qualsiasi offerta
	 */
	protected final int minBid;
	
	/**
	 * Costruttore
	 * @param mb Offerta multipla minima. 0 Se si può inserire qualsiasi cifra
	 * @param st strategia di pricing da usare (Costanti)
	 */
	public Pricing(int mb, int st) {
		this.minBid = mb;
		this.strategyType = st;
	}
	
	/**
	 * @return il tipo di strategia di pricing adottata
	 */
	public int getType() {
		return strategyType;
	}
	
	public boolean canAddBid(Bid bid, Auction auction) {
		
		return false;
	}
	
}
