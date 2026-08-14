/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw6;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Account {
    //attribute
    private int id;
    private double balance,annualInterestRate;
    private Date dateCreated;
    Person objPerson;
    //constructor
    public Account(){
        this.id=0;
        this.balance=0.0;
    }
    public Account(int id,double balance){
        this.id=id;
        this.balance=balance;
    }
    //method
    public void setID(int id){
        this.id=id;
    }
    public int getID(){
        return this.id;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate=annualInterestRate;
    }
    public double getAnnualInterestRate(){
        return this.annualInterestRate;
    }
    public void setdateCreated(int dateCreated){
        this.dateCreated=this.dateCreated;
    }
    public Date getdateCreated(){
        return this.dateCreated;
    }
    public double getMonthlyInterestRate(){
        
    }
    public double getMonthlyInterest(){
        return balance*getMonthlyInterest();
    }
    public void withdraw(double amount){
        this.balance-=amount;
    }
    public void deposite(double amount){
        this.balance+=amount;
    }
    
    public void transferMoney(Account acc1,double amount){
        if(amount>0&&this.balance>=amount){
            this.balance-=amount;
            acc1.balance+=amount;
            System.out.println(amount);
        }
        else{
            System.out.println("Your money not enough");
        }
    }
    
    
    public static void main(String[] args) {
        Account ac=new Account(1122,20000);
        ac.setAnnualInterestRate(4.5);
        ac.deposite(3000);
        ac.withdraw(2500);
        System.out.println("Balance= "+ac.getBalance()+" MonthlyInterestRate: "+ac.getMonthlyInterestRate()+"%");
    }
}
