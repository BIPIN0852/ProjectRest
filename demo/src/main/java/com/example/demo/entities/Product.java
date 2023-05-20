package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {

	@Id
	private long id;
	private String title;
	private String description;
	private boolean active;

	public Product(long id, String title, String description, boolean active) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.active = active;
	}

	public Product() {
		super();

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;

	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", description=" + description + ", active=" + active + "]";
	}

}
