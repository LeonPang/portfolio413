package com.bba.portfolio413.entity.node;

import java.util.List;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.fasterxml.jackson.annotation.JsonProperty;

@NodeEntity
public class DepartmentNode extends BaseEntity{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Relationship(type = "callTcode")
	@JsonProperty("调用Tcode")
	private List<TcodeNode> tcodeList;

	public List<TcodeNode> getTcodeList() {
		return tcodeList;
	}

	public void setTcodeList(List<TcodeNode> tcodeList) {
		this.tcodeList = tcodeList;
	}
	
}
