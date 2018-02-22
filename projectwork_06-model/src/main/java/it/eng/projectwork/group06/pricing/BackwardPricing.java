package it.eng.projectwork.group06.pricing;

import it.eng.projectwork.group06.model.Auction;
import it.eng.projectwork.group06.model.Bid;

public class BackwardPricing extends ForwardPricing {

	public BackwardPricing(Auction auction) {
		super(auction);
	}
	
	@Override
	public boolean canAddBid(Bid bid) {
		
		//Asta al ribasso
		return true;
	}
	
}
