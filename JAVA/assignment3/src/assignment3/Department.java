package assignment3;

public class Department {

	int departmentId;
	String departmentName;
	
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + departmentId;
		result = prime * result + ((departmentName == null) ? 0 : departmentName.hashCode());
		return result;
	}
	public boolean equals(Department other) {
	if(departmentName==other.departmentName)
	{
		return true;
	}else return false;
	
	}
}
