
public class ResultStorageSingleton {
	
	private static ResultStorageSingleton theInstance = null;
	
	private int popStackIsEmtpy;
	public static int popCounter;
	public static int pushCounter;
	private static boolean pushPopWasTested;
	private static int arrayOutOfBoundsExeptionThrownInPush;
	private static int arrayOutOfBoundsExeptionThrownInPop;
	
	public static int[] isFullCalled;

	public static ResultStorageSingleton getInstance() {
		if (theInstance == null) { // Lazy instantiation
			theInstance = new ResultStorageSingleton();
		}
		return theInstance;
	}
	
	protected ResultStorageSingleton() { // Class may not be instantiated by others
	};
	
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
	public static void setPushPopWasTested() {
		pushPopWasTested = true;
	}
	
	public static void incrArrayOutOfBoundsExeptionThrownInPush() {
		arrayOutOfBoundsExeptionThrownInPush++;
	}
	public static void incrArrayOutOfBoundsExeptionThrownInPop() {
		arrayOutOfBoundsExeptionThrownInPop++;
	}

	public int getArrayOutOfBoundsExeptionThrownInPush() {
		return arrayOutOfBoundsExeptionThrownInPush;
	}


	public int getArrayOutOfBoundsExeptionThrownInPop() {
		return arrayOutOfBoundsExeptionThrownInPop;
	}
	
	
}
