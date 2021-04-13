public class MoneyStack {
	private static final int theCapacity = 10;
	private Money[] theStack;
	private int nextPushLocation; // Location in theStack array, where next push
									// will insert. 0 means: stack is empty.
	
	public MoneyStack() {
		theStack = new Money[MoneyStack.theCapacity];
		nextPushLocation = 0;
	}

	public boolean isFull() {
		//TODO: isFullTrue
		if (nextPushLocation == theCapacity) {
			return true;
		} else {
		//TODO: isFullFalse
			return false;
		}
	}
	
	public boolean isEmpty() {
		//TODO: isEmptyTrue
		if(nextPushLocation == 0) {
			return true;
		}
		//TODO: IsEmptyFalse
		return false;
	}
	
	public int getCapacity() {
		return theCapacity;
	}
	
	public int getCurrentSize() {
		return nextPushLocation;
	}
	
	public void push(Money element) throws ArrayIndexOutOfBoundsException {
		//TODO: isNextPushLocationInBounds
		//TODO: isNextPushLocationOutOfBounds
		theStack[nextPushLocation++] = element;
	}

	public Money pop() throws ArrayIndexOutOfBoundsException {
		//TODO: isNextPopLocationInBounds
		//TODO: isNextPopLocationOutOfBounds
		return theStack[--nextPushLocation];
	}

	public int sum() {
		//TODO:
		int currentSum = 0;
		for (int i = nextPushLocation-1; i >= 0; i--) {
			currentSum +=(theStack[i]).getAmount();
		}
		return currentSum;
	}
	
}
