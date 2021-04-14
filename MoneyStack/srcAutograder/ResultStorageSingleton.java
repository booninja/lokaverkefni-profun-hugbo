
public class ResultStorageSingleton {
	
	private ResultStorageSingleton theInstance = null;
	public ResultStorageSingleton getInstance() {
		if (theInstance == null) { // Lazy instantiation
			theInstance = new ResultStorageSingleton();
		}
		return theInstance;
	}

	protected ResultStorageSingleton() { // Class may not be instantiated by others
	};

	private int incrPopCounter;

	public void setIncrPopCounter() {
		this.incrPopCounter = 0;
	}

	public void setIncrPushCounter() {
		this.incrPushCounter = 0;
	}

	private int incrPushCounter;

	private boolean pushPopWasTested;
	private int arrayOutOfBoundsExeptionThrownInPush;
	private int arrayOutOfBoundsExeptionThrownInPop;
	private boolean isEmptyCalledTrue;
	private boolean isEmptyCalledFalse;
	private boolean isCapacityCalled;
	private boolean [] isCurrentSizeCalled;
	private int  [] sumIsCalled;
	public boolean [] isFullCalled;

	public int getPopCounter() {
		return incrPopCounter;
	}

	public void incrPopCounter() {
		incrPopCounter++;
	}

	public int getPushCounter() {
		return incrPushCounter;
	}

	public void incrPushCounter() {
		incrPushCounter++;
	}

	public int[] getIsFullCalled() {
		return isFullCalled;
	}
	public void setIsFullCalledArray(int capacity) {
		isFullCalled = new boolean[capacity];
	}

	public void setIsFullCalled(int nextPushLocation) {
		isFullCalled[nextPushLocation] = true;
	}

	public boolean isEmptyCalledTrue() {
		return isEmptyCalledTrue;
	}

	public void setEmptyCalledTrue(boolean emptyCalledTrue) {
		isEmptyCalledTrue = emptyCalledTrue;
	}

	public boolean isEmptyCalledFalse() {
		return isEmptyCalledFalse;
	}

	public void setEmptyCalledFalse(boolean emptyCalledFalse) {
		isEmptyCalledFalse = emptyCalledFalse;
	}

	public boolean isCapacityCalled() {
		return isCapacityCalled;
	}

	public void setCapacityCalled(boolean capacityCalled) {
		isCapacityCalled = capacityCalled;
	}

	public boolean[] getCurrentSizeCalled() {
		return isCurrentSizeCalled;
	}

	public void setCurrentSizeCalled(int nextPushLocation) {
		isCurrentSizeCalled[nextPushLocation] = true;
	}
	public void setCurrentSizeCalledArray(int nextPushLocation) {
		isCurrentSizeCalled = new boolean[capacity];
	}

	public int[] getSumIsCalled() {
		return sumIsCalled;
	}

	public void setSumIsCalledArraySize(int capacity){
		sumIsCalled = new int[capacity];
	}

	public void setSumIsCalled(int nextPushLocation, int amount) {
		 sumIsCalled[nextPushLocation] = amount;
	}

	/**
	 * Return how often the classify method was called with parameter pop
	 */
	public int getPopStackIsEmpty() {
		return popStackIsEmtpy;
	}
	
	/**
	 * Increment how often the classify method was called with parameter alpha == 0
	 */
	public void incrPopStackIsEmpty() {
		popStackIsEmtpy++;
	}
	public void setPushPopWasTested() {
		pushPopWasTested = true;
	}
	
	public void incrArrayOutOfBoundsExeptionThrownInPush() {
		arrayOutOfBoundsExeptionThrownInPush++;
	}
	public void incrArrayOutOfBoundsExeptionThrownInPop() {
		arrayOutOfBoundsExeptionThrownInPop++;
	}

	public int getArrayOutOfBoundsExeptionThrownInPush() {
		return arrayOutOfBoundsExeptionThrownInPush;
	}
	public int getArrayOutOfBoundsExeptionThrownInPop() {
		return arrayOutOfBoundsExeptionThrownInPop;
	}
	
	
}
