package com.asset.management.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
//@Table(name = "Assets_Table")
public class AssetModel {
	
	@Id
	private int id;
	
	private String name;
	private String purchaseDate;
	private String conditionNotes;
	private String status;
	@OneToOne
	private Employee employee1;
	
	@ManyToOne
	@JoinColumn(name="category_id")
	private CategoriesModel category1;

	public String getName() {
		return name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Employee getEmployee1() {
		return employee1;
	}

	public void setEmployee1(Employee employee1) {
		this.employee1 = employee1;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getConditionNotes() {
		return conditionNotes;
	}

	public void setConditionNotes(String conditionNotes) {
		this.conditionNotes = conditionNotes;
	}

	public CategoriesModel getCategory1() {
		return category1;
	}

	public void setCategory1(CategoriesModel category1) {
		this.category1 = category1;
	}

	@Override
	public String toString() {
		return "AssetModel [id=" + id + ", name=" + name + ", purchaseDate=" + purchaseDate + ", conditionNotes="
				+ conditionNotes + ", status=" + status + ", employee1=" + employee1 + ", category1=" + category1 + "]";
	}

	


		
	
	
	

}
