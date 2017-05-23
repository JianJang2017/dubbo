package com.zj.dubbo.study.resource.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.zj.dubbo.student.message.QueryStudentListRequest;
import com.zj.dubbo.student.message.QueryStudentListResponse;
import com.zj.dubbo.student.message.StudentEntity;
import com.zj.dubbo.student.resource.StudentResource;
@Component
public class StudentResourceImpl implements StudentResource {

	@Override
	public QueryStudentListResponse getStudentList(QueryStudentListRequest request) {
		List<StudentEntity> list = new ArrayList<StudentEntity>();
		StudentEntity ss = StudentEntity.builder().sno("2017052101")
				.name("张三丰")
				.age(20)
				.sex("男")
				.build();
		list.add(ss);
		StudentEntity s1 = StudentEntity.builder().sno("2017052102")
				.name("王二小")
				.age(22)
				.sex("男")
				.build();
		list.add(s1);
		QueryStudentListResponse response= QueryStudentListResponse.builder()
				.count(2)
				.list(list)
				.build();
		return response;
	}

}
