// 20205091 박상현 
import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		int n1, n2, n3, n4; // 숫자 4개를 입력 받을 변수 n1~4 선언
		int max , min; // 최대값과 최소값을 저장할 변수 선언
		
		Scanner sc = new Scanner(System.in);
		
		// 정수 입력받기
		System.out.print("네개의 정수를 입력하세요 : "); 
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		
		// 최대값을 구하는 과정
		max = n1;
		if(n2 > max)
			max = n2;
		if(n3 > max)
			max = n3;
		if(n4 > max)
			max = n4;
		
		// 최소값을 구하는 과정
		min = n1;
		if(n2 < min)
			min = n2;
		if(n3 < min)
			min = n3;
		if(n4 < min)
			min = n4;
		
		System.out.println("최소값은 " + min + "이고 최대값은 " + max);
		
	}

}
