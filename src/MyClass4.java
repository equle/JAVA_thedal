import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MyClass4 {
	
	Random random = new Random();
	Scanner scan = new Scanner(System.in);
	
	
	public int num() {
		
		int num1 = random.nextInt(89) + 10;
		int num2 = random.nextInt(89) + 10;
		
		System.out.print(num1 + " + "+ num2 + " = ");
		
		return (num1 + num2);
	}
	
//		int[] nums = new int[2];
//		int num1 = random.nextInt(89) + 10;
//		nums[0] = num1;
//		int num2 = random.nextInt(89) + 10;
//		nums[1] = num2;
	
	// 숫자 출력 메소드
	public ArrayList<Integer> rndNum() {
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		int num1 = random.nextInt(89) + 10;
		nums.add(num1);
		int num2 = random.nextInt(89) + 10;
		nums.add(num2);
		nums.add(num1+num2);
		
		return nums;
	}
	
	//더하기 메소드
	public int plus(int num1, int num2) {
		return num1+num2;
	}
	
	//스캔 메소드
	public int userinput() {
		return scan.nextInt();
	}

	// 종료 메소드
	public boolean zero(int input) {
		if (input == 0) {			
			return true;
		}else {
			return false;
		}
	}
	
	// 정답확인 메소드
	public boolean ox(int result, int input) {
		
		if (result == input) {
			return true;
		}
		else {
			return false;
		}
	
	}

}
