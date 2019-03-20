package com.OBI;
import static java.util.Calendar.YEAR;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ScannerDate {
	public static void main(String[] args) throws ParseException {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Podaj dat� w formacie dd.mm.yyyy");
	    String userDate = scan.nextLine();
	    scan.close();
	    	    
	    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
	    
	    Date date = dateFormat.parse(userDate);
	    System.out.println("Poda�e�: " + date);
	    
	    Calendar calendar = Calendar.getInstance();
	    calendar.setTime(date);
	    calendar.add(YEAR, 1);
	    date = calendar.getTime();
	    SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
	    System.out.println("za rok b�dzie: " + dayFormat.format(date) + "   "+ date);
	}
}
