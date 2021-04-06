
public class ResultStorageSingleton {
	
	private static ResultStorageSingleton theInstance = null;
	
	private int popStackIsEmtpy;
	private int
	
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
}
