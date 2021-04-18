
public class MoneyStack {
	private ResultStorageSingleton resultStorage;
	private static final int theCapacity = 10;
	private Money[] theStack;
	private int nextPushLocation; // Location in theStack array, where next push
									// will insert. 0 means: stack is empty.
public MoneyStack() {
	resultStorage = ResultStorageSingleton.getInstance();
	
	if ( 0 != resultStorage.getPushCounter()
		&& resultStorage.getPushCounter() == resultStorage.getPopCounter()) {
		resultStorage.setPushPopWasTested();
	}
	resultStorage.setIncrPushCounter();
	resultStorage.setIncrPopCounter();
	theStack = new Money[theCapacity];
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
	if(nextPushLocation == 0) {
		resultStorage.setEmptyCalledTrue();
		return true;
	}
	resultStorage.setEmptyCalledFalse();
	return false;
}

public int getCapacity() {
	resultStorage.setCapacityCalled(true);
	return theCapacity;
}

public int getCurrentSize() {
	resultStorage.setCurrentSizeCalled(nextPushLocation);
	return nextPushLocation;
}

public void push(Money element) throws ArrayIndexOutOfBoundsException {
	if(nextPushLocation == theCapacity) {
		resultStorage.incrArrayOutOfBoundsExeptionThrownInPush();
	}
	resultStorage.incrPushCounter();
	theStack[nextPushLocation++] = element;
}

public Money pop() throws ArrayIndexOutOfBoundsException {
	if(nextPushLocation == 0) {
		resultStorage.incrArrayOutOfBoundsExeptionThrownInPop();
	}
	resultStorage.incrPopCounter();
	
	return theStack[--nextPushLocation];
}

public int sum() {
	int currentSum = 0;
	for (int i = nextPushLocation-1; i >= 0; i--) {
		currentSum +=(theStack[i]).getAmount();
		
		resultStorage.setSumIsCalled(i, (theStack[i]).getAmount());
	}

	return currentSum;
}

}
