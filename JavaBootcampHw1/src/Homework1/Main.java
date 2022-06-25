package Homework1;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	
	public static String checkWord = new String("<<code>>");
	
	
	public static String isContain(String [] words) {
		//needed variables
		boolean flag = false;
		int count=0;
		
		// loop to check all the words 
		for (int i = 0; i < words.length; i++)
		{
			if (words[i].contains(checkWord))
			{
				flag=true;
				count++;
			}
			 
	    }
		
		// return value
		if(flag)
		{
			return "There are "+ count +" "+ checkWord +" in the array";
		}
		else
		{
			return "There no "  + checkWord +" in the array";
		}	
	}
	

	
	
	
	public static void main(String[] args) {
		//needed variables
		int select;
		String [] userWord= new String[5];
		Scanner scn = new Scanner(System.in);
		boolean checkSelect=true;
		
		// menu for user
		System.out.println("*************Please select an option*************");
		System.out.println("*   1 - Use predefined array.                   *");
		System.out.println("*   2 - I want to enter words in the array      *");
		System.out.println("*************************************************");
		System.out.print("Your select : ");
		System.out.println();
		select = scn.nextInt();
		
		// chechk user option
	    while(checkSelect)
	    {
	    	if(select==1 || select==2)
	    	{
	    		checkSelect=false;
	    	}
	    	
	    	if(checkSelect==true)
	    	{
	    		System.out.println("Please enter option number only 1 or 2");
		    	System.out.print("Your select : ");
				System.out.println();
		    	select = scn.nextInt();
	    	}
	    	
	    	
	    	
	    }
		
	    // answer of first question
	    if(select==1)
	    {
	    	// define an array
			String [] words = {"Patika.Dev","<<code>>JavaEvamBootCamp","FirstHomeWork","First<<code>>","MyHomeWork<<code>>"};
			
			//check is array empty or no.
			if(words.length==0)
			{
				System.out.println("There must be 5 strings in the array");
			}else
			{
				// send user input to method
				String resultSelect1 = isContain(words);
				//print result to screen
				System.out.println("Result : "+ resultSelect1);
				
			}
	    }
	    // answer of second question
	    else
	    {
	    
	    	
	    	// loop to take 5 input from user.
	    	for (int i = 0; i < userWord.length; i++) {
				
	    		   System.out.print("Enter "+(i+1)+". word : ");
	    		   String wordFromUser = scn.next();
	    	       System.out.println();
	    	       
	    	       if(wordFromUser.length()==0)
	    	       {
	    	    	   System.out.println("input must be a word");
	    	    	   i--;
	    	       }
	    	       else
	    	       {
	    	    	   userWord[i]=wordFromUser;
	    	       }
			}
	    	
	    	
	    	// send user input to method
	    	String resultSelect2= isContain(userWord);
	    	//print result to screen
	    	System.out.println("Result : "+ resultSelect2);
	    	
	    }//end of select2
	    
	}// end of main m.

}//end of class

/*
 
Aþaðýdaki kod satýrlarýna göre kaç tane obje yaratýlacaktýr ?

String s1="Welcome";
String s2="Welcome";
String s3="Welcome";


Java String Pool: Java String havuzu, yýðýn bellekte depolanan Stringler koleksiyonunu ifade eder. 
Bunda, yeni bir nesne oluþturulduðunda, String havuzu önce nesnenin havuzda olup olmadýðýný kontrol eder. 
Varsa, deðiþkene ayný referans döndürülür, aksi takdirde String havuzunda yeni nesne oluþturulur ve ilgili referans döndürülür.
Bu yüzden s1, s2 ve s3 stringlerinde ayný deðer olduðu için tek bir obje yaratýlacaktýr. 

*/