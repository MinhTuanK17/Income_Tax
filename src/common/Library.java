/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.Scanner;

/**
 *
 * @author MINH TUAN
 */
public class Library {

    protected Scanner sc;

    public Library() {
        sc = new Scanner(System.in);
    }

    public String getString(String msg) {
        System.out.print(msg);
        return sc.nextLine();
    }

    public boolean getIsStudying(String msg) {
        while (true) {
            String input = getString(msg + " (T/F): ");

            if (input.equalsIgnoreCase("T")) {
                return true;
            } else if (input.equalsIgnoreCase("F")) {
                return false;
            }
            System.err.println("Invalid. Try again.");
        }
    }

    public int getInt(String msg) {
        while (true) {
            String check = getString(msg);
            try {
                int input = Integer.parseInt(check);
                if (input < 0) {
                    throw new Exception();
                }
                return input;
            } catch (Exception e) {
                System.err.println("Invalid input! Please try again");
            }
        }
    }

    public double getDouble(String msg) {
        while (true) {
            String check = getString(msg);
            try {
                double input = Double.parseDouble(check);
                if (input < 0) {
                    throw new Exception();
                }
                return input;
            } catch (Exception e) {
                System.err.println("Invalid input! Please try again");
            }
        }
    }
}
