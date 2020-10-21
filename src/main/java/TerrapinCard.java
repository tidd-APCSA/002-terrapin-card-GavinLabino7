public class TerrapinCard {
private double balance;

public TerrapinCard(double balance){
this.balance=balance;
}

public String toString(){
  String money = "The card has " + balance + " dollars";
  return money;
}

public void payEconomical(){
  if(balance < 2.50){
    balance = balance;
  }else{
    balance-=2.50;
  } 
}

public void payGourmet(){
 if(balance < 4.00){
    balance = balance;
}else{
    balance-=4.00;
}
}

public void loadMoney(double amount){
  if(amount > 150.0){
    balance = 150.0;
  }

  if(amount < 0){
    balance = balance;
  }else if((amount + balance < 150.0)){
    balance+=amount;
  }

}

public double getBalance(){
  return balance;
}



}
