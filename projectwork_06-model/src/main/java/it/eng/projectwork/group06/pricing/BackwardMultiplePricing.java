package it.eng.projectwork.group06.pricing;

import java.math.BigDecimal;

import it.eng.projectwork.group06.model.Auction;
import it.eng.projectwork.group06.model.Bid;

public class BackwardMultiplePricing extends ForwardMultiplePricing {

	public BackwardMultiplePricing(Auction auction, BigDecimal multiple) {
		super(auction, multiple);
	}
	
	@Override
	public boolean canAddBid(Bid bid) {
		
		//Asta al ribasso di un certo multiplo
		return true;
	}
}
