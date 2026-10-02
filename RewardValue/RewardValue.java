package RewardValue;

public class RewardValue {
  public int milesValue;
  public double cashValue;
  private static final double Conversion = 0.0035;

  // Getters and Setters
  public double getCashValue() {
    return cashValue;
  }

  public int getMilesValue(){
    return milesValue;
  }

  public void setCashValue(double cashValue){
    this.cashValue = cashValue;
  }

  public void setMilesValue(int milesValue){
    this.milesValue = milesValue;
  }

  // Contructors
  public RewardValue(double cashValue){
    this.cashValue = cashValue;
  }

  public RewardValue(int milesValue){
    this.milesValue = milesValue;
    this.cashValue = convertMilesToCash(milesValue);
  }

  // Converting Miles to cash method
  private double convertMilesToCash(int miles){
    return miles * Conversion;
  }
}
