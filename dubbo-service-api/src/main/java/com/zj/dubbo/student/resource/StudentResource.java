package com.zj.dubbo.student.resource;

import com.zj.dubbo.student.message.QueryStudentListRequest;
import com.zj.dubbo.student.message.QueryStudentListResponse;

public interface StudentResource {
	public QueryStudentListResponse getStudentList(QueryStudentListRequest request);
}
