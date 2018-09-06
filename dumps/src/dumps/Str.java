package dumps;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Str {

	private static final DateTimeFormatter DateTimeFormatter = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "divya";
		String email = new String("divya@gmail.com");
		
		int len = email.length();
		System.out.println("length " + len);
		
		String ext = email.substring(4);
		System.out.println(ext);
		
		String phone = "8121414689";
		String details = name + phone;
		System.out.println(details);
		LocalDate dateNow=LocalDate.now();
		System.out.println(dateNow);
		Instant now=Instant.now();
		System.out.println(now);
		
		ZonedDateTime currentTime=ZonedDateTime.now();
		System.out.println(currentTime);
		ZonedDateTime Paris=ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println(Paris);
		
		LocalDate start=LocalDate.of(1947,Month.AUGUST,15);
		LocalDate end=LocalDate.now();
		Period period=Period.between(start, end);
		System.out.println("days "+period.getDays());
		System.out.println("months "+period.getMonths());
		System.out.println("years "+period.getYears());
		
		DateTimeFormatter formatter=
				DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		LocalDate now1=LocalDate.now();
		System.out.println("un " +now1);
		//String form=formatter.format(now1);
		
		DateTimeFormatter frm=DateTimeFormatter.ofPattern("dd/MM/YYYY");
		String Text="09/03/1997";
		LocalDate ddd=LocalDate.parse(Text,frm);
		System.out.println(ddd);
		
		
	}

}
