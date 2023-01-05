public class midTerm	{
	public static void main(String[] args)	{
		//empty main method
	}
}

class Date	{
	int year;
	short month;
	int day;

	Date()	{
		//empty constructor
	}

	Date(int day, int year)	{
		//constructor with parameters
		this.day = day;
		this.year = year;
		this.month = 0;
	}
	Date(int day, short month, int year)	{
		//constructor with parameters
		this.day = day;
		this.year = year;
		this.month = month;
	}
	Date(int year, int day, short month)	{
		//constructor with parameters
		this.day = day;
		this.year = year;
		this.month = month;
	}

	void CompareDate(Date date1,Date date2)	{
		if (date1.year == date2.year && date1.month == date2.month && date1.day == date2.day)	{
			System.out.println("The dates are equal");
		}
		else	{
			System.out.println("The dates are not equal");
		}
	}
}
