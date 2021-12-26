package com.expense.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "txn_details")
public class TxnDetails {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long txnId;
	
	private Long expenseId;
	
	private String currentStatus;
	
	private String created_for;
	
	private Date created_on;
	
	private Date updated_on;
	
	private boolean isPersonal;
	
	private Double amount;
	
	private Double remaining;
	
	
	
}
