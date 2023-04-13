package oca_2022.q109;
//Given these two classes.

public class Customer {
    ElectricAccount acct=new ElectricAccount();
    public  void useElectricity(double kWh){
        acct.addKWh(kWh);
    }

public class ElectricAccount {
    private double kWh;
    private double rate = 0.07;
    private double bill;

    //line1
    public void addKWh(double kWh) {
        if (kWh > 0) {
            this.kWh += kWh;
            this.bill = this.kWh * this.rate;
        }

    }
}
}
/*
Any amount of electricity used by a customer
 (represented by an instance of the Customer class)
 must contribute to the customer's bill
  (represented by the member variable bill)
  through the useElectricity method.
  An instance of the Customer class should
  never be able to tamper with or decrease
  the value of the member variable bill.
  How should you write methods in the
  ElectricAccount
   class at line n1 so that the member
   variable bill is always equal to the value
   of the member variable kwh multiplied by the
    member variable rate?

A. Option A
 */
/*A  public void aaKWh(double kWh){
      this.kWh+=kWh;
      this.bill=this.kWh*this.rate;}
  B  public void addKWh(double kWh){
      if(kWh>0){
      this.kWh+=kWh;
      this.bill=this.kWh*this.rate; }}
  C  private void addKWh(double kWh){
       if(kWh > 0){
          this.kWh+=kWh;
          this.bill=this.kWh*this.rate; }}
  D public void addKWh(double kWh){
        if(kWh>0){
            this.kWh +=kWh;
            setBill(this.kWh);
         }
     }
     public void setBill(double kWh){
          bill=kWh*rate;
     }

  A. Option A
  B. Option B
  C. Option C
  D. Option D
   Answer: B
 */
