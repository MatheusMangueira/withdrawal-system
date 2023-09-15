package account;

import client.Client;

public class Account {
	
	private double balance;
	private Client client;
	private int ag;
	private int cc;
	
	public void deposit(double value) { 
		this.balance += value;
		
		System.out.println(this.balance + " valor da conta");
	}
	
	 public double getDeposit() {
		return this.balance;	
	}
	 
	 public boolean withdraw(double value) {
		 if (this.balance < value) {
			 System.out.println("valor insuficiente na conta para o saque. Tente mais tarde");
			return false;
		 }
		 this.balance -= value;
		 System.out.println("seu saldo é: " + this.balance);
		 return  true;
	 }
	 
	 public Client getClient() {
		return this.client;
	}
	 
	 public void setClient(Client client) {
		this.client = client;
	}
	 
	public int getAg() {
		return this.ag;
	}
	
	public void setAg(int ag) {
		this.ag = ag;
	}
	
	public int getCc() {
		return this.cc;
	}
	
	public void setCc(int cc) {
		this.cc = cc;
	}
	
}
