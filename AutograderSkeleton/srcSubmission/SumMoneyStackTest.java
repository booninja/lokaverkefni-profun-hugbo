	import org.junit.Before;
	import org.junit.Test;
	import java.util.*;
	import static org.junit.Assert.*;

		
	//import edu.und.cs.findbugs.annotations.SuppressFBWarnings;

	public class SumMoneyStackTest {
		private Money m11;
		private Money m23;
		private MoneyStack myStack;
		
		
		@Before
		public void setUp() throws Exception{
			myStack = new MoneyStack();
			m11 = new Money(11);
			m23 = new Money(23);
		}
				
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