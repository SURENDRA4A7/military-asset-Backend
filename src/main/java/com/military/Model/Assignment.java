package com.military.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "assignments")
public class Assignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String assetType;
    private String personnel;
    private int quantity;
    private String date;  // Format: yyyy-MM-dd
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
	public String getPersonnel() {
		return personnel;
	}
	public void setPersonnel(String personnel) {
		this.personnel = personnel;
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
		return "Assignment [id=" + id + ", assetType=" + assetType + ", personnel=" + personnel + ", quantity="
				+ quantity + ", date=" + date + "]";
	}
	public Assignment(Long id, String assetType, String personnel, int quantity, String date) {
		super();
		this.id = id;
		this.assetType = assetType;
		this.personnel = personnel;
		this.quantity = quantity;
		this.date = date;
	}
	public Assignment() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
