/**
 * Class for storing results from the class that gets tested be the submitted
 * JUnit tests.
 * 
 * This class uses the singleton design pattern, so that it can be used by all
 * instance of the class that gets tested. => Instantiate via getInstance()
 * 
 *
 */
public class ResultStorageSingleton {
	private static ResultStorageSingleton theInstance = null;

	
	private int capacity = 10;
	private int incrPushCounter;
	private int incrPopCounter;
	
	private boolean pushPopWasTested;
	private int arrayOutOfBoundsExeptionThrownInPush;
	private int arrayOutOfBoundsExeptionThrownInPop;
	private boolean isEmptyCalledTrue;
	private boolean isEmptyCalledFalse;
	private boolean isCapacityCalled;
	private boolean [] isCurrentSizeCalled = new boolean[capacity];
	private int [] sumIsCalled = new int[capacity];
	private boolean [] isFullCalled = new boolean[capacity+1];
	
	
	public static ResultStorageSingleton getInstance() {
		if (theInstance == null) { // Lazy instantiation
			theInstance = new ResultStorageSingleton();
		}
		return theInstance;
	}

	protected ResultStorageSingleton() { // Class may not be instantiated by others
	};
	
	/**
	 * Initialises pop counter 
	 */
	public void setIncrPopCounter() {
		this.incrPopCounter = 0;
	}
	
	/**
	 * Return how often the method was called with parameter pop
	 * @return
	 */
	public int getPopCounter() {
		return incrPopCounter;
	}
	
	/**
	 * Increments pop counter by one
	 */
	public void incrPopCounter() {
		incrPopCounter++;
	}
	
	/**
	 * Initialises push counter 
	 */
	public void setIncrPushCounter() {
		this.incrPushCounter = 0;
	}
	
	/**
	 * Return how often the method was called with parameter push
	 * @return
	 */
	public int getPushCounter() {
		return incrPushCounter;
	}
	
	/**
	 * Increments push counter by one
	 */
	public void incrPushCounter() {
		incrPushCounter++;
	}
	
	/**
	 * Confirms that push and pop was tested
	 */
	public void setPushPopWasTested() {
		pushPopWasTested = true;
	}
	
	/**
	 * Return whether the method was called where pop and push were both tested
	 * @return
	 */
	public boolean getPushPopWasTested() {
		return pushPopWasTested;
	}
	
	/**
	 * Increments counter for array out of bounds exception for push method
	 */
	public void incrArrayOutOfBoundsExeptionThrownInPush() {
		arrayOutOfBoundsExeptionThrownInPush++;
	}
	
	/**
	 * Increments counter for array out of bounds exception for pop method
	 */
	public void incrArrayOutOfBoundsExeptionThrownInPop() {
		arrayOutOfBoundsExeptionThrownInPop++;
	}

	
	/**
	 * Return how often the method was called where Array out of bounds Exeption
	 * was thrown in the push method
	 * @return
	 */
	public int getArrayOutOfBoundsExeptionThrownInPush() {
		return arrayOutOfBoundsExeptionThrownInPush;
	}
	
	/**
	 * Return how often the method was tested where Array out of bounds Exeption
	 * was thrown in the push method
	 * @return int
	 */
	public int getArrayOutOfBoundsExeptionThrownInPop() {
		return arrayOutOfBoundsExeptionThrownInPop;
	}
	
	/**
	 * Confirms that isFull was tested at the position nextPushLocation
	 * @param nextPushLocation
	 */
	public void setIsFullCalled(int nextPushLocation) {
		this.isFullCalled[nextPushLocation] = true;		
	}

	/**
	 * Return how often the method isFulled was tested at position i
	 * @param i
	 * @return boolean
	 */
	public boolean getIsFullCalled(int i) {
		return this.isFullCalled[i];
	}
	
	/**
	 * Return how often the method isFulled was tested
	 * @return int
	 */
	public int countIsFullCalledNotFull(){
		boolean[] arr = isFullCalled;
		int count = 0;
		for(int i = 0; i< arr.length-1; i++){
			if(arr[i]) count++;
		}
		return count;
	}	
	
	/**
	 * Confirms that empty was tested on empty stack
	 */
	public void setEmptyCalledTrue() {
		isEmptyCalledTrue = true;
	}
	
	/**
	 * Returns whether empty was tested on empty stack
	 * @return
	 */
	public boolean getIsEmptyCalledTrue() {
		return isEmptyCalledTrue;
	}
	
	/**
	 * Confirms that empty was tested on a non empty stack
	 */
	public void setEmptyCalledFalse() {
		isEmptyCalledFalse = true;
	}
	
	/**
	 * Returns whether empty was tested on empty stack
	 * @return boolean
	 */
	public boolean getIsEmptyCalledFalse() {
		return isEmptyCalledFalse;
	}
	
	/**
	 * Confirms that current size was tested at the position nextPushLocation
	 * @param nextPushLocation
	 */
	public void setCurrentSizeCalled(int nextPushLocation) {
		isCurrentSizeCalled[nextPushLocation] = true;
	}
	
	/**
	 * Return whether the method current size was tested at position i
	 * @param i
	 * @return boolean
	 */
	public boolean getCurrentSizeCalled(int i ) {
		return isCurrentSizeCalled[i];
	}
	
	/**
	 * Confirms that whether the capacity was tested
	 * @param capacityCalled
	 */
	public void setCapacityCalled(boolean capacityCalled) {
		isCapacityCalled = capacityCalled;
	}
	
	/**
	 * Returns boolean value on whether capacity was tested
	 * @return boolean
	 */
	public boolean getIsCapacityCalled() {
		return isCapacityCalled;
	}
	
	/**
	 * Returns how many times current size is called when the stack is not empty
	 * @return
	 */
	public int countIsCurrentSizeCalledBiggerThanZero(){
		boolean[] arr = isCurrentSizeCalled;
		int count = 0;
		for(int i = 1; i< arr.length; i++){
			if(arr[i]) count++;
		}
		return count;
	}	
	
	/**
	 * Records the amount that each money stacks holds in correspondence to the nextPushLocation
	 * @param nextPushLocation
	 * @param amount
	 */
	public void setSumIsCalled(int nextPushLocation, int amount) {
		 sumIsCalled[nextPushLocation] = amount;
	}
	
	/**
	 * Returns the array for when the sum is tested
	 * @return
	 */
	public int[] getSumIsCalled() {
		return sumIsCalled;
	}
	
	/**
	 * Returns how many times the sum is tested
	 * @return
	 */
	public int countIsSumCalled(){
		int[] arr = sumIsCalled;
		int count = 0;
		for(int i = 0; i< arr.length; i++){
			if(arr[i]!=0) count++;
		}
		return count;
	}	
	
}
