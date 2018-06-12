package ui;
/** 상속을 이용해서 코딩
 비트뱅크
 기본통장
 계좌번호: 123 - 456 - 789
 이름 : 홍길동
 생성일 : 2018년 6월 10일
 잔액: 1000원
 ---------------
  비트뱅크
 마이너스 통장
 계좌번호: 123 - 456 - 789
 이름 : 홍길동
 생성일 : 2018년 6월 10일
 잔액: -1000원
 */

import javax.swing.JOptionPane;
import domain.Account;
import domain.MinusAccount;
enum Butta{
	EXIT,
	ACCOUNT_TYPE,
	MINUSACCOUNT_TYPE
	;
}
public class AccountMain {

	public static void main(String[] args) {
		Butta[] buttons = {
				Butta.EXIT,
				Butta.ACCOUNT_TYPE,
				Butta.MINUSACCOUNT_TYPE
				
		};	
		Account cnt = new Account();
		MinusAccount mcnt = new MinusAccount(); 
		while(true) {
			Butta select = (Butta)JOptionPane.showInputDialog(
					null, //frame
					"선택", //frame title
					"기능을 선택하시오", //order
					JOptionPane.QUESTION_MESSAGE, //type
					null, //icon
					buttons, // Array of choices
					buttons[1]); //default
			switch(select) {
			case EXIT: JOptionPane.showMessageDialog(null,"종료되었습니다.");
			case ACCOUNT_TYPE:
				cnt = new Account();
				cnt.setUid(JOptionPane.showInputDialog("ID입력"));
				cnt.setPass(JOptionPane.showInputDialog("PASSWORD 입력"));
				cnt.setName(JOptionPane.showInputDialog("이름"));
				cnt.setAccountNo();
				cnt.setCreateDate();
				cnt.setMoney(Integer.parseInt(JOptionPane.showInputDialog("잔액")));
				
				JOptionPane.showMessageDialog(null,cnt.toString());
				break;
			case MINUSACCOUNT_TYPE:
				mcnt = new MinusAccount();
				mcnt.setUid(JOptionPane.showInputDialog("ID입력"));
				mcnt.setPass(JOptionPane.showInputDialog("PASSWORD 입력"));
				mcnt.setName(JOptionPane.showInputDialog("이름"));
				mcnt.setAccountNo();
				mcnt.setCreateDate();
				mcnt.setDebt(Integer.parseInt(JOptionPane.showInputDialog("잔액")));
				
				JOptionPane.showMessageDialog(null,mcnt.toString());
				break;
			}
		}

	}

}
