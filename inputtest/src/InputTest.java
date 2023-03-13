import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		int w; // 사각형의 폭
		double h; // 사각형의 높이
		String name;
		
		Scanner input = new Scanner(System.in); // Scanner 객체 생성
		
		System.out.print("사각형의 가로를 입력하시오 : ");
		w = input.nextInt(); // 정수를 입력해 사각형의 폭을 정함
		
		System.out.print("사각형의 세로를 입력하시오 : ");
		h = input.nextDouble(); // 실수를 입력해 사각형의 높이를 정함
		
		System.out.print("사각형의 이름을 입력하시오 : ");
		name = input.next();
		
		// 사각형의 정보를 출력
		System.out.println(name + " 사각형의 둘레 : " + 2 * ( w + h) + " 면적 : " + w * h);
		
		
	}

}
