package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2023-04-20");
		LocalDateTime d05 = LocalDateTime.parse("2023-04-20T01:30:20");
		Instant d06 = Instant.parse("2023-04-20T01:30:20Z");
		Instant d07 = Instant.parse("2023-04-20T01:30:20-03:00");
		
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		
		LocalDate d10 = LocalDate.of(2022, 7, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
		
		System.out.println(d01.toString());
		System.out.println(d02.toString());
		System.out.println(d03.toString());
		System.out.println(d04.toString());
		System.out.println(d05.toString());
		System.out.println(d06.toString());
		System.out.println(d07.toString());
		System.out.println(d08.toString());
		System.out.println(d09.toString());
		System.out.println(d10.toString());
		System.out.println(d11.toString());

		


	}

}
