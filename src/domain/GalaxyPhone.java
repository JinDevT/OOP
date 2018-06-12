package domain;

public class GalaxyPhone extends IPhone {
	public static final String BRAND = "삼성",
			KIND = "갤럭시";
	private String size;
	//홍길동에게 010 번호로 삼성 제품 6인치
	//갤럭시노트폰을 사용해서 이동가능한 상태로
	//안녕이라고 카톡했다.
	//data를 오버라이딩하세요.
	public void setSize(String size) {
		this.size = size;
	}
	public void setData(String data) {
		super.data = data+"이라고 카톡했다";
	}
	
	public String getSize() {
		return size;
	}
	public String toString() {
		setPortable(true);
		return String.format("%s 에게 %s 번호로  %s 제품 %s인치 %s 을 사용해서 %s 상태로   %s .",
				super.getName(),
				super.getPhoneNum(),
				BRAND,size,KIND,
				super.getMove(),
				//super.getCall(),
				super.getData());
	}
}
