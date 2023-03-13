
public class StringTest {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		
		System.out.println(s1 + "MITE"); // HelloMITE
		System.out.println(s1 + " MITE"); // Hello MITE
		
		System.out.println(s1 + " " + s2); // Hello World
		
		System.out.println(3 + " " + s2); // 3 World
		System.out.println(s1 + " " + 7); // Hello 7
		
		System.out.println(s1 + " " + (10 > 3)); // Hello True
	}

}
