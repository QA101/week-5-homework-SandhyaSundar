
public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "Hello There";
		String s1="Seattle is cool";
		String s2="I Love Java";
		
		System.out.println(ReverseString(s));
		System.out.println(ReverseString(s1));
		System.out.println(ReverseString(s2));
	}

	public static String ReverseString(String str) {
		String result= "";
		
		for (int i=0;i<str.length();i++) {
			result= str.charAt(i)+result;
		      	//System.out.println("result:"+result);
		}
		return result;
			
	}

}
