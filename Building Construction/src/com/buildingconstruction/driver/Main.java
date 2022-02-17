package com.buildingconstruction.driver;
import java.util.Scanner;

import com.buildingconstruction.service.ConstructionOrder;

public class Main {
	public static void main(String args[]) {

		Scanner sc= new Scanner(System.in);

		System.out.println("Enter the no.of floors in the building");

		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the floor size given on day "+ (i+1));
			arr[i]=sc.nextInt();
		}

		ConstructionOrder co=new ConstructionOrder();
		System.out.println("The order of construction is as follows");
		co.orderOfConstruction(arr,size);
		sc.close();
	}

}
