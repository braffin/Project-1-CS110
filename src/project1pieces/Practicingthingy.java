package project1pieces;

import java.security.SecureRandom;
import java.util.Scanner;

public class Practicingthingy {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		final int alength = 1;
		int [] a;
		a = new int [alength];
		int p = 0;//variable to play 
		@SuppressWarnings("unused")
		int g = 0; //variable to play again
		int z = 0; //counter of replays 
		
		for(;z<3;){
//		do{
		do{
		System.out.println("Wanna Roll Dice against me??????");
		String answe = scan.next();
		String answer = answe.toUpperCase();
		
			switch (answer){
			case "YES":{dicegame( a );break;}
			case "NO":{System.out.println("No Game, then...");break;}
			default:{p = 1; System.out.println("I don't understand what you said. \n please answer yes or no");
					try{Thread.sleep(1500);}
					catch(Exception e){};}//end default
			}//end switch
			}//end do
			while(p == 1);

		System.out.println("Want to play again?");
		String agai = scan.next();
		String again = agai.toUpperCase();
//		if(z>2){g=0;z=5;System.out.println("You have already played this game enough times.");}//end for
		if(again.equals("YES")){g=1;z++;}//end for
//		}//end do
//		while(g==1 || z<3);
		}//for loop
		System.out.println("Sorry, You have already played this game 3 times.");

//scan.close();
		}//end string void main

	private static void dicegame (int [] b){
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		
		SecureRandom myGenerator = new SecureRandom();
		
		System.out.println("How many dice do you want to roll?");
		double dies = scan.nextDouble();
		int die = (int)dies;
		if(die > 100){die = 100; System.out.println("Player can only roll 100 dice.");}
		
		//Player array block
		final int alength = die;
		int [] a;
		a = new int [alength];
		
		//CPU array block
		int CPUDie = myGenerator.nextInt(100);
		final int clength = CPUDie;
		int [] c;
		c = new int [clength];
		
		System.out.println("CPU will roll " + CPUDie + " dice");

		try{Thread.sleep(1500);}
		catch(Exception e){};

		System.out.println("Player rolls: ");
		//This fills the array created with values for dice rolls
		for (int i = 0; i < a.length; i++)
		{a[i] = 1 + myGenerator.nextInt(6);
		System.out.print(a[i]+",");
		}//end for
		
		try{Thread.sleep(1500);}
		catch(Exception e){};

		System.out.println(" \nCPU rolls: ");
		//fills array created with values for CPU dice rolls
		for(int i = 0; i < c.length; i++)
		{c[i] = 1 + myGenerator.nextInt(6);
		System.out.print(c[i]+",");}//end for

		try{Thread.sleep(1000);}
		catch(Exception e){};

		System.out.println("\nPlayer Average: ");
		int sum = 0;
		int sum1 = 0;
		double playeraverage;
		double cpuaverage;
		for(int i = 0; i < a.length; i++)
		{sum = sum + a[i];}//end for
		playeraverage = (double)sum / (double)a.length;
		System.out.print(playeraverage);

		try{Thread.sleep(500);}
		catch(Exception e){};

		System.out.println("\nCPU Average: ");
		for(int i = 0; i < c.length; i++)
		{sum1 = sum1 + c[i];}//end for
		cpuaverage = (double)sum1 / (double)c.length;
		System.out.print(cpuaverage+ "\n");

		try{Thread.sleep(1000);}
		catch(Exception e){};

		if(playeraverage == cpuaverage){System.out.println("We tie");}//end if
		if(playeraverage > cpuaverage){System.out.println("Player Wins");}//end if
		if(playeraverage < cpuaverage){System.out.println("Player Loses");}//end if
		
		try{Thread.sleep(500);}
		catch(Exception e){};
		
		System.out.println("Good Game. *high five*");
//scan.close();
return;}//end void dicegame
}//end public class
