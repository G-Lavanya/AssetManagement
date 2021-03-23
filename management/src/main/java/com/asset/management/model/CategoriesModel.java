package com.asset.management.model;

import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
//@Table(name = "Categories_Table")
public class CategoriesModel {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	
	private String type;
	
	private String description;
	
	@OneToMany(mappedBy = "category1")
	private Set<AssetModel> asset1;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<AssetModel> getAsset1() {
		return asset1;
	}

	public void setAsset1(Set<AssetModel> asset1) {
		this.asset1 = asset1;
	}

	@Override
	public String toString() {
		return "CategoriesModel [id=" + id + ", type=" + type + ", description=" + description + ", asset1=" + asset1
				+ "]";
	}
	
	
			}
