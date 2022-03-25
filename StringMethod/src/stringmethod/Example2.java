package stringmethod;

public class Example2 {

	public static void main(String[] args) {
		String text="Priya";
		String text1="girl";
		String text2="is";
		String text3="Priya";
		String text4="Girl";
		System.out.println(text1.compareTo(text1));
		System.out.println(text1.compareTo(text3));
		System.out.println(text2.compareTo(text1));
		System.out.println("----------------");
		System.out.println(text1.compareToIgnoreCase(text4));
	}

}
