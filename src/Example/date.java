package Example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
	
		System.out.println(sdf.format(d));
		System.out.println(d.toString());
		
		
	}

}
