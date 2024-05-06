package StringManipulation;

public class StringVsSrtringBuilderVsStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//immutable - we can not change the string value
		String tr="hello";
		tr.concat("selenium");
		System.out.println(tr);
		
		
		//mutable
		//We can append the text in the same varibale
		StringBuffer sb=new StringBuffer("hello");
		sb.append("Selenium");
		sb.append("Testing");
		System.out.println(sb);
		
		
		StringBuilder sbi=new StringBuilder("Dinesh");
		System.out.println(sbi);
		sbi.append(" kumar M");
		System.out.println(sbi);
		
		
		//System.out.println(sbi.reverse());
		//System.out.println(sbi.length());
		//System.out.println(sbi);
		
		for (int i = sbi.length()-1; i > 0; i--) {
			//System.out.println(sbi.charAt(i));
			//System.out.println(j);
		}
		
		
		String m="Dinesh kumar M";
		//char c[]=m.toCharArray();
		String k1 = "";
		for (int i = m.length()-1; i >=0; i--) {
			
			//System.out.print(m.charAt(i));
			char j=m.charAt(i);
			k1=k1+m.charAt(i);
			
			//System.out.println(k1);
		}
		System.out.println(k1);
		
		
		
		
		
		
	}

}
