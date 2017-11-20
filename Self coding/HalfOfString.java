public class HalfOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      
		      String str1="WooHoo";
			  String str2="HelloThere";
			  String str3="abcdef";
				
			System.out.println("First Half of (WooHoo):"+FirstHalf(str1));	
			System.out.println("First Half of (HelloThere):"+FirstHalf(str2));
			System.out.println("First Half of (abcdef):"+FirstHalf(str3));
	}
			public static String FirstHalf(String str) {
				// TODO Auto-generated method stub
				String result="";
					if (str.length()%2==0) {
					
					result=str.substring(0, str.length()/2);	
					//System.out.println(result);
					}
				
				return result;
			}				
}
