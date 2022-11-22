package com.bridgelabz.EmpWages;

import java.util.Scanner;

public class SwitchPresentOrAbsent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Select Employee Type ");
		System.out.println("1.Fulltimer 2.Parttimer ");

		int X = sc.next().charAt(0);
		int WagePerHr = 20;
		int partTimeHr = 8;
		switch (X) {
		case '1':
			System.out.println("Wages of Fulltime Employee is " + WagePerHr * partTimeHr * 2);
			break;
		case '2':
			System.out.println("Wages of Partime Employee is " + WagePerHr * partTimeHr);
			break;

		}
	}
}