package com.raj;

public class AssignmentCheck {

	public static void main(String[] args) {
		AssignmentCheck object = new AssignmentCheck();
		object.reverse(4321);
		object.add();
	}

	public void reverse(int num) {
		int reverse = 0;
		while (num != 0) {
			int remainder = num % 10;
			reverse = (reverse * 10) + remainder;
			num = num / 10;
		}
		{
			System.out.println(reverse);
		}

	}
	public void add() {
		int a = 10;
		int b = 20;
		System.out.println(a+b);
	}
}