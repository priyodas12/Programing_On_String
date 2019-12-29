package basic_questions;

public class EqualsAndDoubleEqual {

	public static void main(String[] args) {
		
		/*With String Example
		 * == will check reference as both reference are pointing to same object in String-pool or not
		 * equals() will check the content,string class implements object class like that only.
		 * */
		String s1="abc";
		String s2="abc";
		String s4=s1;
		
		System.out.println("s1==s2::"+(s1==s2));//True
		System.out.println("s1.equals(s2)::"+s1.equals(s2));//True
		System.out.println("s2==s4::"+(s2==s4));//True
		System.out.println("s1.equals(s4)::"+s2.equals(s4));//True
		
		String s3=new String("abc");
		String s5=new String("abc");
		
		System.out.println("s5==s3::"+(s5==s3));//False
		System.out.println("s5.equals(s3)::"+s5.equals(s3));//True
		
		System.out.println("s1==s3::"+(s1==s3));//False
		System.out.println("s1.equals(s3)::"+s1.equals(s3));//True
		
		System.out.println("s4==s3::"+(s4==s3));//False
		System.out.println("s4.equals(s3)::"+s4.equals(s3));//True
	}
}
