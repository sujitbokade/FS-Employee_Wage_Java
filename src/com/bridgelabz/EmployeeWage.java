package com.bridgelabz;

public class EmployeeWage {
    static final int IS_FULL_TIME=1;
    static final int IS_PART_TIME=2;
    static final int WAGE_PER_HR=20;
    static final int PART_TIME_HR=5;
    static final int FULL_TIME_HR=10;
        public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage !");
        double empCheck=Math.floor(Math.random()*10) % 3;
        int dailywage=0;
        switch ((int)empCheck)
        {
            case IS_FULL_TIME:
                System.out.println("Employee is Present Full Time");
                dailywage=FULL_TIME_HR*WAGE_PER_HR;
                break;
            case IS_PART_TIME:
                System.out.println("Employee is Present Part Time");
                dailywage=PART_TIME_HR*WAGE_PER_HR;
                break;
            default:
                System.out.println("Employee is Absent");
        }
        System.out.println("Daily Wage is "+dailywage);
        }
    }


