package com.decred.memories.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatUtil {
	
	public static final SimpleDateFormat HYPHEN_YYYY_MM_DD_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

	public static final Date getDateFromString(SimpleDateFormat sdf, String strDate) {
	    Date date = null;
		
	    try {
			date = sdf.parse(strDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}
}
