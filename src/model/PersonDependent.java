/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author MINH TUAN
 */
public class PersonDependent {

    private double totalIncome;
    private Children[] child;
    private Parent[] parents;
    private BroSis[] brosis;

    public PersonDependent(double totalIncome, Children[] child, Parent[] parents, BroSis[] brosis) {
        this.totalIncome = totalIncome;
        this.child = child;
        this.parents = parents;
        this.brosis = brosis;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(double totalIncome) {
        this.totalIncome = totalIncome;
    }

    public Children[] getChild() {
        return child;
    }

    public void setChild(Children[] child) {
        this.child = child;
    }

    public Parent[] getParents() {
        return parents;
    }

    public void setParents(Parent[] parents) {
        this.parents = parents;
    }

    public BroSis[] getBrosis() {
        return brosis;
    }

    public void setBrosis(BroSis[] brosis) {
        this.brosis = brosis;
    }

}
