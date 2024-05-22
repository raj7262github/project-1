package com.raj;

public class AssignmentCheck {

	public static void main(String[] args) {
		AssignmentCheck object = new AssignmentCheck();
		object.reverse(4321);
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
}