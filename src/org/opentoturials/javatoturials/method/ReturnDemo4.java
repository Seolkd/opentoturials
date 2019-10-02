package org.opentoturials.javatoturials.method;

public class ReturnDemo4 {
	public static String[] getMembers() {
		String[]members = { "ÃÖÁøÇõ", "ÃÖÀ¯ºó", "ÇÑ¾Æ¶÷"};
		return members;
	}
	
	public static void main(String[] args) {
		String[] members = getMembers();
		System.out.println(members[0]);
		System.out.println(members[1]);
		System.out.println(members[2]);
	}
}
