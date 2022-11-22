package com.bridgelabz.EmpWages;

import java.util.Scanner;

public class Wages {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Is Employee Come...? ");
		System.out.println("Yes/No (Y/N) ");
		int wgesPerHr = 20;
		int fullDayHr = 8;
		char X = sc.next().charAt(0);
		if (X == 'Y') {
			System.out.println("Employee is Present");
			System.out.println("Wages of Employee is " + wgesPerHr * fullDayHr);
		} else if (X == 'y') {
			System.out.println("Employee is Present");
			System.out.println("Wages of Employee is " + wgesPerHr * fullDayHr);
		} else if (X == 'N') {
			System.out.println("Employee is Absent");
			System.out.println("Wages of Employee is " + wgesPerHr * 0);
		} else if (X == 'n') {
			System.out.println("Employee is Absent");
			System.out.println("Wages of Employee is " + wgesPerHr * 0);
		}
	}

}
