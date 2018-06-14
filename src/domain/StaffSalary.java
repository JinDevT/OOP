package domain;

public class StaffSalary extends Salary {
	public static final String DEPT = "정직원";
	//String bonus=""; //기본급의 10%
	int bonus;
	
	public StaffSalary(String name, int sal) {
		super(name, sal);
		setDept(DEPT);
		setBonus();
	}
	public void setBonus() {
		bonus = sal*10/100;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDept() {
		return dept;
	}
	public int getBonus() {
		return bonus;
	}
	public String toString() {
		return String.format("%s직원 %d만원 지급",name,bonus);
	}
}
