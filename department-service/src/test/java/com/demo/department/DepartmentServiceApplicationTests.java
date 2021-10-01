package com.demo.department;


import static org.junit.jupiter.api.Assertions.assertEquals;





import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import com.demo.department.entity.Department;
import com.demo.department.service.DepartmentService;



@ExtendWith(MockitoExtension.class)
class DepartmentServiceApplicationTests {
	
	@Mock
	private DepartmentService departmentService;
	
	
	@Test
	public void saveDepartmentTest()
	{
		 Department departmentResponse = mock(Department.class);
		 when(departmentResponse.getDepartmentId()).thenReturn(101);
		 Department departmentReq = mock(Department.class);
		 when(departmentService.saveDepartment(any(Department.class))).thenReturn(departmentResponse);
		 Department departmentres=  departmentService.saveDepartment(departmentReq);
		 assertEquals(departmentResponse.getDepartmentId(),departmentres.getDepartmentId());
		
		
	}
	
	@Test
	public void findByDeptId()
	{
		 Department departmentResponse = mock(Department.class);
		 when(departmentResponse.getDepartmentId()).thenReturn(10);
		 Department departmentReq = mock(Department.class);
		 when(departmentService.findDepartmentById(any(Integer.class))).thenReturn(departmentResponse);
		 Department departmentres = departmentService.findDepartmentById(departmentReq.getDepartmentId());
		 assertEquals(departmentResponse.getDepartmentId(),departmentres.getDepartmentId());
		
		
	}
	
//	@Test
//	public void DeleteByDeptId()
//	{
//		 Department departmentResponse = mock(Department.class);
//		 when(departmentResponse.getDepartmentId()).thenReturn(10);
//		 Department departmentReq = mock(Department.class);
//		 when(departmentService.deleteById(any(Integer.class))).thenReturn("deleted");
//		 Department departmentres = departmentService.findDepartmentById(departmentReq.getDepartmentId());
//		 int status=departmentres.g
//		 assertEquals(departmentResponse.getDepartmentId(),departmentres.getDepartmentId());
//		
//		//return departmentService.deleteById(id);
//		 
//		 /*
//		  when(userRepository.findById(user.getId())).thenReturn(Optional.of(user));
//          deleteUserService.deleteUser(user.getId());
//          verify(userRepository).deleteById(user.getId());
//		  */
//		
//	}
	
	/*
	 * @PutMapping("/{id}")
	private Department update(@PathVariable int id, @RequestBody Department dept) {

		Department department = departmentService.findDepartmentById(id);

		return departmentService.addOrUpdate(department);

	}
	 */
	@Test
	public void UpdateDept()
	{
		
		Department departmentResponse = mock(Department.class);
		 when(departmentResponse.getDepartmentId()).thenReturn(10);
		 Department departmentReq = mock(Department.class);
		 when(departmentService.addOrUpdate(any(Department.class))).thenReturn(departmentResponse);
		 Department departmentres = departmentService.addOrUpdate(departmentReq);
		 assertEquals(departmentResponse.getDepartmentId(),departmentres.getDepartmentId());
		 
		
	}
	
	
	
}

