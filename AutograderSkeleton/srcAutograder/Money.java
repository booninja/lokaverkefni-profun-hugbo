
public class Money {
	 private ResultStorageSingleton resultStorage;
	  private int amount;

	  public Money(int amount) {
		  this.amount= amount;
		  resultStorage = ResultStorageSingleton.getInstance();
		 }
	  
	  public Money classify(int amount) throws InvalidParameterException{
		    if(amount == 0){
		      throw new InvalidParameterException("Parameter amount == 0");
		    }
		    if(amount < 0){
		      throw new InvalidParameterException("Parameter amount < 0");
		    }
		    this.amount = amount;
			return null;
		    
		  }
	  
	  public int getAmount() {
		    return amount;
		  }

		  public Money add(Money m) {
		    return new Money(amount + m.getAmount());
		  }

		  public boolean equals(Object o) {
		    if (o instanceof Money) {
		      return (amount == ((Money) o).getAmount());
		    } else
		      return false;
		  }

		  public String toString() {
		    return Integer.toString(amount);
		  }
		
}
