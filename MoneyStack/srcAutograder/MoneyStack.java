public class MoneyStack {
	private static final int theCapacity = 10;
	private Money[] theStack;
	private int nextPushLocation; // Location in theStack array, where next push
									// will insert. 0 means: stack is empty.
	//TODO:
	public MoneyStack() {
		
		if ( 0 != ResultStorageSingleton.pushCounter
			&& ResultStorageSingleton.pushCounter == ResultStorageSingleton.popCounter) {
			ResultStorageSingleton.setPushPopWasTested();
		}
		ResultStorageSingleton.pushCounter = 0;
		ResultStorageSingleton.popCounter = 0;
		theStack = new Money[MoneyStack.theCapacity];
		nextPushLocation = 0;
	}

	public boolean isFull() {
		ResultStorageSingleton.isFullCalled[nextPushLocation];
		if (nextPushLocation == theCapacity) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		if(nextPushLocation == 0) {
			return true;
		}
		return false;
	}
	
	public int getCapacity() {
		return theCapacity;
	}
	
	public int getCurrentSize() {
		return nextPushLocation;
	}
	
	public void push(Money element) throws ArrayIndexOutOfBoundsException {
		if(nextPushLocation == theCapacity) {
			ResultStorageSingleton.incrArrayOutOfBoundsExeptionThrownInPush();
		}
		theStack[nextPushLocation++] = element;
	}

	public Money pop() throws ArrayIndexOutOfBoundsException {
		if(nextPushLocation == 0) {
			ResultStorageSingleton.incrArrayOutOfBoundsExeptionThrownInPop();
		}
		return theStack[--nextPushLocation];
	}
	//TODO: currectSum < 0
	// -	currentSum >= 0
	public int sum() {
		int currentSum = 0;
		for (int i = nextPushLocation-1; i >= 0; i--) {
			currentSum +=(theStack[i]).getAmount();
		}
		return currentSum;
	}
	
}
