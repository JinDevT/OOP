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
	MINUSACCOUNT_TYPE,
	DEPOSIT,
	WITHDRAW
	;
}
public class AccountMain {

	public static void main(String[] args) {
		Butta[] buttons = {
				Butta.EXIT,
				Butta.ACCOUNT_TYPE,
				Butta.MINUSACCOUNT_TYPE,
				Butta.DEPOSIT,
				Butta.WITHDRAW
				
		};	
		Account cnt = null;

		
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
			case EXIT: JOptionPane.showMessageDialog(null,"종료되었습니다."); return;
			case ACCOUNT_TYPE:
				cnt = new Account(
						JOptionPane.showInputDialog("이름"),
						JOptionPane.showInputDialog("ID입력"),
						JOptionPane.showInputDialog("PASSWORD 입력")
						);
//				cnt.setUid(JOptionPane.showInputDialog("ID입력"));
//				cnt.setPass(JOptionPane.showInputDialog("PASSWORD 입력"));
//				cnt.setName(JOptionPane.showInputDialog("이름"));
				//cnt.setAccountNo(); //공개되면 안되는 값은 은닉화한다.
				//cnt.setCreateDate();
			//	cnt.setDeposit(Integer.parseInt(JOptionPane.showInputDialog("입금금액")));
				
				JOptionPane.showMessageDialog(null,cnt.toString());
				break;
			case MINUSACCOUNT_TYPE:
				cnt = new MinusAccount(
						JOptionPane.showInputDialog("이름"),
						JOptionPane.showInputDialog("ID입력"),
						JOptionPane.showInputDialog("PASSWORD 입력")
						);
				cnt.setMoney(Integer.parseInt(JOptionPane.showInputDialog("대출금")));
				cnt.setMoney(Integer.parseInt(JOptionPane.showInputDialog("대출금액")));
				
				JOptionPane.showMessageDialog(null,cnt.toString());
				break;
			case DEPOSIT:
				cnt.setMoney(Integer.parseInt(JOptionPane.showInputDialog("입금금액")));
				JOptionPane.showMessageDialog(null, cnt.getMoney());
				break;
			case WITHDRAW:
				int money =0;
				cnt.setMoney(Integer.parseInt(JOptionPane.showInputDialog("출금금액")));
				//if(cnt) {}else {}
				JOptionPane.showMessageDialog(null, cnt.getMoney());
				
				break;
			}
		}

	}

}
