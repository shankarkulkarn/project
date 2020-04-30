package com.cg.banking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicInsert
@DynamicUpdate
@Table(name="loanrequest_tbl")
public class LoanRequest {
	@Id
	@Column(name="loan_req_id", length=10)
	private String loanRequestId;
	
	@Column(name="loan_amt")
	private double loanAmount;
	
	@Column(name="loan_type", length=10)
	private String loanType;
	
	@Column(name="loan_tenure")
	private Integer loanTenure;
	
	@Column(name="loan_req_status", length=15)
	private String reqStaus;
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer = new Customer();

	public String getLoanRequestId() {
		return loanRequestId;
	}

	public void setLoanRequestId(String loanRequestId) {
		this.loanRequestId = loanRequestId;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public Integer getLoanTenure() {
		return loanTenure;
	}

	public void setLoanTenure(Integer loanTenure) {
		this.loanTenure = loanTenure;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
	
	
	
}
