package wdsr.exercise1.conversions;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
public class ArrayConverterTest {
	private ArrayConverter converter;
	
	@Before
	public void setup(){
		converter = new ArrayConverter();
	}
	@Test(expected=NumberFormatException.class)
	public void arrayConventer_shouldConvertStringsToInts(){
		//given
		String strings[] = {"qwe", "ewq" , "wqe"};
		//then
		converter.convertToInts(strings);
	}
	@Test(expected=NullPointerException.class)
	public void arrayConventer_nullExceptionTest(){
		//given
		String strings[] = null;
		//when
		converter.convertToInts(strings);
	}
	@Test(expected=NumberFormatException.class)
	public void arrayConventer_NumberFormatTest(){
		//given
		String strings[] = {"qwe" , "ewq" , "1" } ;
		//then
		converter.convertToInts(strings);
	}
	
}

