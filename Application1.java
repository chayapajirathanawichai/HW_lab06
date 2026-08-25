/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw_lab6;

import java.time.LocalDate;
import java.time.Period;

public class Application1 {
    //attribute
    private int id;
    private double balance,annualInterestRate;
    private Date dateCreated;
    private Person objPerson;
    //constructor
    public Application1(){
        this.id=0;
        this.balance=0.0;
        this.annualInterestRate=0.0;
        this.dateCreated=new Date();
        this.objPerson=new Person();
    }
    public Application1(int id,double balance){
        this();
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
    public Person getObjPerson(){
        return objPerson;
    }
    public void setObjPerson(Person objPerson){
        this.objPerson=objPerson;
    }
    
    public void transferMoney(Application1 app1,double amount){
        if(this.balance>=amount){
            this.withdraw(amount);
            app1.deposite(amount);
        }
    }
    public double getMonthlyInterestRate(){
        return (annualInterestRate/100.0)/12.0;
    }
    public double getMonthlyInterest(){
        LocalDate today=LocalDate.now();
        int monthNum=parseMonth(dateCreated.getMonth());
        LocalDate start=LocalDate.of(dateCreated.getYear(),monthNum,dateCreated.getDay());
        
        Period period=Period.between(start,today);
        int totalMonths=(period.getYears()*12)+period.getMonths();
        return balance*getMonthlyInterestRate()*totalMonths;
    }
    public void withdraw(double amount){
        this.balance-=amount;
    }
    public void deposite(double amount){
        this.balance+=amount;
    }

    private int parseMonth(String month) {
        if(month==null) return 1;
        switch(month.toLowerCase()){
            case "january":case "jan":return 1;
            case "february":case "feb":return 2;
            case "march":case "mar":return 3;
            case "april":case "apr":return 4;
            case "may":return 5;
            case "june":case "jun":return 6;
            case "july":case "jul":return 7;
            case "august":case "aug":return 8;
            case "september":case "sep":return 9;
            case "october":case "oct":return 10;
            case "november":case "nov":return 11;
            case "december":case "dec":return 12;
            default:return 1;
        }
    }
    @Override
    public String toString(){
        return "Account ID: "+id+"\nBalance: "+balance+"\nOwner: "+objPerson.getName()+" "+objPerson.getSurName()+"\nDate Created: "+dateCreated;
    }
}
