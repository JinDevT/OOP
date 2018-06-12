package ui;
import javax.swing.JOptionPane;
import domain.Phone;
import domain.CellPhone;
import domain.IPhone;
import domain.GalaxyPhone;
//0.통화종료
//1.집전화기	
enum Butt{
	EXIT,
	TELEPHONE,
	CELPHONE,
	IPHONE,
	GALAXY
	;
}
public class PhoneMain {

	public static void main(String[] args) {
		
		Butt[] buttons = {
				Butt.EXIT,
				Butt.TELEPHONE,
				Butt.CELPHONE,
				Butt.IPHONE,
				Butt.GALAXY
		};	
		Phone phone = new Phone();
		CellPhone cp = new CellPhone();
		IPhone ip = new IPhone();
		GalaxyPhone gl = new GalaxyPhone();
		while(true) {
			Butt select = (Butt)JOptionPane.showInputDialog(
					null, //frame
					"선택", //frame title
					"기능을 선택하시오", //order
					JOptionPane.QUESTION_MESSAGE, //type
					null, //icon
					buttons, // Array of choices
					buttons[1]); //default
			switch(select) {
			case EXIT: JOptionPane.showMessageDialog(null,"종료되었습니다."); return;
			case TELEPHONE:
				phone = new Phone();
				phone.setName(JOptionPane.showInputDialog("이름"));
				phone.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				phone.setCall(JOptionPane.showInputDialog("할말"));
				

				
				JOptionPane.showMessageDialog(null, phone.toString());
				break;
			case CELPHONE:
				cp = new CellPhone();
				cp.setName(JOptionPane.showInputDialog("이름"));
				cp.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				cp.setCall(JOptionPane.showInputDialog("할말"));
				JOptionPane.showMessageDialog(null, cp.toString());
				break;
			case IPHONE:
				ip = new IPhone();
				ip.setName(JOptionPane.showInputDialog("이름"));
				ip.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				//ip.setCall(JOptionPane.showInputDialog("할말"));
				ip.setData(JOptionPane.showInputDialog("데이터"));
				JOptionPane.showMessageDialog(null, ip.toString());
				break;
			case GALAXY:
				gl = new GalaxyPhone();
				gl.setName(JOptionPane.showInputDialog("이름"));
				gl.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				gl.setSize(JOptionPane.showInputDialog("사이즈"));
				gl.setData(JOptionPane.showInputDialog("데이터"));
				JOptionPane.showMessageDialog(null, gl.toString());
				break;
			default :
				JOptionPane.showMessageDialog(null, "eeror");
				break;
				
			}
		}
	}

}
