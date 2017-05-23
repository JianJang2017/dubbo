package com.zj.dubbo.student.message;

import java.io.Serializable;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Builder
public class StudentEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -876383851027596723L;

	private String sno;

	private String name;

	private String sex;

	private int age;
}
