package com.military.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "expenditures")
public class Expenditure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String assetType;
    private String reason;
    private int quantity;
    private String date;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAssetType() {
		return assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
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
		return "Expenditure [id=" + id + ", assetType=" + assetType + ", reason=" + reason + ", quantity=" + quantity
				+ ", date=" + date + "]";
	}
	public Expenditure(Long id, String assetType, String reason, int quantity, String date) {
		super();
		this.id = id;
		this.assetType = assetType;
		this.reason = reason;
		this.quantity = quantity;
		this.date = date;
	}
	public Expenditure() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
