package domain;
/**
 홍길동에서 010번호로 애플 제품 아이폰을 사용해서 스마트폰이기 때문에 이동가능한 상태로
 아이폰을 사용해서 안녕이라고 문자를 전송했다. 
 */
public class IPhone extends CellPhone{
	public static final String BRAND = "애플",
			KIND = "아이폰";
	
	protected String data;
	
	public void setData(String data) {
		this.data = data+"이라고 문자했다";
	}
	public String getData() {
		return data;
	}
	
	public String toString() {
		super.setPortable(true);
		return String.format("%s 에게 %s 번호로  %s 제품 %s 을 사용해 %s 상태로   %s",
				super.getName(),
				super.getPhoneNum(),
				BRAND,KIND,
				super.getMove(),
				data);
	}
}
