package domain;

public class Salary {
	public static final String DEPT = "인터쉽"; 
	protected String dept,name;
	int sal;
	public Salary(String name,int sal) {
		this.name = name.substring(0,1)+DEPT;
		this.sal =sal;
		setDept(DEPT);
		
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDept() {
		return dept;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return String.format("%s인턴 %d만원 지급",name,sal);
	}
}

