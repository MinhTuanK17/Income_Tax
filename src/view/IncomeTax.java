/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import common.Library;
import controller.Deductions;
import model.BroSis;
import model.Children;
import model.Parent;
import model.PersonDependent;

/**
 *
 * @author MINH TUAN
 */
public class IncomeTax {

    public void IncomeTax() {
        Library l = new Library();
        double income = l.getDouble("Enter income: ");
        System.err.println("Please enter detail your dependent family member...");
        int numChildren = l.getInt("Enter number of children: ");
        Children[] children = new Children[numChildren];

        for (int i = 0; i < numChildren; i++) {
            int age = l.getInt("----Enter age of child " + (i + 1) + ": ");
            boolean isStudying = l.getIsStudying("----Is child " + (i + 1) + " studying?");
            System.out.println("=================================================");
            children[i] = new Children(age, isStudying, numChildren);
        }

        int numParent = l.getInt("Enter number of parent: ");
        Parent[] parent = new Parent[numParent];

        for (int i = 0; i < numParent; i++) {
            String relation = l.getString("Enter relationship: ");
            int age = l.getInt("----Enter age of " + relation + ": ");
            System.out.println("=================================================");
            parent[i] = new Parent(relation, age, numParent);
        }

        int numbs = l.getInt("Enter number of bro/sis: ");
        BroSis[] brosis = new BroSis[numbs];
        for (int i = 0; i < numbs; i++) {
            double incomebs = l.getDouble("----Income of bro/sis " + (i + 1) + ": ");
            brosis[i] = new BroSis(numbs, incomebs);
        }

        PersonDependent pd = new PersonDependent(income, children, parent, brosis);
        Deductions it = new Deductions(pd);
        it.display();
    }
}
