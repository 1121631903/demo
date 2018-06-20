package com.zhou.ssm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zhou.ssm.entity.Student;
 
@Repository
public interface StudentDao {

	public List<Student> findList();
}
