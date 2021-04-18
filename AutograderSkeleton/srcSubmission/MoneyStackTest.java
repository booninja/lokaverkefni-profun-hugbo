
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MoneyStackTest {
	private Money m11;
	private Money m23;
	private MoneyStack myStack;
	private ResultStorageSingleton resultStorage;
	
	
	@Before
	public void setUp() throws Exception{
		myStack = new MoneyStack();
		m11 = new Money(11);
		m23 = new Money(23);
	}
	
	@Test
	public void testPopPush() {
		myStack.push(m11);
		assertSame(myStack.pop(), m11);
		myStack.push(m23);
		assertSame(myStack.pop(), m23);
	}

	@Test
	public void testIsFull() {
		for (int i = 0; i < myStack.getCapacity(); i++) {
			assertFalse(myStack.isFull());
			myStack.push(m11);
		}
		assertTrue(myStack.isFull());
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testOverFull() {
		for(int i=0; i<myStack.getCapacity()+1; i++) {
			myStack.push(m11);
		}
	}
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testPopOnEmptyStack() {
		myStack.pop();
	}
	
	@Test
	public void testIsEmpty() {
		assertTrue(myStack.isEmpty());
		myStack.push(m11);
		assertFalse(myStack.isEmpty());
		myStack.pop();
		assertTrue(myStack.isEmpty());
	}
	@Test
	public void testGetCapacity() {
		assertEquals(myStack.getCapacity(), 10);
	}
	@Test
	public void testGetCurrentSize() {
		assertEquals(myStack.getCurrentSize(), 0);
		myStack.push(m11);
		assertEquals(myStack.getCurrentSize(), 1);
	}
	@Test(expected = AssertionError.class)
	public void testGetCurrentSizeNot() {
		myStack.push(m11);
		assertEquals(myStack.getCurrentSize(), 2);
	}
}
