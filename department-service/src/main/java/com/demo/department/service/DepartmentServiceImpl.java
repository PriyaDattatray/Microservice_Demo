package com.demo.department.service;

import java.util.ArrayList;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.demo.department.entity.Department;
import com.demo.department.repository.DepartmentRepository;


@Service
public class DepartmentServiceImpl implements  DepartmentService{

	@Autowired
	private DepartmentRepository departmentRepository;
	
	
	
	public DepartmentServiceImpl(DepartmentRepository departmentRepository)
	{
		this.departmentRepository=departmentRepository;
	}

	public Department saveDepartment(Department department) 
	{
		return departmentRepository.save(department);
	}



	@Override
	@Cacheable(cacheNames = "dept", key="#id")
	public Department findDepartmentById(int id) {
		System.out.println("fetching from db");
		return departmentRepository.findByDepartmentId(id);
	}

	
	@Override
	@CacheEvict(cacheNames = "dept", key="#id")
	public void deleteById(int id) {
		
		System.out.println("inside delete");
		departmentRepository.deleteById( id);

	
	}

	@Override
	@CachePut(cacheNames = "dept", key="#dept.id")
	public Department addOrUpdate(Department department) {
	
		System.out.println("dept "+department);
		return departmentRepository.save(department);
	}
}
