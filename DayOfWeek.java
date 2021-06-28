package com.bridgelabz.JUnit;

import com.bridgelabz.utility.Utility;

public class DayOfWeek {
    Utility utility = new Utility();
    int day = Integer.parseInt(args[0]);
    int month = Integer.parseInt(args[1]);
    int year = Integer.parseInt(args[2]);

    int res = utility.dayOfWeek(day, month, year);
	System.out.println("day of week::" + res);

}
