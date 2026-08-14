/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw6;

import java.time.Month;


public class Date {
    private int day,year;
    private String month;
    public Date() {
    }

    public Date(int day, int year, String month) {
        this.day = day;
        this.year = year;
        this.month = month;
    }
    
    public void setMonth(String month){
        this.month=month;
    }
    public void setDay(int day){
        this.day=day;
    }
    public void setYear(int year){
        this.year=year;
    }
    
    public String getMonth(String month){
        return this.month;
    }
    public int getDay(int day){
        return this.day;
    }
    public int getYear(int year){
        return this.year;
    }
    
    public String toString(){
        return "day: "+day+" month: "+month+" year: "+year;
    }
}
