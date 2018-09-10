package test_project;

/**
 * @author horizionz
 *
 */
public class demo2 {
	public static void main(String[] args) {
		String s1 = "helloworld";
		String s2 = "hello";
		String s3 = "world";
		String s4 = new String("helloworld");
		String s5 = "hello" + "world";
		String s6 = s2 + s3;
		System.out.println(s1 == s4);
		System.out.println(s1.equals(s4));
	}
}
