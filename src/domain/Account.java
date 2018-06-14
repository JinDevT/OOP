package domain;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
public class Account {
	public static final String BANK_NAME="비트뱅크";
	public final static String ACCOUNT_TYPE="기본통장";
	protected String uid,pass,name,createDate,accountNo,accountType;
	protected int money,deposit,withdraw;
	

	public Account(String name,String uid, String pass) { //외부에 노출 안되는 메소드
		setAccountType(ACCOUNT_TYPE);
		setAccountNo();
		setCreateDate();
		this.name = name;
		this.uid = uid;
		this.pass = pass;
	}
	public void setDeposit(int deposit) {
		money += deposit;
	}
	public void setWithdraw(int withdraw) {
		money -= withdraw;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
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
	
	
	public void setCreateDate() {
		//Date today = new Date();
		//SimpleDateFormat date = new SimpleDateFormat("yyyy년MM월dd일");
		
		createDate = new SimpleDateFormat("yyyy년MM월dd일").format(new Date());
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getAccountType() {
		return accountType;
	}
	
	public String getPass() {
		return pass;
	}
	public String getAccountNo() {
		return accountNo;
	}
	
	public String getCreateDate() {
		return createDate;
	}
	public int getMoney() {
		return money;
	}
	public int getDeposit() {
		return deposit;
	}
	public int getWithdraw() {
		return withdraw;
	}
	public String toString() {
		
		return String.format("%s\n %s\n 계좌번호: %s\n 이름: %s\n 생성일: %s\n 잔액: %d원\n",
				BANK_NAME,
				ACCOUNT_TYPE,
				getAccountNo(),
				name,
				getCreateDate(),
				getMoney());
				
	
	}

}
