package com.expense.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "expense_details")
public class ExpenseDetails {
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long expenseId;
	
	private String category;
	
	
	private Long tourId;
	
	private Long  created_by;
	
	private Long paid_by;
	
	private double amount;
	
	private String currency;
	
	

}
