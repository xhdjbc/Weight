import java.util.Scanner;

/**
 * 
 */

/**
 * @author z.liu
 *
 */
public class weight {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
        *

        * Name: Zichao Liu

        * Teacher: Mr.Hardman
 
        * Assignment 4, Program 1

        * Date Last Modified: 11/16/2016
        *
        */
		
		Scanner userInput = new Scanner(System.in);
		
		int userweight;
		String Planet;
		
		System.out.print("Hi, user! Please tell us your weight:\n");
		userweight = userInput.nextInt();
		
		System.out.println("Which planet do you want to travel?");
		Planet = userInput.next();
		
		
		String Str1 = "Mercury";
	    
		String Str2 = "Venus";
		
	    String Str3 = "Earth";
	    
		String Str4 = "Moon";
		
		String Str5 = "Mars";
		
		String Str6 = "Jupiter";
		
		String Str7 = "Saturn";
		
		String Str8 = "Uranus";
		
		String Str9 = "Neptune";
		
		String Str10 = "Pluto";
		
	    if(Str1.equalsIgnoreCase("Mercury")){
	    System.out.println("Your weight on Mercury is:" + userweight*0.38);}
	    
	    else if(Str2.equalsIgnoreCase("Venus")){
		    System.out.println("Your weight on Venus is:" + userweight*0.91);}
	    else if(Str3.equalsIgnoreCase("Earth")){
		    System.out.println("Your weight on Earth is:" + userweight);}
	    else if(Str4.equalsIgnoreCase("Moon")){
		    System.out.println("Your weight on Moon is:" + userweight*0.165);}
	    else if(Str5.equalsIgnoreCase("Mars")){
		    System.out.println("Your weight on Mars is:" + userweight*0.38);}
	    else if(Str6.equalsIgnoreCase("Jupiter")){
		    System.out.println("Your weight on Jupiter is:" + userweight*2.34);}
	    else if(Str7.equalsIgnoreCase("Saturn")){
		    System.out.println("Your weight on Saturn is:" + userweight*1.06);}
	    else if(Str8.equalsIgnoreCase("Uranus")){
		    System.out.println("Your weight on Uranus is:" + userweight*0.92);}
	    else if(Str9.equalsIgnoreCase("Neptune")){
		    System.out.println("Your weight on Neptune is:" + userweight*1.19);}
	    else if(Str10.equalsIgnoreCase("Pluto")){
		    System.out.println("Your weight on Pluto is:" + userweight*0.06);}
	    
	    userInput.close();
			      
			     
	}

}
