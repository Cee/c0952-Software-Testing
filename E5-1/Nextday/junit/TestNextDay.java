import static org.junit.Assert.*;

import org.junit.Test;


public class TestNextDay {
	
	@Test
	public void test1(){
		Date d = new Date(1,2,1999);
		Date dd = Nextday.nextDay(d);
		assertEquals(dd.getDay().getDay(),3);
	}
	
	@Test
	public void test2(){
		Date d = new Date(2,28,1999);
		Date dd = Nextday.nextDay(d);
		assertEquals(dd.getDay().getDay(),1);
	}
	
	@Test
	public void test3(){
		Date d = new Date(2,28,2000);
		Date dd = Nextday.nextDay(d);
		assertEquals(dd.getDay().getDay(),29);
	}
	
	@Test
	public void test4(){
		Date d = new Date(2,28,2004);
		Date dd = Nextday.nextDay(d);
		assertEquals(dd.getDay().getDay(),29);
	}
	
	
}
