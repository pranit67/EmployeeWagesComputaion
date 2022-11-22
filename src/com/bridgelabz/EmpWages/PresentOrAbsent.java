package com.bridgelabz.EmpWages;

import java.util.Scanner;

public class PresentOrAbsent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Is Employee Come...? ");
		System.out.println("Yes/No (Y/N) ");

		char X = sc.next().charAt(0);
		if (X == 'Y') {
			System.out.println("Employee is Present");
		} else if (X == 'y') {
			System.out.println("Employee is Present");
		} else if (X == 'N') {
			System.out.println("Employee is Absent");
		} else if (X == 'n') {
			System.out.println("Employee is Absent");
		}
	}

}
