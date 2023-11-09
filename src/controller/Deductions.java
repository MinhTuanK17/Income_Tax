/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controller;

import model.BroSis;
import model.Children;
import model.Parent;
import model.PersonDependent;

/**
 *
 * @author MINH TUAN
 */
public class Deductions {

    private PersonDependent pd;
    private int numBroSis;
    private int numChild;

    public Deductions(PersonDependent pd) {
        this.pd = pd;
        numChild = 0;
        numBroSis = 1;
    }

    public double deductionSeft() {
        return 11000000;
    }

    public double deductionChild() {
        double deductionC = 0;

        for (Children child : pd.getChild()) {
            if (child.getAge() <= 18 || child.isIsStudying()) {
                deductionC = Math.min(child.getNumber(), 2) * 4400000;
                numChild++;
            } else if (child.getAge() > 18 && !child.isIsStudying()) {
                break;
            }
        }
        return deductionC;
    }

    public double deductionParent() {
        double deductionP = 0;

        for (Parent parent : pd.getParents()) {
            if (parent.getAge() >= 60) {
                for (BroSis brosis : pd.getBrosis()) {
                    if (brosis.getIncome() > 4000000) {
                        numBroSis++;
                    }
                }
                deductionP = 4400000 / numBroSis;
                break;
            }
        }
        return deductionP;
    }

    public double taxIncome() {
        double taxIncome = pd.getTotalIncome() - deductionSeft() - deductionChild() - deductionParent();

        if (taxIncome <= 11000000) {
            System.err.println("Taxable Income: 0");
            System.out.println("You are exempt from taxes!");
            System.exit(0);
            return 0;
        } else if (taxIncome <= 6000000) {
            return taxIncome * 0.05;
        } else if (taxIncome <= 10000000) {
            return taxIncome * 0.1;
        } else {
            return taxIncome * 0.2;
        }
    }

    public void display() {
        System.out.println("-------------------- Deduction --------------------");
        System.out.println("Income:     " + pd.getTotalIncome());
        System.out.println("Deduction for self...");
        System.out.println("-----> Deduction  : " + deductionSeft());
        System.out.println("Deduction for supporting children...");
        System.out.println("-----> Deduction  : " + deductionChild());
        System.out.println("Deduction for supporting parents...");
        System.out.println("-----> Deduction  : " + deductionParent());
        System.out.println();
        System.err.println("Taxable Income    : " + taxIncome());
    }
}
