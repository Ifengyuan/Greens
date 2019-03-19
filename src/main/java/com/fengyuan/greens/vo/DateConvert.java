package com.fengyuan.greens.vo;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConvert implements Converter<String ,Date> {

	@Override
	public Date convert(String text) {
		
		if(text == null || text.trim().isEmpty()){
			return null;
		}
		SimpleDateFormat[] sdfs = new SimpleDateFormat[]{
				
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"),
				new SimpleDateFormat("yyyy-MM-dd"),
				new SimpleDateFormat("yyyyMMdd"),
				new SimpleDateFormat("yyyy年MM月dd日")
		};
		
		for (SimpleDateFormat sdf : sdfs) {
			try {
				return sdf.parse(text);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				continue;
			}
		}
		return null;
	}


}
