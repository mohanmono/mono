
class DateSet {
	int day,month,year;
	public DateSet(int day,int month,int year) {
		this.day=day;
		this.month=month;
		this .year=year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
public void displaydate() {
	System.out.println(day+"/"+month+"/"+year);		
}
}
public class Date
{
	public static void main(String args[]) {
		DateSet d=new DateSet( 6,8,2000);
		d.displaydate();
		
		
		
}
}
