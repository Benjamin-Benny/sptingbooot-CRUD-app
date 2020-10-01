package com.orthofx.employee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.orthofx.customer.Customer;

@Entity
public class Employee {

	@Id
    private String id;
    private String likes;
    private String dislikes;
    
    @ManyToOne
    private Customer customer;
    
    
    
    public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer cus) {
		this.customer = cus;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLikes() {
		return likes;
	}

	public void setLikes(String likes) {
		this.likes = likes;
	}

	public String getDislikes() {
		return dislikes;
	}

	public void setDislikes(String dislikes) {
		this.dislikes = dislikes;
	}
    
    public Employee() {
		
	}
    
    public Employee(String id, String likes, String dislikes, String customerId) {
		super();
		this.id = id;
		this.likes = likes;
		this.dislikes = dislikes;
		this.customer = new Customer(customerId, " ", " ");
	}
}
