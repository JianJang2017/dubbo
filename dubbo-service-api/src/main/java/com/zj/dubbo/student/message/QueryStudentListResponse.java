package com.zj.dubbo.student.message;

import java.io.Serializable;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Builder
public class QueryStudentListResponse extends Header implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4326097373077848342L;

	List<StudentEntity> list;
	
	int count;
}
