/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author MINH TUAN
 */
public class Children {

    private int age;
    private boolean isStudying;
    private int number;

    public Children(int age, boolean isStudying, int number) {
        this.age = age;
        this.isStudying = isStudying;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIsStudying() {
        return isStudying;
    }

    public void setIsStudying(boolean isStudying) {
        this.isStudying = isStudying;
    }

}
