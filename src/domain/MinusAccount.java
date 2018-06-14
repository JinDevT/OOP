package domain;

public class MinusAccount extends Account {
	public final static String BANK_NAME="비트뱅크";
	public final static String ACCOUNT_TYPE="마이너스통장";
	public int limit;
	public MinusAccount(String name, String uid, String pass) {
		super(name,uid,pass); //부모의 생성자
		//setAccountType(ACCOUNT_TYPE);
		
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getLimit() {
		return limit;
	}
public String toString() {
		
		return String.format("%s\n %s\n 계좌번호: %s\n 이름: %s\n 생성일: %s\n 금액: -%d원\n",
				BANK_NAME,
				ACCOUNT_TYPE,
				accountNo,
				name,
				createDate,
				limit);


	}

}
