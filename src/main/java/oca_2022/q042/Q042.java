package oca_2022.q042;

public class Q042 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("A");
		sb.append("A");

		System.out.println("before delete: " + sb);
		
		sb.delete(1, sb.length());
		
		System.out.println("after delete: " + sb);

	}
}
