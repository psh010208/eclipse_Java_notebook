import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		int w; // �簢���� ��
		double h; // �簢���� ����
		String name;
		
		Scanner input = new Scanner(System.in); // Scanner ��ü ����
		
		System.out.print("�簢���� ���θ� �Է��Ͻÿ� : ");
		w = input.nextInt(); // ������ �Է��� �簢���� ���� ����
		
		System.out.print("�簢���� ���θ� �Է��Ͻÿ� : ");
		h = input.nextDouble(); // �Ǽ��� �Է��� �簢���� ���̸� ����
		
		System.out.print("�簢���� �̸��� �Է��Ͻÿ� : ");
		name = input.next();
		
		// �簢���� ������ ���
		System.out.println(name + " �簢���� �ѷ� : " + 2 * ( w + h) + " ���� : " + w * h);
		
		
	}

}
