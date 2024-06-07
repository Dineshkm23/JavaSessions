package javasessionpractice;

import java.util.ArrayList;

public class ArrayListTraversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> footerLinksList= new ArrayList<String>();
		
		footerLinksList.add("Dinesh");
		footerLinksList.add("Kumar");
		footerLinksList.add("Ambuja");
		footerLinksList.add("Lakkanahalli");
		
		System.out.println(footerLinksList.size());
		System.out.println(footerLinksList);
		
		
		System.out.println(footerLinksList.get(0));
		System.out.println(footerLinksList.get(1));
		//System.out.println(footerLinksList.get(-1));
		//System.out.println(footerLinksList.get(4));//java.lang.IndexOutOfBoundsException
		
		System.out.println("_______________________________________");
		for (int i = 0; i < footerLinksList.size(); i++) {
			System.out.println(footerLinksList.get(i));
		}
		
		System.out.println("_______________________________________");
		for(String e:footerLinksList) {
			System.out.println(e);
		}
		
		
		ArrayList<String> pageList = new ArrayList<String>();//vc=10
		//maintains order: order based AL
		pageList.add("Login");//0
		pageList.add("Register");//1
		pageList.add("Forgot Pwd");//2
		pageList.add("Wish List");//3 ---pc=4, vc=6
		System.out.println(pageList.size());//4

		
		//pageList.add(5, "contact us");//IOB
		
		pageList.add(0, "Naveen");
		
		pageList.set(2, "Naveen");
		
		System.out.println(pageList);
		//pageList.remove(1);//pc=3, vc=7
		
		System.out.println(pageList.get(1));
		
		System.out.println(pageList.size());//3
		pageList.remove(1);//pc=3, vc=7
		System.out.println(pageList);
		
	}

}
