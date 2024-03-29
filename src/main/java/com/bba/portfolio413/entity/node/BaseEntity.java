package com.bba.portfolio413.entity.node;

import org.neo4j.ogm.annotation.GraphId;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * 抽取共同的属性字段
 */
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public abstract class BaseEntity {

	/**
	 * Neo4j会分配的ID（节点唯一标识 当前类中有效）
	 */
	@GraphId
	private Long id;	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
}
