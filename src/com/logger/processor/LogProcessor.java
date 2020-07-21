package com.logger.processor;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class LogProcessor {

	private static Scanner scanner;

	public static void main(String[] args) throws FileNotFoundException, ParseException {

		File file = new File("/Users/akashyellappa/Downloads/application.log");

		scanner = new Scanner(file);

		while (scanner.hasNext()) {

			String[] splits = scanner.nextLine().split(" ", 4);
			String dateTime = splits[0] + " " + splits[1];
			String className = splits[2];
			String message = splits[3].replaceFirst("- ", "");

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

			// use SimpleDateFormat to define how to PARSE the INPUT
			Date date = sdf.parse(dateTime);
			// long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
			long diff = TimeUnit.SECONDS.convert(date.getTime(), TimeUnit.MILLISECONDS);

			System.out.println(diff + " " + date.getTime() + " " + dateTime + " " + className + " " + message);
		}
	}

}
