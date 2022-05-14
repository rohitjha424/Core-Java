package com.April22Orchard;

import java.util.*;


public class CostumException {

		// method to check the age  
	    static void validate (int age) throws InvalidAgeException{    
	       if(age > 30){  
	  
	         
	        throw new InvalidAgeException("Student has more age");    
	    }  
	        
	     }    
	  
	    // main method  
	    public static void main(String args[])  
	    {  
	        try  
	        {  
	        	ArrayList<Integer> list = new ArrayList<Integer>();  
	    		
	    		Scanner sc = new Scanner(System.in);
	    		System.out.println("Enter the ages of the Students: ");
	    		
	    		for(int i =0; i<5;i++) {
	    			
	    			int element = sc.nextInt(); 
	    			
	    		    
	    			validate(element); 
	    			
	    			list.add(element);   // Elements are getting added to Array List
	    			
	    			
	    			
	    		}  
	    		
	    		System.out.println("Ages are successfully added to students data");
	            
	            
	        }  
	        catch (InvalidAgeException ex)  
	        {  
	            System.out.println("Caught the exception");  
	    
	            
	            System.out.println("Exception occured: " + ex);  
	        }  
	  
	        

	}

}
