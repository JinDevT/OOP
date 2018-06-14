package domain;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Account {
	public static final String BANK_NAME="비트뱅크";
	public final static String ACCOUNT_TYPE="기본통장";
	protected String uid,pass,name,createDate,accountNo;
	protected int money;
	

	
	public void setUid(String uid) {
		this.uid = uid;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public void setAccountNo() {
		String result = "";
		for(int i =0; i<3; i++) {
			for(int j =0; j<3; j++) {
				result+=(int)(Math.random()*10);
			}
			result+=(i==2)?"":"-";
		}
		
		accountNo = result;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCreateDate() {
		Date today = new Date();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy년MM월dd일");
		createDate = date.format(today);
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getUid() {
		return uid;
	}
	public String getPass() {
		return pass;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public String getName() {
		return name;
	}
	public String getCreateDate() {
		return createDate;
	}
	public int getMoney() {
		return money;
	}
	public String toString() {
		
		return String.format("%s\n %s\n 계좌번호: %s\n 이름: %s\n 생성일: %s\n 잔액: %d원\n",
				BANK_NAME,
				ACCOUNT_TYPE,
				getAccountNo(),
				getName(),
				getCreateDate(),
				getMoney());
				
	
	}

}
