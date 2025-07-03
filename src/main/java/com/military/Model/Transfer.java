package com.military.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "transfers")
public class Transfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fromBase;
    private String toBase;
    private String assetType;
    private int quantity;

    private String date; // Format: yyyy-MM-dd

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFromBase() {
		return fromBase;
	}

	public void setFromBase(String fromBase) {
		this.fromBase = fromBase;
	}

	public String getToBase() {
		return toBase;
	}

	public void setToBase(String toBase) {
		this.toBase = toBase;
	}

	public String getAssetType() {
		return assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Transfer [id=" + id + ", fromBase=" + fromBase + ", toBase=" + toBase + ", assetType=" + assetType
				+ ", quantity=" + quantity + ", date=" + date + "]";
	}

	public Transfer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transfer(Long id, String fromBase, String toBase, String assetType, int quantity, String date) {
		super();
		this.id = id;
		this.fromBase = fromBase;
		this.toBase = toBase;
		this.assetType = assetType;
		this.quantity = quantity;
		this.date = date;
	}
    
}
