package gr.upatras.lab_final;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyClassTest {
	    @Test
	    void testSubPositive() {
	        String result = App.sub(2.2, 3.2);
	        assertEquals("POSITIVE", result, "2.2 is less than 3.2, so the result should be 'POSITIVE'");
	    }

	    @Test
	    void testSubNegative() {
	        String result = App.sub(3.2, 2.2);
	        assertEquals("NEGATIVE", result, "3.2 is greater than 2.2, so the result should be 'NEGATIVE'");
	    }

	    @Test
	    void testSubEqual() {
	        String result = App.sub(2.2, 2.2);
	        assertEquals("NEGATIVE", result, "2.2 is equal to 2.2, so the result should be 'NEGATIVE'");
	    }
	}
