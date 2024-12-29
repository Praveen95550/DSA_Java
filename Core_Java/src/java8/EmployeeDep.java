package java8;

import java.util.List;

public class EmployeeDep {

	private String empId;
	
	private List<String> department;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public List<String> getDepartment() {
		return department;
	}

	public void setDepartment(List<String> department) {
		this.department = department;
	}

	public EmployeeDep(String empId, List<String> department) {
		super();
		this.empId = empId;
		this.department = department;
	}
	
	
}
