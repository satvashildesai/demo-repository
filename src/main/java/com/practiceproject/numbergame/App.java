package com.practiceproject.numbergame;

//git branch -M main
//git push -u origin main

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class App 
{
    public static void main( String[] args )
    {
    	BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
    	
    	try {
        	System.out.println("** Welcome to NumberGame **\n");
        	System.out.println("Instructions:\n User can enter any number between (1 to 10).");
        	System.out.println(" If user enter right number then they will win the game else they will lose.");
        	System.out.println("\n---------------------------------------------------------------------------\n");
        	
        	boolean isTerminate = false;
        	
        	do {
        		System.out.print("\nPress:\n 1)To play\n 2)To exit\n ==> ");
        		String ch = bReader.readLine();
        		
        		switch (ch) {
				case "1":

		        	Random random = new Random();
		        	int randomNum = random.nextInt(10)+1;
		        	
		        	while(true) {

		        		System.out.print("\nEnter any Number ==> ");
		            	int userNum = Integer.parseInt(bReader.readLine());
		            	
		        		if(randomNum > userNum) { System.out.println("Number is too small!"); }
		        		else if(randomNum < userNum) { System.out.println("Number is too big!"); }
		        		else { 
		        			System.out.println("\nYOU WIN THE GAME!!!"); 
		        			break;
		        		}
		        	}
		        	
					break;
				case "2":
					isTerminate = true;
					System.out.println("\nThank you!");
					break;

				default:
					System.out.println("Wrong input!");
					break;
				}
				
			} while (!isTerminate);
        	
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    }
}






