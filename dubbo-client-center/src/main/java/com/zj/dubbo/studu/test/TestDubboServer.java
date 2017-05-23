package com.zj.dubbo.studu.test;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zj.dubbo.student.message.QueryStudentListRequest;
import com.zj.dubbo.student.message.QueryStudentListResponse;
import com.zj.dubbo.student.message.StudentEntity;
import com.zj.dubbo.student.resource.StudentResource;

@ContextConfiguration(locations={"classpath:dubbo.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestDubboServer {

    @Resource
    private StudentResource sr;
    @Test
    public void testServer() throws InterruptedException{

        System.out.println("client begin");
        QueryStudentListRequest request= QueryStudentListRequest.builder()
        .age(22)
        .sno("S2017100232")
        .sex("男").build();
        System.out.println(ToStringBuilder.reflectionToString(request, ToStringStyle.JSON_STYLE));

        QueryStudentListResponse resp = sr.getStudentList(request);

        System.out.println(ToStringBuilder.reflectionToString(resp, ToStringStyle.JSON_STYLE));
         List<StudentEntity> list = resp.getList();
         for (StudentEntity studentEntity : list) {
             System.out.println(ToStringBuilder.reflectionToString(studentEntity, ToStringStyle.JSON_STYLE));

		}
        Thread.sleep(20000);

        System.out.println("client end");

    }
}