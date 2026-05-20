package com.focus.Pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice 
{


	static String actRowList = "[one,one,three,four]";
	static String expRowList = "[one,three,one,four]";
	
	 static List<String> List1 = new ArrayList<String>(Arrays.asList(actRowList.replace("[", "").replace("]", "").replace(" ", "").split(",")));
     static List<String> List2 = new ArrayList<String>(Arrays.asList(expRowList.replace("[", "").replace("]", "").replace(" ", "").split(",")));
    
     
    
    
    public static void main(String args[])
    {
    	 System.out.println("actList:"+List1); 
    	    System.out.println("expList:"+List2);
    	    
    	    Collections.sort(List1);
    	    Collections.sort(List2);
    	    
    	    
    	    
    	   /* boolean result = List1.size() == List2.size()&& List1.equals(List2) && List2.containsAll(List1);
    	    System.out.println("Two Lists result:"+result);*/
    	    
    	    String val = Boolean.toString(Integer.toString(List1.size()).equals(Integer.toString(List2.size())) && List1.equals(List2));
    	    System.out.println("Two Lists result:"+val);
    	    //return val;
    	    
    	    
    	    
    	   /* boolean result = List1.size() == List2.size()&& List1.equals(List2) && List2.containsAll(List1);
    	    System.out.println("Two Lists result:"+result);*/
    		
    }
	
	
}
