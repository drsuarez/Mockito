package com.mockito.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class FirstMockitoTest {

	@Test
	public void test() throws ParseException {
		
		List<String> list = Arrays.asList("2021/01/13", "2021/14/01", "20210115");
		List<String> formatList = Arrays.asList("yyyy/MM/dd", "yyyy/dd/MM", "yyyyMMdd");
		List<String> finalList = new ArrayList<String>();
		SimpleDateFormat formatter = new SimpleDateFormat("YYYYMMDD");
		Date date = new Date();
		String newDate = "";
		
		Iterator<String> iter = list.iterator();
		Iterator<String> formatIter = formatList.iterator();
		
		while (iter.hasNext()) {
			
			while (formatIter.hasNext()) {
				date = new SimpleDateFormat(formatIter.next()).parse( iter.next());
				newDate = formatter.format(date);
				finalList.add(newDate);
			}
		}
		
		
		//System.out.println(Arrays.asList(finalList));
		assertEquals(Arrays.asList("[20210113", "20210114", "20210115]").toString(), Arrays.asList(finalList).toString());
	}

}
