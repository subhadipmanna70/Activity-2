package com.accenture.mavennewproject;
import java.util.HashSet;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App
{
	
	
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	HashSet <String> team=new HashSet<>();
        while(true) {
        System.out.println("Add player in the team: 1");
        System.out.println("Remove player from the team: 2");
        System.out.println("Find if player is in the team: 3");
        System.out.println("Display players on the team: 4");
    	System.out.println("Enter the choice:");

        int s=sc.nextInt();
        switch(s) {
        case 1:
        	System.out.println("enter the player name");
        	String player_name=sc.next();
        	team.add(player_name);
        	System.out.println("Player added to the team");
        	break;
        case 2:
        	System.out.println("Enter the player name you want to Remove");

        	String name=sc.next();
        		if(team.contains(name)) {
        			team.remove(name);
        			System.out.println("Player is removed from the team");
        			break;
        		}
        		else {
        			System.out.println("Player "+name+" is not present in the team");

        		}

			break;
        	
        case 3:
        	System.out.println("Enter the player name you want to find");
        	String p_name=sc.next();
        	if(team.contains(p_name)) {
        			System.out.println("Player "+p_name+" is present in the team");
        			break;
        		}
        	else {
			System.out.println("Player "+p_name+" is not present in the team");
        	}
			break;
        case 4:
        	System.out.println("player present on the team");
        	System.out.println(team);
           break;
        }
        }
        
        
        
    }
}
