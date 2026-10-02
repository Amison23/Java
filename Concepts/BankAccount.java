public class BankAccount {
 private String accountNumber;
 private Boolean balance;

 // Constructor
 public BankAccount(String accountNumber, Boolean balance){
  this.accountNumber = accountNumber;
  this.balance = balance;
 }

 // getters and setters
  public void setAccountNumber(String accountNumber){
    this.accountNumber = accountNumber;
  }
  public void setBalance(Boolean balance){
    this.balance = balance;
  }

  public String getAccountNumber() {
    return this.accountNumber;
  }
  public Boolean getBalance(){
    return this.balance;
  }
}
