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
		ResultStorageSingleton resultStorage = ResultStorageSingleton.getInstance();
		System.out.println("Tested pop on an empty stack " + resultStorage.getArrayOutOfBoundsExeptionThrownInPop() + " times");
		System.out.println("Tested push on an empty stack " + resultStorage.getArrayOutOfBoundsExeptionThrownInPush() + " times");
		System.out.println("Tested pop " + resultStorage.popCounter() + " times");
		System.out.println("Tested push " + resultStorage.pushCounter() + " times";
		System.out.println("Test if getCurrectSize was checked " + checkisCurrentSizeCalled())
		System.out.println("Tested isFull on empty stack " + resultStorage.getIsFullCalled[0] )
		System.out.println("Tested isFull on empty stack " + resultStorage.getIsFullCalled[9] )
		System.out.println("Tested whether empty was checked when empty : " + resultsStorage.getIsEmptyCalledTrue );
		System.out.println("Tested whether empty was checked when not empty : " + resultsStorage.getIsEmtpyCalledFalse );
		System.out.println("Tested whether capacity was checked : " + resultsStorage.getIsCapacityCalled() );

		// TODO: @Helmut: Check that student test suite gives a green bar. (Could be done via, e.g., a TestListener)
	}

	public int checkisCurrentSizeCalled(){
		Int [] arr = getIsCurrentSizeCalled()
		int count = 0;
		for(int i = 1; i<arr.length(); i++){
			if(arr[i]) count++;
		}
		if(!arr[0]) return count;

		return count+1;
	}

}