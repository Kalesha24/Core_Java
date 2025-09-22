package com.java;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.swing.text.DateFormatter;

/*
 * Java-7:-
 * --------
 * 1. package ambiguity
 * 2. we can arrange certain format
 * 3. Date class is not Threadsafe
 * 4. Time zone
 * 5. Mutable
 * 6. Not thread-safe 
 * 7. operations are Limited
 * 8. package is java.util.Date
 * 
 * */
public class DateTimeDemo {

	public static void main(String[] args) {

		// Abiguity in package selection
		Date d = new Date();
		System.out.println(d);
		System.out.println();
//		SimpleDateFormat 

		/*
		 * Java-8:-
		 * ------
		 * 1. It is Immutable 
		 * 2. Thread-safe 
		 * 3. There are many operations 
		 * 4. package is java.time
		 * 
		 */

		LocalDate ld = LocalDate.now();
		System.out.println(ld);

		LocalTime lt = LocalTime.now();
		System.out.println(lt);

		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		System.out.println();

		// Specific local date
		LocalDate sld = LocalDate.of(1985, 12, 24);
		System.out.println(sld);

		LocalDate sld1 = LocalDate.of(2004, Month.JANUARY, 28);
		System.out.println(sld1);

		System.out.println();
		// to check the given date 2004-05-28 is correct or not
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(sld1.format(dtf));
		System.out.println("********************************************************");

		LocalDate ld2 = LocalDate.of(1984, 5, 11);
		System.out.println(ld2);

		LocalDate ld3 = LocalDate.of(1984, Month.MAY, 11);
		System.out.println(ld3);

		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/yyyy/MMM");
		String strDate = ld3.format(dtf1);
		System.out.println(ld3.format(dtf1));

		LocalDate parsedDate = LocalDate.parse(strDate, dtf1);
		System.out.println(parsedDate);
		System.out.println("********************************************************");

		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);

		ZonedDateTime centralEstern = LocalDateTime.now().atZone(ZoneId.of("CET"));
		System.out.println(centralEstern);
		System.out.println("========================================================");

		for (String zones : ZoneId.getAvailableZoneIds()) {
			System.out.println(zones);
		}

	}
}
