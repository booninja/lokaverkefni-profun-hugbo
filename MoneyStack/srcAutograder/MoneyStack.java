public class MoneyStack {
	private ResultStorageSingleton resultStorage;
	private static final int theCapacity = 10;
	private Money[] theStack;
	private int nextPushLocation; // Location in theStack array, where next push
									// will insert. 0 means: stack is empty.

	public MoneyStack() {
		resultStorage = ResultStorageSingleton.getInstance();
		if ( 0 != resultStorage.incrPushCounter
			&& resultStorage.incrPushCounter == resultStorage.popCounter) {
			resultStorage.setPushPopWasTested();
		}
		resultStorage.setPushCounter();
		resultStorage.setPopCounter();
		resultStorage.setSumIsCalledArray(theCapacity);
		resultStorage.setIsFullCalledArray(theCapacity);
		resultStorage.setisCurrentSizeCalledArray(theCapacity);
		theStack = new Money[MoneyStack.theCapacity];
		nextPushLocation = 0;
	}

	public boolean isFull() {
		resultStorage.setIsFullCalled(nextPushLocation);
		if (nextPushLocation >= theCapacity) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		resultStorage.isEmptyCalledTrue = true;
		if(nextPushLocation == 0) {
			return true;
		}
		resultStorage.isEmptyCalledFalse = true;
		return false;
	}
	
	public int getCapacity() {
		resultStorage.isGetCapacityCalled = true;
		return theCapacity;
	}
	
	public int getCurrentSize() {
		resultStorage.isCurrectSizeCalled[nextPushLocation] = true;
		return nextPushLocation;
	}
	
	public void push(Money element) throws ArrayIndexOutOfBoundsException {
		//TODO: geyma element í TestPushPop
		if(nextPushLocation == theCapacity) {
			resultStorage.incrArrayOutOfBoundsExeptionThrownInPush();
		}
		theStack[nextPushLocation++] = element;
	}

	public Money pop() throws ArrayIndexOutOfBoundsException {
		resultStorage.incrPopCounter();
		// TODO: Skoða ef theStack[nextPushLocation] er það sama og TestPushPop
		if(nextPushLocation == 0) {
			resultStorage.incrArrayOutOfBoundsExeptionThrownInPop();
		}
		return theStack[--nextPushLocation];
	}
	//TODO: Sum array implementation ??

	public int sum() {

		int currentSum = 0;
		for (int i = nextPushLocation-1; i >= 0; i--) {
			currentSum +=(theStack[i]).getAmount();
			resultStorage.sumIsCalled(i, (theStack[i]).getAmount());
		}

		return currentSum;
	}
	
}
