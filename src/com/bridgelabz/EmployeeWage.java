package com.bridgelabz;

public class EmployeeWage {
    static final int Employee_Present=1;
    static final int IS_Part_Time=2;
    static final int Wage_per_Hr=20;
    static final int Full_Day_Hr=16;
    static final int Part_Time=8;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage !");
        double empCheck=Math.floor(Math.random()*10) % 3;
        int dailywage=0;
        if(empCheck==Employee_Present) {
            System.out.println("employee is full time");
            dailywage=Wage_per_Hr * Full_Day_Hr;
        } else if (empCheck==IS_Part_Time) {
            System.out.println("employee is part time");
            dailywage=Wage_per_Hr * Part_Time;
        }
        else {
            System.out.println("employee is absent");
        }
        System.out.println("Daily Wage is "+dailywage);
        }
    }


