package com.bba.portfolio413.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bba.portfolio413.entity.node.ProgramNode;
import com.bba.portfolio413.entity.node.TcodeNode;
import com.bba.portfolio413.repository.CommonRepository;
import com.bba.portfolio413.result.ResponseMessage;
import com.bba.portfolio413.result.ResponseResult;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@RestController
@RequestMapping("/rest")
public class CommonController {
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	@Autowired
	CommonRepository commonRepository;  
	
	
	@RequestMapping("/test")
	public ResponseResult test() throws Exception {
//		TcodeNode tCodeNode = new TcodeNode();
//		tCodeNode.setName("test/BMW/AVG_DEM");
//		tCodeNode.setDesc("Configuration for Average Daily Dema");
//		commonRepository.save(tCodeNode);
		
		ProgramNode programNode = new ProgramNode();
		programNode.setName("testPro");
		programNode.setTransactionText("test");
		commonRepository.save(programNode);
		
		TcodeNode tCodeNode = new TcodeNode();
		tCodeNode.setName("test2/BMW/AVG_DEM");
		tCodeNode.setDesc("Configuration for Average Daily Dema");
		List programNodeList = new ArrayList<ProgramNode>();
		programNodeList.add(programNode);
		tCodeNode.setProgramList(programNodeList);
		commonRepository.save(tCodeNode);
		
    	return new ResponseResult(ResponseMessage.OK);
	}
	
	/**
     * 创建一个TCODE类型节点
     * @param TCODE
     * @return
     */
    @PostMapping("/saveTCode")  
    public ResponseResult saveTCode(@RequestBody TcodeNode tCodeNode){      	
    	commonRepository.save(tCodeNode);
    	return new ResponseResult(ResponseMessage.OK);
    }  
}
