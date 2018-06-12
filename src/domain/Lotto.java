package domain;
/*
 로또볼 추첨
 1~45 까지 랜덤숫자
 볼갯수는 총 6개
 출력은 [5, 23, 2, 40, 19, 22 ]
 * */
public class Lotto {
	int ball1,ball2,ball3,ball4,ball5,ball6,money;
	String result;
	
	public void  setBall1() {
		this.ball1 =(int)(Math.random()*45)+1;
	}
	public void setBall2() {
		this.ball2 =(int)(Math.random()*45)+1;
	}
	public void setBall3() {
		this.ball3 =(int)(Math.random()*45)+1;
	}
	public void setBall4() {
		this.ball4 =(int)(Math.random()*45)+1;
	}
	public void setBall5() {
		this.ball5 =(int)(Math.random()*45)+1;
	}
	public void setBall6() {
		this.ball6 = (int)(Math.random()*45)+1;
	}
	public void setMoney(int money) {
		this.money = money/1000;
	}
//	public void setResult() {
//		int[] Lotto = new int[6];
//		for(int i =0; i<Lotto.length; i++) {
//			Lotto[i] = (int)(Math.random()*45+1);
//		
//		}
//		
//	}
	public int getBall1() {
		return ball1;
	}
	public int getBall2() {
		return ball2;
	}
	public int getBall3() {
		return ball3;
	}
	public int getBall4() {
		return ball4;
	}
	public int getBall5() {
		return ball5;
	}
	public int getBall6() {
		return ball6;
	}
	public int getMoney() {
		return money;
	}
//	public String getResult() {
//		return result;
//	}
	public String toString() {
		return String.format("%d | %d | %d | %d | %d |%d |", ball1,ball2,ball3,ball4,ball5,ball6);
	}

}
