package JUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		jUnitFunction junit=new jUnitFunction();
		String result = junit.addStrings("capstone","project");
		assertEquals("capstoneproject",result);
	}

}
