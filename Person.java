/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw6;


public class Person {
    private String name,surname;
    private int age;
    private Date bDate;

    public Person() {
    }

    public Person(String name, String surname, int age, Date bDate) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.bDate = bDate;
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
    public void setName(Date bDate){
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
    
    public String toString(){
        return "name: "+name+" surname: "+surname+" age: "+age+" bdate: "+bDate;
    }
}
