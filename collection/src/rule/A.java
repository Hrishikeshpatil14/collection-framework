package rule;

public class A {

	public static void main(String[] args) {
		String str="momm";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("Palimdrome");
		}else {
			System.out.println("Not-palindrome");
		}
	}
}
