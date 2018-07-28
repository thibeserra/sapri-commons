package br.com.sapri.commons;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	public static String dateToString(final String pattern, final Date date) {

		return new SimpleDateFormat(pattern).format(date);
	}

}
