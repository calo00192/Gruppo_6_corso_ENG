package it.eng.projectwork.group06.pricing;

import it.eng.projectwork.group06.model.Auction;
import it.eng.projectwork.group06.model.Bid;

public class ForwardPricing extends Pricing {
	
	private final Auction auction;
	
	public ForwardPricing(Auction auction) {
		this.auction = auction;
	}
	
	public boolean canAddBid(Bid bid) {
		
		//TODO: Implementazione asta al rialzo
		return false;
	}

}
