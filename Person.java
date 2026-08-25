/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw_lab6;


public class Person {
    private String name,surname;
    private int age;
    private Date bDate;
    public Person() {
        this.name="";
        this.surname="";
        this.age=0;
        this.bDate=new Date();
    }

    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }
     public void setName(String name){
        this.name=name;
    }
    public void setSurName(String surname){
        this.surname=surname;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setBDate(Date bDate){
        this.bDate=bDate;
    }
    
    public String getName(){
        return this.name;
    }
    public String getSurName(){
        return this.surname;
    }
    public int getAge(){
        return this.age;
    }
    public Date getBDate(){
        return this.bDate;
    }
    //method
    public void transferMoney(Application1 app1,double amount){
        
    }
    public String toString(){
        return "name: "+name+" surname: "+surname+" age: "+age+" bdate: "+bDate;
    }
}
