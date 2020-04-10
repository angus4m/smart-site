package com.cqxyd.smartsite.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 *
 * @Title:
 * @Description: 自定义日期转换器
 */
public class DateConverter implements Converter<String, Date> {
	private SimpleDateFormat simpleDateFormat = null;

	@Override
	public Date convert(String s) {
		if ("".equals(s) || s == null) {
			return null;
		}
		if (s.length() == 10) {
			simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		} else if (s.length() >= 10) {
			simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		}

		try {

			return simpleDateFormat.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
