package reviewproj;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReviewCalsTest {

	@Test
	public void testAdd() {
		Calcreview r = new Calcreview();
		r.add(10, 20);
		assertEquals(30, r.getResult());
		
		//fail("Not yet implemented");
	}

}
