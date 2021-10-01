
package com.demo.user.Vo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Department_service")
public class Department {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int departmentId;
	
	@Column(name="department_name")
	private String departmentName;
	
	@Column(name="department_address")
	private String departmentAdd;
	
	@Column(name="department_code")
	private String departmentCode;
	
	
	
	public Department()
	{
		
	}


	public Department(int departmentId, String departmentName, String departmentAdd, String departmentCode) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentAdd = departmentAdd;
		this.departmentCode = departmentCode;
	}


	public int getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	public String getDepartmentAdd() {
		return departmentAdd;
	}


	public void setDepartmentAdd(String departmentAdd) {
		this.departmentAdd = departmentAdd;
	}


	public String getDepartmentCode() {
		return departmentCode;
	}


	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}


	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", departmentAdd="
				+ departmentAdd + ", departmentCode=" + departmentCode + "]";
	}


	public Date getModificationDate() {
		Date d=new Date();
		return d;
	}


	
	
	
}
