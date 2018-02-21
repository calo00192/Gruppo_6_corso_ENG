package it.eng.projectwork.group06.model;

import javax.persistence.Entity;

@Entity
public class Supplier extends User {

	private String pIVA;
	
	public Supplier() {}
	
	public Supplier(String pIVA) {
		setpIVA(pIVA);
	}

	/**
	 * @return the pIVA
	 */
	public String getpIVA() {
		return pIVA;
	}

	/**
	 * @param pIVA the pIVA to set
	 */
	public void setpIVA(String pIVA) {
		this.pIVA = pIVA;
	}
	
	
	
	
}
