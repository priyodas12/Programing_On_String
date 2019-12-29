package basic_questions;

public class StringBufferImpl {

	public static void main(String[] args) {
		
		StringBuffer s1=new StringBuffer("abc");
		StringBuffer s2=new StringBuffer("abc");
		
		StringBuffer s4=s2;
		
		System.out.println("s1==s2::"+(s1==s2));//False,as both are different Object
		System.out.println("s1.equals(s2)::"+s1.equals(s2));//False,as StringBuffer does not override equals method like
															//String class do as content checking.					
		System.out.println("s2==s4::"+(s2==s4));//True
		System.out.println("s1.equals(s4)::"+s2.equals(s4));//True

	}

}
