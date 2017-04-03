package chapter04;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class CalendarTest {
	public static void main(String[] args) {
		Locale.setDefault(Locale.CHINA);
		printWeekdayNames();
		printDays();
	}

	private static void printDays() {
		// TODO Auto-generated method stub
		Calendar d = new GregorianCalendar();
		
		int month = d.get(Calendar.MONTH);
		int today = d.get(Calendar.DAY_OF_MONTH);
		
		d.set(Calendar.DAY_OF_MONTH, 1);
		
		int firstDayOfWeek = d.getFirstDayOfWeek();
		int week = d.get(Calendar.DAY_OF_WEEK);
		
		int count = 0;
		while (week != firstDayOfWeek) {
			count++;
			d.add(Calendar.DAY_OF_MONTH, -1);
			week = d.get(Calendar.DAY_OF_WEEK);
		}
		d.set(Calendar.MONTH, month);
		
		for(int i = 0; i < count; i++) {
			System.out.print("    ");
		}
		
		d.set(Calendar.DAY_OF_MONTH, 1);
		
		do {
			int day = d.get(Calendar.DAY_OF_MONTH);
			System.out.printf("%3d", day);
			
			if (today == d.get(Calendar.DAY_OF_MONTH))
				System.out.print("*");
			else
				System.out.print(" ");
			
			d.add(Calendar.DAY_OF_MONTH, 1);
			
			if (d.get(Calendar.DAY_OF_WEEK) == firstDayOfWeek)
				System.out.println();
			
		} while (month == d.get(Calendar.MONTH));
	}

	private static void printWeekdayNames() {
		// TODO Auto-generated method stub
		String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
		for (String weekdayName : weekdayNames) {
			System.out.printf("%4s", weekdayName);
			
		}
		System.out.println();
	}
}
