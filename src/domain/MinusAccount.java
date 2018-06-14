package domain;

public class MinusAccount extends Account {
	public final static String BANK_NAME="비트뱅크";
	public final static String ACCOUNT_TYPE="마이너스통장";
	public int debt;
	
	public void setDebt(int debt) {
		this.debt =debt;
	}
	public int getDebt() {
		return debt;
	}
public String toString() {
		
		return String.format("%s\n %s\n 계좌번호: %s\n 이름: %s\n 생성일: %s\n 금액: -%d원\n",
				BANK_NAME,
				ACCOUNT_TYPE,
				super.getAccountNo(),
				super.getName(),
				super.getCreateDate(),
				debt);


	}

}
