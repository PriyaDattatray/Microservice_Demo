package com.demo.user.Vo;

import com.demo.user.entity.User;



public class ResponseTemplateVO {
	
        private User user;
	    private Department department;
	   
	  public ResponseTemplateVO()
	    {
	    	
	    }
	    
	    
	   public ResponseTemplateVO(User user, Department department) {
			super();
			this.user = user;
			this.department = department;
		}
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		public Department getDepartment() {
			return department;
		}
		public void setDepartment(Department department) {
			this.department = department;
		}
	    
	   
		
	}
