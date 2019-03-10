package com.bba.portfolio413.entity.node;

import java.util.List;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.fasterxml.jackson.annotation.JsonProperty;

@NodeEntity
public class JOBNode extends BaseEntity{

	private String name;
	private String desc;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	@Relationship(type = "call")
	@JsonProperty("调用程序")
	private List<ProgramNode> programList;
	public List<ProgramNode> getProgramList() {
		return programList;
	}
	public void setProgramList(List<ProgramNode> programList) {
		this.programList = programList;
	}
	
	
	
}
