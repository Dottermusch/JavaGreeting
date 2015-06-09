import java.util.Calendar;


public class JavaGreeting
{
	
	/*
	 *  JavaGreeting takes in a Calendar object and based on the current hour
	 *  of the day, returns the appropriate greeting.
	 *  
	 *  Rick Dottermusch
	 *  May 29, 2015
	 *  
	 */
	
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		String name = "Rick";
		
		if (hour >= 5 && hour < 12)
		{
			System.out.println("Good morning, " + name);
		}
		else if (hour >= 12 && hour < 17)
		{
			System.out.println("Good afternoon, " + name);
		}
		else if (hour >= 17 && hour < 21)
		{
			System.out.println("Good evening, " + name);
		}
		else if (hour >= 21 && hour <= 23)
		{
			System.out.println("Good night, " + name);
		}
	}

}
