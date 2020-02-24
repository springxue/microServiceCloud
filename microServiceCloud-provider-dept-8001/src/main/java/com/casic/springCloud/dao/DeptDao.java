package com.casic.springCloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.casic.springCloud.entities.Dept;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface DeptDao
{
	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
