package com.casic.springCloud.service;


import com.casic.springCloud.entities.Dept;

import java.util.List;

public interface DeptService
{
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
