package stringmethod;

public class Example6 {

	public static void main(String[] args) {
		String a="devi";
		String b="Praveen";
		String c="devi";
		String d="praveen";
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println("----------------");
		System.out.println(b.equalsIgnoreCase(d));
	}

}
