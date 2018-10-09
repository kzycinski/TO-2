package pl.edu.agh.iisg.to.javafx.cw1.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javafx.beans.Observable;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Account {

	private String name;
	
	private BigInteger balance;
	
	private ObservableList<Transaction> transactions;

	public Account(String name) {
		this.name = name;
		this.balance = BigInteger.ZERO;
		this.transactions = FXCollections.observableArrayList();
	}

	public final String getName() {
		return name;
	}
	
	
	public final BigInteger getBalance() {
		return balance;
	}
	
	public final List<Transaction> getTransactions() {
		return transactions;
	}
	
	public final void addTransaction(Transaction transaction) {
		this.transactions.add(transaction);
	}
		
	public final ObservableList<Transaction> getTransactionsProperty(){
		return transactions;
	}
}
