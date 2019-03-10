package com.bba.portfolio413.entity.relationship;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.bba.portfolio413.entity.node.DepartmentNode;
import com.bba.portfolio413.entity.node.ProgramNode;
import com.bba.portfolio413.entity.node.TcodeNode;

@RelationshipEntity(type = "callTcode")
public class CallTcode {
	@Id
    @GeneratedValue
    private Long id;
	
	//调用时间
    private List<Date> date = new ArrayList<>(); 

    @StartNode  // 代表关系的起点
    private DepartmentNode departmentNode;

    @EndNode    //代表关系的终点
    private TcodeNode tCodeNode;

    public CallTcode() {
    }

    public CallTcode(DepartmentNode departmentNode, TcodeNode tCodeNode) {
        this.departmentNode = departmentNode;
        this.tCodeNode = tCodeNode;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Date> getDate() {
		return date;
	}

	public void setDate(List<Date> date) {
		this.date = date;
	}

	public DepartmentNode getDepartmentNode() {
		return departmentNode;
	}

	public void setDepartmentNode(DepartmentNode departmentNode) {
		this.departmentNode = departmentNode;
	}

	public TcodeNode gettCodeNode() {
		return tCodeNode;
	}

	public void settCodeNode(TcodeNode tCodeNode) {
		this.tCodeNode = tCodeNode;
	}
    
    
}
