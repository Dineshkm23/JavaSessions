package javasessionpractice;

import java.util.ArrayList;

public class FunctionTest {

	public int getMarks(String name) {
		System.out.println("Student name is:" + name);

		switch (name.toLowerCase().trim()) {
		case "dinesh":
			return 94;

		case "ambuja":
			return 100;
		default:
			return -1;
		}
	}

	public static int getStudentMarks(String name) {
		System.out.println("Student name :" + name);
		int marks = -1;
		if (name.equalsIgnoreCase("dinesh")) {
			marks = 95;
		} else if (name.equalsIgnoreCase("Ambuja")) {
			marks = 100;
		} else {

			System.out.println("student name not found...plz pass the right student name " + name);
		}

		return marks;
	}

	public static ArrayList<String> getDevicesList(String empName) {
		ArrayList<String> deviceList = new ArrayList<String>();

		switch (empName.toLowerCase().trim()) {

		case "dinesh":
			deviceList.add("DIphone");
			deviceList.add("DImac");
			deviceList.add("DMac");
			break;
		case "ambuja":
			deviceList.add("AIphone15");
			deviceList.add("AImac25");
			deviceList.add("AMac25");
			break;
		case "kumar":
			deviceList.add("KOnePlus");
			deviceList.add("KPlus");
			deviceList.add("KOne");
			break;

		default:
			System.out.println("plz pass the right emp name....emp name not found...." + empName);
			break;
		}
		return deviceList;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mark = FunctionTest.getStudentMarks("Ambuja");
		System.out.println("Marks:" + mark);

		FunctionTest ft = new FunctionTest();
		System.out.println("Student marks:" + ft.getMarks("ambuja"));
		ArrayList<String> devices=FunctionTest.getDevicesList("ambuja");
		System.out.println(devices);
	}

}
