package p1.p2;

/*
 * Assignment-1 : Reverse Content of String 
 *              Ex: String city="Bangalore"
 *                               erolagnaB
 */
public class StringBufferDemo1 {

	public static void main(String[] args) {
		
		StringBuffer sb1=new StringBuffer();
		StringBuffer sb2=new StringBuffer("Prudhvi");
		
		System.out.println(sb2.length());
		//System.out.println(sb2.reverse());
		System.out.println("d is available in Index Position :"+sb2.indexOf("d"));
		
		sb2.insert(7,"Raj");
		sb2.insert(10,1234);
		System.out.println(sb2);
		
		
		StringBuffer sb3=new StringBuffer("Praveen");
		
		System.out.println(sb3);
		
		sb3.delete(3, 6);
		
		
		System.out.println(sb3);
		
		StringBuffer sb4=new StringBuffer("ABCD");
		sb4.deleteCharAt(2);
		
		System.out.println(sb4);
		
		
		sb4.append("XYZ");
		
		System.out.println(sb4);
		
		
		
		

	}

}
