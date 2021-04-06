import java.util.Observable;

public class Money{
  private ResultStorageSingleton resultStorage;
  private int amount;

  public Money() { resultStorage = ResultStorageSingleton.getInstance();}

  public Money classify(int amount) throws InvalidParameterException{
    if(amount == 0){
      //TODO: resultStorage.incrAmountZero();
      throw new InvalidParameterException("Parameter amount == 0");
    }
    if(amount < 0){
      //TODO: resultStorage.incrAmountLessThanZero();
      throw new InvalidParameterException("Parameter amount < 0");
    }
    //TODO: Add collector for valid inputs

    this.amount = amount;
  }

  public int getAmount() {
    return amount;
  }

  public Money add(Money m) {
    //TODO: resultStorage.testAddTrue()
    return new Money(amount + m.getAmount());
  }

  public boolean equals(Object o) {
    //TODO: equalsIsTrue
    if (o instanceof Money) {
      return (amount == ((Money) o).getAmount());
    } else
      //TODO: equalsIsFalse
      return false;
  }

  public String toString() {
    return Integer.toString(amount);
  }
}