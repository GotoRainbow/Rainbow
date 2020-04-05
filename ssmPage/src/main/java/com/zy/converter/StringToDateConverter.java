package com.zy.converter;

import java.text.ParseException;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

import com.ibm.icu.text.SimpleDateFormat;

public class StringToDateConverter implements Converter<String, Date>{

	/**
	 * 从页面上接受到的是一个String  返回值是一个Date
	 */
	@Override
	public Date convert(String source) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		try {
			date = format.parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

}
