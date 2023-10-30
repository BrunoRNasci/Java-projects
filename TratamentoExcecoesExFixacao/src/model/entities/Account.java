package model.entities;

import model.exceptions.BusinnesException;

public class Account {
	private Integer number;
	private String holder;
	private Double  balance;
	private Double withdrawLimit;
	
	
	public Account(){
		
	}
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(Double deposit) {
		balance += deposit;
	}
	
	public void withdrawn(Double withdrawn) {
		validateWithdrawn(withdrawn);
		balance -= withdrawn;
	}
	
	public void validateWithdrawn(Double withdrawn) {
		if(withdrawn> getWithdrawLimit()) {
			throw new BusinnesException("The amount exceeds withdraw limit");
		}
		if(withdrawn>getBalance()) {
			throw new BusinnesException("Not enough balance");
		}
		
	}
	
}
