package com.bba.portfolio413.entity.relationship;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.bba.portfolio413.entity.node.BaseEntity;
import com.bba.portfolio413.entity.node.ProgramNode;

@RelationshipEntity(type = "call")
public class CallPrograme  <T extends BaseEntity>{
	@Id
    @GeneratedValue
    private Long id;
	
	//调用时间
    private List<Date> date = new ArrayList<>(); 

    @StartNode  // 代表关系的起点
    private T callerNode;

    @EndNode    //代表关系的终点
    private ProgramNode programNode;

    public CallPrograme() {
    }

    public CallPrograme(T callerNode, ProgramNode programNode) {
        this.callerNode = callerNode;
        this.programNode = programNode;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public T getCallerNode() {
		return callerNode;
	}

	public void setCallerNode(T callerNode) {
		this.callerNode = callerNode;
	}

	public ProgramNode getProgramNode() {
		return programNode;
	}

	public void setProgramNode(ProgramNode programNode) {
		this.programNode = programNode;
	}

	public List<Date> getDate() {
		return date;
	}

	public void setDate(List<Date> date) {
		this.date = date;
	}
    
    
}
