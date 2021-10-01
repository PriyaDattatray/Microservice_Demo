package com.demo.department.service;

import com.demo.department.entity.Department;

public interface DepartmentService {
	
	public Department saveDepartment(Department department) ;
	
	public Department findDepartmentById(int id);

	//public Department addOrUpdate(int id,Department department);
	
	public Department addOrUpdate(Department department);


	public void deleteById(int id);

}
