import org.junit.Test;

import static org.junit.Assert.*;

public class MoneyTest {
	@Test
	public void testAdd() {
		Money m12 = new Money(12);
		Money m14 = new Money(14);
		//Money mless = new Money(-15);
		Money expected = new Money(26);
		assertEquals(expected, m12.add(m14));
		//assertEquals(, m14.add(mless));
	}

	@Test
	public void testEquals() {
		Money m12 = new Money(12);
		Money m14 = new Money(14);
		Money equalMoney = new Money(12);
		assertTrue(m12.equals(m12));
		assertTrue(m12.equals(equalMoney));
		assertFalse(m12.equals(m14));
		//test money object to not money object
		//not string at all
	}
	
	@Test
	public void testEqualsString() {
		Money m12 = new Money(12);
		String s = "hello";

		assertFalse(m12.equals(s));

	}
    @Test
    public void testToString() {
        Money a = new Money(2);

        assertEquals("2", a.toString());
    }
}