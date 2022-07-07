package com.bridgelabz;

public class EmployeeWage {
        static final int Employee_Full_Time=1;
        static final int IS_Part_Time=2;
        static final int Wage_per_Hr=20;
        static final int Days_Per_Month=20;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage !");
        double empCheck=Math.floor(Math.random()*10) % 3;
        int dailywage=0;
        switch ((int)empCheck)
        {
            case Employee_Full_Time:
                System.out.println("Employee is Present Full Time");
                dailywage=16;
                break;
            case IS_Part_Time:
                System.out.println("Employee is Present Part Time");
                dailywage=8;
                break;
            default:
                System.out.println("Employee is Absent");
        }
        int wage= dailywage * Wage_per_Hr;
        int Total_Wage=Days_Per_Month * wage;
        System.out.println("Daily Wage is "+Total_Wage);
        }
    }


