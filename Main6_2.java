/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw_lab6;

public class Main6_2 {
    public static void main(String[] args) {
        Application1 app1=new Application1(1100,0.0);
        FixAccount app2=new FixAccount(1124,20000.0);
        app2.setAnnualInterestRate(7.0);
        
        Date birthDate=new Date(10,1998,"March");
        Person owner=new Person("Somsak","Rukdee");
        owner.setAge(26);
        owner.setBDate(birthDate);
        app2.setObjPerson(owner);
        
        app2.withdraw(2500.0);
        app2.deposite(3000.0);
        app2.transferMoney(app1, 1000.0);
        System.out.println("Balance: "+app2.getBalance());
        System.out.println("Monthly Interest: "+app2.getMonthlyInterest());
    }
}
