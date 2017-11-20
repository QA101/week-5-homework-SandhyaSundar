import java.util.Scanner;
public class endOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 
	String str1;
	String str2;
	
	Scanner console=new Scanner(System.in);
	System.out.println("Enter the first String:");
	str1 =console.next();
	System.out.println("Enter the Second String:");
	str2=console.next();
	
	System.out.println(endLastPart(str1, str2));
	 
		
	}	
		public static boolean endLastPart(String a, String b)
		{
			int aLen = a.length();
			int bLen = b.length();
			
			String end;
			String temp;
			
			a = a.toLowerCase();
			b = b.toLowerCase();
			if(aLen >= bLen)
			{
				end = a.substring(aLen - bLen);
				temp = b;
			}
			else
			{
				end = b.substring(bLen - aLen);
				temp = a;
			}
			return (end.equals(temp));
		}
	}

	

