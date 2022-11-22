package com.bridgelabz.EmpWages;

import java.util.Scanner;

public class PartTimeEmployee {

	public static void main(String[] args) {
		System.out.println("Please Select Employee Type");
		System.out.println("1.Fulltimer 2.Parttimer");
		Scanner sc = new Scanner(System.in);
		int type = sc.nextInt();
		int WagePerHr = 20;
		int partTimeHr = 8;
		if (type == 1) {
			System.out.println("Wages of Fulltime Employee is " + WagePerHr*partTimeHr*2);
		} else if( type ==2) {
			System.out.println("Wages of Partime Employee is " + WagePerHr*partTimeHr);
		}
	}
}