package com.zj.dubbo.student.message;

import java.io.Serializable;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
/**
 * 
 * @author Administrator
 *
 */
@Getter
@Setter
@Builder
public class QueryStudentListRequest implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 7351222497088432761L;

private String sno;

private String name;

private String sex;

private int age;
}
