/*Create a class Student which has some private data like name, phone number, roll 
number, class, use getter and setters to access this private data.  */

package asst3_4;

class Student      //Declaring class for student details.
{
	
	private String nameOfStudent;    //String variable to store the name of the student.
	private long phoneNumber;        //long variable to store the phone number of student.
	private int rollNumber;          //int variable to store roll number of student.
	private int classNumber;         //int variable to store the class number of student.
	
	//Above variables are private so, cannot be accessed out of the class. Not by the child also.
	
	public String getNameOfStudent()      //getter for name of student.
	{
		return nameOfStudent;
	}
	
	public void setNameOfStudent(String nameOfStudent)    //setter for name of student. 
	{
		this.nameOfStudent = nameOfStudent;
	}
	
	public long getPhoneNumber()      //getter for phone number.
	{
		return phoneNumber;
	}
	
	public void setPhoneNumber(long phoneNumber)      //setter for phone number.
	{
		this.phoneNumber = phoneNumber;
	}
	
	public int getRollNumber()       //getter for roll number.
	{
		return rollNumber;
	}
	
	public void setRollNumber(int rollNumber)       //setter for roll number.
	{
		this.rollNumber = rollNumber;
	}
	
	public int getClassNumber()          //getter for class number 
	{
		return classNumber;
	}
	
	public void setClassNumber(int classNumber)      //setter for class number. 
	{
		this.classNumber = classNumber;
	}
	
	public String resultOfStudent(int phycicsMarks,int chemistryMarks,int mathsMarks,int rollNumber)
	{
		//In each subject student has to score a minimum of 35 marks. 
		//If student scores less than 35 in any of the subject then he is failed otherwise passed.
		
		if(phycicsMarks<35 || chemistryMarks<35 || mathsMarks<35)  
			return "Failed";
		    return "Passed";                
	}
	
}     

