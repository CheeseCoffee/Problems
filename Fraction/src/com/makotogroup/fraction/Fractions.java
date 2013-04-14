package com.makotogroup.fraction;

import java.util.Arrays;
import java.util.Scanner;


public class Fractions {

	public static void arrSort(Fraction[] arr){
		Arrays.sort(arr);
	}
	
	public static float convertToFloat(Fraction fraction){
		float result;
		result=((float)fraction.getNum())/((float)fraction.getDen());
		return result;
	}

	public static Fraction[] scanMass(){
		System.out.println("¬ведите кол-во элементов массива");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Fraction[] arrFrac = new Fraction[size];
		for (int i=0; i<size; i++){
			arrFrac[i] = new Fraction();
			arrFrac[i].scanFrac();
		}
		return arrFrac;
	}
	
	public static void printMass(Fraction[] arr){
		for(int i=0;i<arr.length;i++){
			arr[i].print();
		}
		System.out.println();
	}
}

