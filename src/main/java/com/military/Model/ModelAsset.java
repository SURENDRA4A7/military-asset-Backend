package com.military.Model;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModelAsset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String type; // e.g., Weapon, Vehicle
    
    private String name;
    private int openingBalance;
    private int closingBalance;
    private int purchased;
    private int transferredIn;
    private int transferredOut;
    private int assigned;
    private int expended;
    
    

    public ModelAsset(Long id, String type, String name, int openingBalance, int closingBalance, int purchased,
			int transferredIn, int transferredOut, int assigned, int expended, ModelBase base) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.openingBalance = openingBalance;
		this.closingBalance = closingBalance;
		this.purchased = purchased;
		this.transferredIn = transferredIn;
		this.transferredOut = transferredOut;
		this.assigned = assigned;
		this.expended = expended;
		this.base = base;
	}



	public ModelAsset() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getOpeningBalance() {
		return openingBalance;
	}



	public void setOpeningBalance(int openingBalance) {
		this.openingBalance = openingBalance;
	}



	public int getClosingBalance() {
		return closingBalance;
	}



	public void setClosingBalance(int closingBalance) {
		this.closingBalance = closingBalance;
	}



	public int getPurchased() {
		return purchased;
	}



	public void setPurchased(int purchased) {
		this.purchased = purchased;
	}



	public int getTransferredIn() {
		return transferredIn;
	}



	public void setTransferredIn(int transferredIn) {
		this.transferredIn = transferredIn;
	}



	public int getTransferredOut() {
		return transferredOut;
	}



	public void setTransferredOut(int transferredOut) {
		this.transferredOut = transferredOut;
	}



	public int getAssigned() {
		return assigned;
	}



	public void setAssigned(int assigned) {
		this.assigned = assigned;
	}



	public int getExpended() {
		return expended;
	}



	public void setExpended(int expended) {
		this.expended = expended;
	}



	public ModelBase getBase() {
		return base;
	}



	public void setBase(ModelBase base) {
		this.base = base;
	}



	@ManyToOne
    private ModelBase base;
}
