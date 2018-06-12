package ui;
/*
 얼마치를 구입하십니까?
 5000
 5 18 22 33 44 65 
 21 31 41 22 18 19 
 10 32 15 18 15 16 
 0 0 0 0 0 0
 0 0 0 0 0 0
  
 * */

import javax.swing.JOptionPane;
//객체인데 필드가 없는 객체이다.
import domain.BMI; //bmi가 메인메소드로 들어온다.
import domain.Grade;
import domain.Salary;
import domain.Lotto;

public class Main {
	public static void main(String[] args) {
		//BMI bmi = new BMI(); //bmi를 만듦. (인스턴스객체)
		BMI[] arr = new BMI[2]; // 오버라이딩이 발생. //틀만있는상태. 값은 없음.
		BMI bmi = null; // 황무지라고 생각한다 . temp의 역할. 
		int count = 0;
		//Grade grade = new Grade();
		Grade[] brr = new Grade[2];
		Grade grade = null;
		//
		Salary[] crr = new Salary[2];
		Salary salary = null;
		
		Lotto[] drr = new Lotto[5];
		Lotto lotto = null;
	
		
		while(true) {
			int flag=Integer.parseInt(JOptionPane.showInputDialog(
					"메뉴를 골라주세요.\n"
					+"0.종료\n"
					+"1.BMI\n"
					+"2.출력\n"
					+"3.성적입력\n"
					+"4.성적출력\n"
					+"5.부서입력\n"
					+"6.부서출력\n"
					+"7.로또입력\n"
					+"8.로또출력"));
			
			
			
			switch(flag) {
			case 0: JOptionPane.showMessageDialog(null,"종료되었습니다."); return;
			case 1:
//				String name = JOptionPane.showInputDialog("이름");
//				double height =Double.parseDouble(JOptionPane.showInputDialog("키"));
//				double weight = Double.parseDouble(JOptionPane.showInputDialog("몸무게"));
				
				bmi = new BMI(); //초기화 아님. 기존의 값을 없애는 코드 //오버로딩
				bmi.setName( JOptionPane.showInputDialog("이름")); //name 을 bmi로 찾아간다.
				bmi.setHeight(Double.parseDouble(JOptionPane.showInputDialog("키")));
				bmi.setWeight(Double.parseDouble(JOptionPane.showInputDialog("몸무게")));
				bmi.setResult();
				
				/*String result = String.format("%s, %f mm, %f kg, %s\n",
						 bmi.getName(),
						 bmi.getHeight(),
						 bmi.getWeight(),
						 bmi.getResult()); */
				
					arr[count] = bmi;
					count++;
				break;
			case 2:
				String output="";
				for(int i=0; i<arr.length; i++) {
					output += arr[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null,output);
				break;
			case 3:
				grade=new Grade();
				
				grade.setName(JOptionPane.showInputDialog("이름"));
				grade.setKor(Integer.parseInt(JOptionPane.showInputDialog("국어")));
				grade.setEng(Integer.parseInt(JOptionPane.showInputDialog("영어")));
				grade.setMath(Integer.parseInt(JOptionPane.showInputDialog("수학")));
				grade.setTotal();
				grade.setAvg();
				grade.setGrade();
			
				brr[count] = grade;
				count++;
				break;
			case 4:
				String output2="";
				for(int i =0; i<brr.length; i++) {
					output2 += brr[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, output2);
				break;
			case 5:
				salary = new Salary();
				
				salary.setDept(JOptionPane.showInputDialog("부서"));
				salary.setName(JOptionPane.showInputDialog("이름"));
				salary.setSal(Integer.parseInt(JOptionPane.showInputDialog("본봉")));
				salary.setBonus(Integer.parseInt(JOptionPane.showInputDialog("수당")));
				
				crr[count] = salary;
				count++;
				break;
			case 6:
				String output3="";
				for(int i=0; i<crr.length; i++) {
					output3 += crr[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, output3);
			case 7:
				lotto = new Lotto();
				
				lotto.setMoney(Integer.parseInt(JOptionPane.showInputDialog("얼마를 결제하겠습니까.")));
			    lotto.setBall1();
			    lotto.setBall2();
			    lotto.setBall3();
			    lotto.setBall4();
			    lotto.setBall5();
			    lotto.setBall6();
			    
				drr[count] = lotto;
			    count++;
			    break;
			case 8:
				String output4 ="";
				for(int i=0; i<lotto.getMoney(); i++) {
					output4 += drr[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, output4);
				break;
			default: 
				JOptionPane.showInputDialog("error");
				break;
			
			}
		}
	}
}
