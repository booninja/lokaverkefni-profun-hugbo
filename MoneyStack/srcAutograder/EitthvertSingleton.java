
public class EitthvertSingleton {
	
	private static EitthvertSingleton theInstance = null;
	
	private int popStackIsEmtpy;
	
	
	public static EitthvertSingleton getInstance() {
		if (theInstance == null) { // Lazy instantiation
			theInstance = new EitthvertSingleton();
		}
		return theInstance;
	}
	
	protected EitthvertSingleton() { // Class may not be instantiated by others
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
