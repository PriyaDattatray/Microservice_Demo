package demo.example;

import java.util.HashSet;
import java.util.Set;

public class Employee {

	private int id;
	
	private String name;
	
	private String department;
	
	public Employee()
	{
		
	}
	

	public Employee(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
	
	




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
	
	static class EmployeeSortingComparator
    implements Comparator<Employee> {

    @Override
    public int compare(Employee customer1,
                       Employee customer2)
    {

        // for comparison
        int NameCompare = customer1.getName().compareTo(
            customer2.getName());
        int IdCompare = customer1.getId().compareTo(
            customer2.getId());
        int departmentCompare = customer1.getDepartment().compareTo(
        		customer2.getDepartment());

        // 2-level comparison
        return (NameCompare == 0) ? AgeCompare ? departmentCompare
                                  : NameCompare;
        //big = a > b ? ( a > c ? a : c) : (b > c ? b : c) ;
    }
}
	
	

}
