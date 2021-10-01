package com.demo.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo.department.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer>{

	Department findByDepartmentId(int id);
	

}
