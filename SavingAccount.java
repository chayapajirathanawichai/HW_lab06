/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw_lab6;

public class SavingAccount extends Application1{

    public SavingAccount() {
    }

    public SavingAccount(int id, double balance) {
        super(id, balance);
    }
    
    @Override
    public void transferMoney(Application1 app1,double amount){
        double totalAmount=amount+20.0;
        if(getBalance()>=totalAmount){
            withdraw(totalAmount);
            app1.deposite(amount);
            System.out.println("Success");
        }else System.out.println("Fail");
    }
}
