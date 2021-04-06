	import org.junit.Before;
	import org.junit.Test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
	import org.mockito.ArgumentCaptor;
	import java.util.*;
	import static org.junit.Assert.*;

		
	//import edu.und.cs.findbugs.annotations.SuppressFBWarnings;

	public class SumMoneyStackTest {
		private Money m11;
		private Money m23;
		private MoneyStack myStack;
		private Money mock11;
		private Money mock23;
		
		
		@Before
		public void setUp() throws Exception{
			myStack = new MoneyStack();
		    mock11 = mock(Money.class);
		    mock23 = mock(Money.class);
			m11 = new Money(11);
			m23 = new Money(23);
		}
		
		@Test
		public void testMockSum() {
			assertEquals(myStack.sum(), 0);
			
			myStack.push(mock11);
			when(myStack.sum()).thenReturn(11);
			assertEquals(myStack.sum(), 11);
			verify(mock11).getAmount();
			
			myStack.push(mock23);
			when(myStack.sum()).thenReturn(34);
			assertEquals(myStack.sum(), 34);
			verify(mock11, times(2)).getAmount();
			
			myStack.pop();
			when(myStack.sum()).thenReturn(11);
			assertEquals(myStack.sum(), 11);
			verify(mock11, times(3)).getAmount();
			
		}
		
		/*@SuppressFBWarnings("RV_RETURN_VALUE_IGNORED_NO_SIDE_EFFECT")
		@Test
		public void testMoneySumMock() {
			int testLength = 5;
			for (int i = 0; i< testLength; i++) {
				myStack.push(mock11);
			}
			when(m11.getAmount()).thenReturn(1);
			assertEquals(testLength * 1, myStack.sum());
			verify(m11, times(testLength)).getAmount();
		}*/
		
		@Test
		public void testSum() {
			assertEquals(myStack.sum(), 0);
			myStack.push(m11);
			assertEquals(myStack.sum(), 11);
			myStack.push(m23);
			assertEquals(myStack.sum(), 34);
			myStack.pop();
			assertEquals(myStack.sum(), 11);
		}
	}