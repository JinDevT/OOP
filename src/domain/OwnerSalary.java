package domain;

public class OwnerSalary extends StaffSalary {
	public static final String DEPT = "이사회";
	protected int share; // (sal + bonus) *10
	
	public OwnerSalary(String name, int sal) {
		super(name,sal);
		setDept(DEPT);
		setBonus();
		setShare();
		
	}
	public void setDept(String dept) {
		this.dept = dept.substring(0,2);
	}
	public void setShare() {
		share = (sal + bonus)*10;
	}
	public int share() {
		return share;
	}
	public String getDept() {
		return dept;
	}
	public String toString() {
		return String.format("%s직원 %d만원 지급",name,share);
	}
	
}
