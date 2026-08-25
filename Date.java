/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw_lab6;

public class Date {
    private int day,year;
    private String month;

    public Date() {
        this.day=1;
        this.month="January";
        this.year=2000;
    }

    public Date(int day, int year, String month) {
        this.day = day;
        this.year = year;
        this.month = month;
    }
    public int getDay(){
        return day;
    }
    public void setDay(int day){
        this.day=day;
    }
    public String getMonth(){
        return month;
    }
    public void setMonth(String Month){
        this.month=month;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year=year;
    }
    @Override
    public String toString(){
        return day+" "+month+" "+year;
    }
}
