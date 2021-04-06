import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.AfterClass;

@RunWith(Suite.class)
@SuiteClasses({  })

public class AllTests {
	/**
	 * Executed after all tests of the test suite have been executed. Student
	 * submission would use a "normal" AllTest.java that would then be replaced by a
	 * version that adds the afterClass() method.
	 */
	@AfterClass
	public static void afterClass() {
		EitthvertSingleton results = EitthvertSingleton.getInstance();
		System.out.println("Tested pop on an empty stack " + results.getPopStackIsEmpty() + " times");
		// TODO: @Helmut: Check that student test suite gives a green bar. (Could be done via, e.g., a TestListener)
	}
}