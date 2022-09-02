package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dabbawala {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long dabbaId;
    private String DabbaType;
    private String address;
	public Long getDabbaId() {
		return dabbaId;
	}
	public void setDabbaId(Long dabbaId) {
		this.dabbaId = dabbaId;
	}
	public String getDabbaType() {
		return DabbaType;
	}
	public void setDabbaType(String dabbaType) {
		DabbaType = dabbaType;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Dabbawala(Long dabbaId, String dabbaType, String address) {
		super();
		this.dabbaId = dabbaId;
		DabbaType = dabbaType;
		this.address = address;
	}
	public Dabbawala() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
