package douglas.iuea;

import java.util.ArrayList;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList();
		Scanner scn = new Scanner(System.in);
		int n=1;		
		Array2 course;
	
	while(true) {
		System.out.print("Enter Student "+ n + ":");
		String name = new Scanner(System.in).nextLine();

		if(name.toLowerCase().equals("exit"))
			break;
		else {
			names.add(name);
		    course = new Array2();
		
		  }
		n++;
				
	    }
		
	  }
	
    }



	


