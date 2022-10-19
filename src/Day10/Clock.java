package Day10;

public class Clock {
	int hr,min,sec;
	public void setclock()
	{
		hr=10;
		min=10;
		sec=10;
		
	}
	public void setClock(int hr)
	{
		this.hr=hr;
	}
	
	public void setClock(int hr,int min)
	{
		this.hr=hr;
		this.min=min;
	}
	
	public void setClock(int hr,int min,int sec)
	{
		this.hr=hr;
		this.min=min;
		this.sec=sec;
	}
	public void displayclock()
	{
		System.out.println("Time is "+hr+":"+min+":"+sec+":");
	}
	
	//public void displayclock()
	//{
		//System.out.format("Time is %02d:%02d:%02d:",hr,min,sec);
	//}

}
