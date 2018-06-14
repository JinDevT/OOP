package ui;
import javax.swing.JOptionPane;

//김길동,100(기본급) - > 김인턴 100만원 지급
//김길동,100(기본급) - > 김직원,100 -> 110만원 지급
//김길동,100(기본급) - > 김이사 ,100 ->1100만원 지급
import domain.OwnerSalary;
import domain.Salary;
import domain.StaffSalary;
enum SalaryButt{
	EXIT,
	INTERNSHIP,
	EMPLOYEE,
	PRESIDENT;

	;
}
public class SalaryMain {

	public static void main(String[] args) {
		SalaryButt[] buttons = {
				SalaryButt.EXIT,
				SalaryButt.INTERNSHIP,
				SalaryButt.EMPLOYEE,
				SalaryButt.PRESIDENT,
				
		};	
		Salary sa = null;
		while(true) {
			SalaryButt select = (SalaryButt)JOptionPane.showInputDialog(
					null, //frame
					"선택", //frame title
					"기능을 선택하시오", //order
					JOptionPane.QUESTION_MESSAGE, //type
					null, //icon
					buttons, // Array of choices
					buttons[1]); //default
			switch(select) {
			case EXIT: JOptionPane.showMessageDialog(null, "종료되었습니다."); return;
			case INTERNSHIP:
				sa = new Salary(
						JOptionPane.showInputDialog("이름"),
						Integer.parseInt(JOptionPane.showInputDialog("기본급"))
						);
				JOptionPane.showMessageDialog(null, sa.toString());
					break;
			case EMPLOYEE:
				sa = new StaffSalary(
						JOptionPane.showInputDialog("이름"),
						Integer.parseInt(JOptionPane.showInputDialog("기본급"))
						);
				JOptionPane.showMessageDialog(null, sa.toString());
				break;
			case PRESIDENT:
				sa = new OwnerSalary(
						JOptionPane.showInputDialog("이름"),
						Integer.parseInt(JOptionPane.showInputDialog("기본급"))
						);
				JOptionPane.showMessageDialog(null, sa.toString());
						break;
						
			}
			
		}
	}

}
