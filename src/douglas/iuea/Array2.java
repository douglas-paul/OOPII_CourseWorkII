package douglas.iuea;

import java.util.Scanner;

public class Array2 {
	int Avg=0;
	int q = 7;/*Number of Course units*/
	
	public Array2() {
		Scanner scn = new Scanner(System.in);
		
		int ComputerNetworks;
		System.out.print("\nComputer Networks :");
		ComputerNetworks = scn.nextInt();		
	
		int WebDesignII;
		System.out.print("Web DesignII :");
		WebDesignII = scn.nextInt();
		
		int OOPII;
		System.out.print("Object Oriented Programming II :");
		OOPII = scn.nextInt();			
		
		int SystemAnalysis;
		System.out.print("System Analysis and Design :");
		SystemAnalysis = scn.nextInt();
				
		int ResearchMethodI;
		System.out.print("Research Method I :");
		ResearchMethodI = scn.nextInt();			
		
		int OperatingSystems;
		System.out.print("Operating Systems :");
		OperatingSystems = scn.nextInt();
		
		int CalculusI;
		System.out.print("Calculus I :");
		CalculusI = scn.nextInt();
		
		int sum =  ComputerNetworks + WebDesignII + OOPII + SystemAnalysis + ResearchMethodI + OperatingSystems + CalculusI;
		Avg = sum/q;
		System.out.print("\nTotal Score :" +sum   +"\nAverage Score :" +Avg +"\n\n" );
		/*System.out.println("Average Score :" +Avg);*/
		
		return;
		
	}

}
