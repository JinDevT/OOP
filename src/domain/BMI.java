package domain;

public class BMI {
	 String name, result; //상태
	 double height, weight;
	 public void setName(String name) { //set-입력하는 매트릭스로 생각한다. 세터(write)
		this.name = name; //setName의 받았던 이름을 class의 name에 저장해라. 
	 }
	 public void setResult() {
		 double a = weight/((height*height)/10000);
		 if(a<18.5){
				result ="저체충";
				}else if(a>18.5 && a<23){
					result = "정상";
				}else if(a>23 && a<25){
					result ="비만 전단계";
				}else if(a>25 && a<30){
					result="1단계 비만";
				}else if(a>30 && a<35){
					result="2단계 비만";
				}else{
					result="3단계 비만";
			}
		
	 }
	 public void setHeight(double height) {
		 this.height = height;
	 }
	 public void setWeight(double  weight) {
		 this.weight = weight;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
	 }
	 
	public  String getName() {
		return name; //this.name 이라고 써도되는데 생략가능하다.
	}
	public  String getResult() { //get - 출력만하는 매트릭스로 생각한다. 게터(read)
		return result;
	}public  double getHeight() {
		return height;
	}public  double getWeight() {
		return weight;
	}
	public String toString() { //통으로 내보낼 때 toString으로 쓴다.
		return String.format("%s | %f | %f | %s |", name, height, weight,result);
		
		
		
	}
}
