package domain;

public class CellPhone extends Phone{ //부모 : Phone 자식 : cellPhone
	public static final String BRAND = "노키아",
			KIND = "휴대폰";
	
	private boolean portable;
	private String move;
	public void setPortable(boolean portable) {
		/*if(portable) {
			setMove("이동가능");
		}else {
			setMove("이동 불가능");
		}*/
		setMove((portable)?"이동가능":"불가능");
		this.portable = portable;
	}
	public boolean isPortable() { //boolean 타입만 get을 주지말고 is 를 붙혀준다.
		return portable;
	}
	public void setMove(String move) {
		this.move = move;
	}
	public String getMove() {
		return move;
	}
	
	public String toString() {
		setPortable(true);
		return String.format("%s 에게 %s 번호로  %s %s 제품 %s를 사용해서 %s 라고 통화했다.",
				super.getName(), 
				super.getPhoneNum(),
				move,BRAND, KIND, 
				super.getCall());
	}
}
