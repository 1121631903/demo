package com.zhou.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
 
import com.zhou.ssm.entity.Student;
import com.zhou.ssm.dao.StudentDao;
import com.zhou.ssm.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{

	@Resource
    private StudentDao studentDao;
	
	public List<Student> findList() {
		 
		return  studentDao.findList();
	}

}
