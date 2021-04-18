import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.AfterClass;

@RunWith(Suite.class)
@SuiteClasses({ SumMoneyStackTest.class, MoneyStackTest.class })

public class AllTests {
	/**
	 * Executed after all tests of the test suite have been executed. Student
	 * submission would use a "normal" AllTest.java that would then be replaced by a
	 * version that adds the afterClass() method.
	 */
	@AfterClass
	public static void afterClass() {
		ResultStorageSingleton resultStorage = ResultStorageSingleton.getInstance();
		System.out.println("Tested pop on an empty stack : " + resultStorage.getArrayOutOfBoundsExeptionThrownInPop() + " times");
		System.out.println("Tested push on an full stack : " + resultStorage.getArrayOutOfBoundsExeptionThrownInPush() + " times");
		System.out.println("Tested pop and push equal number of times : " + resultStorage.getPushPopWasTested());
		System.out.println("Tested whether full stack on non full stack : " + resultStorage.countIsFullCalledNotFull() + " times");
		System.out.println("Tested whether full stack on full stack : " + resultStorage.getIsFullCalled(9));
		System.out.println("Tested whether empty stack was checked when empty : " + resultStorage.getIsEmptyCalledTrue());
		System.out.println("Tested whether empty stack was checked when not empty : " + resultStorage.getIsEmptyCalledFalse());
		System.out.println("Tested whether capacity was checked : " + resultStorage.getIsCapacityCalled());
		System.out.println("Tested if current size was checked on an empty stack : " + resultStorage.getCurrentSizeCalled(0));
		System.out.println("Tested how often current size was checked on a non empty stack : " + resultStorage.countIsCurrentSizeCalledBiggerThanZero()+ " times");
		System.out.println("Tested sum : " + resultStorage.countIsSumCalled() + " times");

	}
}