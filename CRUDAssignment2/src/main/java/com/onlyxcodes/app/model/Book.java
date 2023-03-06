package com.onlyxcodes.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.transaction.annotation.EnableTransactionManagement;

@Entity
@Table(name = "book")
@EnableTransactionManagement
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "published")
	private String published;
	
	@Column(name = "title")
	private String title;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesc() {
		return description;
	}

	public void setDesc(String description) {
		this.description = description;
	}

	public String getPub() {
		return published;
	}

	public void setPub(String published) {
		this.published = published;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	
}
