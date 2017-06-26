/*Create another class StudentResultProcesing and extend this class from the student class 
and it will print the result of a student. */  
package asst3_4;

import java.util.Scanner;
class  StudentResultProcesing extends Student       //StudentResultProcesing is a child class of Student.
{
     public void printingResult(int physicsMarks,int chemistryMarks,int mathsMarks)   
	{
    	 
		//This class is inherited from the Student class, so we can use the public and protected members and methods of Student.
		System.out.println();          
		System.out.println("Name of the student : " + getNameOfStudent());      
		System.out.println("Roll Number is : " + getRollNumber());
		System.out.println("Studying in Class : " + getClassNumber());
		System.out.println("Result of the Student : " + resultOfStudent(physicsMarks,chemistryMarks,mathsMarks,getRollNumber()));
		
		//Getting the result of student from the method of parent class and printing.
		System.out.println();   
	}
	
	public static void main(String[] args)    //main function declaration. and because it is static, program execution starts from main function.
	{
		//Now we want to take input of the details of students from the user.
      	// For taking input from the user, we have to make the object of Scanner class.
    		Scanner sc=new Scanner(System.in);      
    		
		StudentResultProcesing[] detailsStudent=new StudentResultProcesing[2];   
	    //Above line is creating array of references of class StudentResultProcessing.
		
		for(int i=0;i<2;i++)              
			detailsStudent[i]=new StudentResultProcesing();
				
		for(int i=0;i<2;i++)     //for loop to take details of the students and printing their result.
		{
			System.out.println("Please Enter your Name, Phone number, Roll Number & Class : ");   
			detailsStudent[i].setNameOfStudent(sc.next());          //Setting the name.
			detailsStudent[i].setPhoneNumber(sc.nextLong());        //Setting the phone number
			detailsStudent[i].setRollNumber(sc.nextInt());          //Setting roll number.
			detailsStudent[i].setClassNumber(sc.nextInt());         //setting class number
			System.out.println("Enter the marks of Physics,Chemistry & Maths out of 100 : ");  
			
			//Calling the function printingResult to print the result of student.
			detailsStudent[i].printingResult(sc.nextInt(), sc.nextInt(), sc.nextInt());         
		}
		
		sc.close();      
	}  
}     