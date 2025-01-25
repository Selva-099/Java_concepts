package workouts;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FindDayOfTheDate {

	public static void main(String[] args) {

		String finalDay = "";
		String inputDate = "32/02/2024";
		try {

			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date dte = sdf.parse(inputDate);
			DateFormat dataFormat = new SimpleDateFormat("EEEE");
			finalDay = dataFormat.format(dte);
			
			Calendar c = Calendar.getInstance();
			c.setTime(dte);
			int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
			
			
			System.out.println(dayOfWeek);
			System.out.println(finalDay);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
