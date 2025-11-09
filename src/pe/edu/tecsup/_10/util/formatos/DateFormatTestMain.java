package pe.edu.tecsup._10.util.formatos;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateFormatTestMain {

	public static void main(String[] args) {
		
		// Independencia: 28/07/2020 08:30:00
		Calendar calendar = new GregorianCalendar(2020, Calendar.JULY, 28, 8, 30, 0);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss", new Locale("es", "PE"));
		
		System.out.println( sdf.format(calendar.getTime()) );
		
		int month = calendar.get(Calendar.MONTH);
		System.out.println("month: " + (month+1));
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("week: " + week);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		System.out.println("hour: " + hour);
		
		Calendar calendarToday = Calendar.getInstance();
		
		calendar.add(Calendar.YEAR, 2);	// 2 anhos mas: 28/07/2022 08:30:00
		
		calendar.set(Calendar.DAY_OF_MONTH, 18); // 18/07/2022 08:30:00
		
		if(calendarToday.after(calendar)) {
			System.out.println("Si es una fecha mas reciente");
		} else {
			System.out.println("No es una fecha mas reciente");
		}
		
		System.out.println( calendar.getTimeInMillis() );
		System.out.println( calendarToday.getTimeInMillis() );
		
		if( /*calendar.get(Calendar.YEAR) == calendarToday.get(Calendar.YEAR) 
				&& */calendar.get(Calendar.MONTH) == calendarToday.get(Calendar.MONTH)
				&& calendar.get(Calendar.DAY_OF_MONTH) == calendarToday.get(Calendar.DAY_OF_MONTH)) {
			
		}
		
	}

}
