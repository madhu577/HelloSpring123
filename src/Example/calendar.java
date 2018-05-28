package Example;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal=Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy");
		System.out.println(sd.format(cal.getTime()));
		System.out.println(sd.format(cal.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.AM_PM));
		
	}

}
