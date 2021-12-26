package com.expense.models;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class TxnDetailsLog {

	private Long txnId;
	private int slNo;
	private Date lastUpdated;
	private Double amount;
	private String currency;
	private String txnTyoe;

}
