package domain;

public class Salary {
	public static final String DEPT = "인터쉽"; 
	protected String dept,name;
	int sal;
	public Salary(String name,int sal) {
		this.name = name.substring(0,1);
		this.sal =sal;
		setDept(DEPT);
		
	}
	public void setDept(String dept) {
		this.dept = dept.substring(0,2);
	}
	public String getDept() {
		return dept;
	}
	public void setName(int sal) {
		this.sal = sal;
	}
	public String toString() {
		return String.format("%s%s %d만원 지급",name,dept,sal);
	}
}

