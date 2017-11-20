
public class CodeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="aaacodebbb";
		String str2="codexxcode";
		String str3="cozexxcope";
		
		System.out.println("countCode(aaacodebbb)="+countCode(str1));
		System.out.println("countCode(codexxcode)="+countCode(str2));
		System.out.println("countCode(cozexxcope)="+countCode(str3));

	}

	public static int countCode(String str) {
		// TODO Auto-generated method stub
		int count=0;
		    
		for (int i=0;i<=str.length()-3;i++) {
		       if(str.charAt(i)=='c' && str.charAt(i+1)=='o'&& str.charAt(i+3)=='e') {
		    	   count++;
		       }
		}
		
		return count;
	}

}
