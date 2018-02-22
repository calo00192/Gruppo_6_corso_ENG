package it.eng.projectwork.group06.pricing;

import java.math.BigDecimal;

import it.eng.projectwork.group06.model.Auction;
import it.eng.projectwork.group06.model.Bid;

public class ForwardMultiplePricing extends ForwardPricing {

	private final BigDecimal multiple;
	
	public ForwardMultiplePricing(Auction auction, BigDecimal multiple) {
		super(auction);
		this.multiple = multiple;
	}
	
	@Override
	public boolean canAddBid(Bid bid) {
		
		//Asta al rialzo di un certo multiplo
		return true;
	}
	
}
