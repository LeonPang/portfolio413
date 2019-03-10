package com.bba.portfolio413.repository;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import com.bba.portfolio413.entity.node.BaseEntity;

public interface CommonRepository extends Neo4jRepository<BaseEntity,Long> {
	

}
