package com.demo.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity

@Table(name="User")
public class User {
	

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name="id")
        private int userId;
	    
	    @Column(name="first_name")
	    private String firstName;
	    
	    @Column(name="last_name")

	    private String lastName;
	    
	    @Column(name="email")

	    private String email;
	    
	    
	    private int departmentId;
	    
	  
	    
	    public User()
	    {
	    }

		public User(int userId, String firstName, String lastName, String email, int departmentId) {
			super();
			this.userId = userId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.departmentId = departmentId;
		}





		public int getUserId() {
			return userId;
		}



		public void setUserId(int userId) {
			this.userId = userId;
		}



		public String getFirstName() {
			return firstName;
		}



		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}



		public String getLastName() {
			return lastName;
		}



		public void setLastName(String lastName) {
			this.lastName = lastName;
		}



		public String getEmail() {
			return email;
		}



		public void setEmail(String email) {
			this.email = email;
		}



		public int getDepartmentId() {
			return departmentId;
		}



		public void setDepartmentId(int departmentId) {
			this.departmentId = departmentId;
		}
	    
	    


}
		