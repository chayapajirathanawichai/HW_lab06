/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw_lab6;
import java.time.LocalDate;
import java.time.Period;

public class FixAccount extends Application1{

    public FixAccount() {
    }
    public FixAccount(int id,double balance){
        super(id,balance);
    }
    @Override
    public void transferMoney(Application1 app1,double amount){
        System.out.println("Can't deposite");
    }
    @Override
    public void withdraw(double amount) {
        LocalDate today = LocalDate.now();
        Date created = getdateCreated();
        
        int monthNum = parseMonth(created.getMonth());
        LocalDate startDate = LocalDate.of(created.getYear(), monthNum, created.getDay());
        Period period = Period.between(startDate, today);

        if (period.getYears() >= 1) {
            if (getBalance() >= amount) {
                super.withdraw(amount);
                System.out.println("withdraw success");
            } else {
                System.out.println("withdraw fail");
            }
        } else {
            System.out.println("Cannot withdraw: Account must be opened for more than 1 year");
        }
    } // ปิด withdraw

    private int parseMonth(String month) {
        if (month == null) {
            return 1;
        }
        switch (month.toLowerCase()) {
            case "january": case "jan": return 1;
            case "february": case "feb": return 2;
            case "march": case "mar": return 3;
            case "april": case "apr": return 4;
            case "may": return 5;
            case "june": case "jun": return 6;
            case "july": case "jul": return 7;
            case "august": case "aug": return 8;
            case "september": case "sep": return 9;
            case "october": case "oct": return 10;
            case "november": case "nov": return 11;
            case "december": case "dec": return 12;
            default: return 1;
        }
    } 

}

    

