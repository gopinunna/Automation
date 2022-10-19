package June14th;

public class Student  {
	
	
	int rollNo;
	String sNa;
	
	public void setDatails(int rollNo,String sNa)
	{
		this.rollNo=rollNo;
		this.sNa=sNa;
	}
	
	public void getDetails()
	{
		System.out.println("roll No is "+rollNo+ "\nstudent Name is"+sNa);
	}

}
