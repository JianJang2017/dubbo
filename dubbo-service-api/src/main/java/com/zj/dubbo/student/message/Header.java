package com.zj.dubbo.student.message;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Header implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6305006773737973357L;

	private String repCode;
	
	private String repMsg;
}
