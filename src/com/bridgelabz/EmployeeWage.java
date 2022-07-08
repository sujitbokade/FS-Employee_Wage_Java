package com.bridgelabz;

public class EmployeeWage {
    static final int IS_FULL_TIME=1;
    static final int IS_PART_TIME=2;
    static final int WAGE_PER_HR=20;
        public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage !");
        double empCheck=Math.floor(Math.random()*10) % 3;
        int dailywage=0;
        switch ((int)empCheck)
        {
            case IS_FULL_TIME:
                System.out.println("Employee is Present Full Time");
                dailywage=16;
                break;
            case IS_PART_TIME:
                System.out.println("Employee is Present Part Time");
                dailywage=8;
                break;
            default:
                System.out.println("Employee is Absent");
        }
        int wage= dailywage * WAGE_PER_HR;
        System.out.println("Daily Wage is "+wage);
        }
    }


