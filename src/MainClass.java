import java.util.ArrayList;
import java.util.Scanner;

/*
 * Main Class
 */
public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("Main Classa");
		
		MyClass mc = new MyClass();
		MyClass2 mc2 = new MyClass2();
		MyClass3 mc3 = new MyClass3();
		
		
		System.out.println(mc); // mc주소 할당 값 MyClass@7a9273a8
		mc.bab();
		mc.food();
		
		mc2.m1();
		mc2.m2();
		
		int i = mc3.r1();
		System.out.println("r1에서 받은 int 데이터 "+i);
		
		String s = mc3.r2();
		System.out.println("r2에서 받은 String 데이터 "+s);
		
		//클래스, 메소드 만들기
		//더달의 기능을 별도로 만들어
		//더하기 출력 해주는 매소드
		//더하기의 답을 전달해주는 매소드
		//메인에서 매소든만 이용하여 출력 또는 답을 비교
		
		MyClass4 mc4 = new MyClass4();
		
		System.out.println();
		System.out.println("더달을 시작합니다. (종료 : 0)");
		for(;;) {
			//랜덤 메소드
			ArrayList<Integer> nums = mc4.rndNum();
			System.out.print(nums.get(0) + " + "+ nums.get(1) + " = ");
			
			//스캐너 메소드
			int input = mc4.userinput();
			
			//종료 메소드
			if(mc4.zero(input)) {
				System.out.println("더달을 종료합니다.");
				break;
			}
			//더하기 메소드
			int result = mc4.plus(nums.get(0), nums.get(1));
			//ox 메소드
			if(mc4.ox(result, input)) {
				System.out.println("정답입니다.");
			}     
			else {
				System.out.println("오답입니다.");
			}
			
		}
	}
}
