package course;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date d = Date.from(Instant.parse("2021-11-16T15:42:07Z"));

		System.out.println("Date: " + sdf.format(d));

		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
		cal.add(Calendar.HOUR_OF_DAY, 2);
		d = cal.getTime();
		
		System.out.println("4 hours more: " + sdf.format(d));
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);

	}

}