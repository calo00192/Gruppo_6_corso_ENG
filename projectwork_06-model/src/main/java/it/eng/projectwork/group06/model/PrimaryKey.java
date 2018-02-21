package it.eng.projectwork.group06.model;

/**
 * rappresenta una generica chiave primaria
 * 
 */

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class PrimaryKey <PK> {
	
	/////////////////////////////////////////////////////////
	//			CAMPI
	
	/**
	 * campo chiave primaria generica
	 */
	public PK key;


	
	///////////////////////////////////////////////////////
	//		METODI
	
	
	/**
	 * @return the key
	 */
	public abstract PK getKey();

	/**
	 * @param key the key to set
	 */
	public abstract void setKey(PK key) ;
	
	@Override
	public String toString() {
		return String.format("Key = %s\n", getKey());
	}
	

}
