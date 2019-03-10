package com.bba.portfolio413.entity.node;

import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class ProgramNode extends BaseEntity{
	private String name;
	private String transactionText;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTransactionText() {
		return transactionText;
	}
	public void setTransactionText(String transactionText) {
		this.transactionText = transactionText;
	}
	
}
