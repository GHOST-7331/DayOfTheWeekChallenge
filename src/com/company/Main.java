package com.company;

public class Main {

    public static void main(String[] args) {
        printDayOfTheWeek(8);

    }
    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                if ((day < 1) || (day > 7)) {
                    System.out.println("Only 1-7 days in a week");
                }
        }
    }
}

// Implemented the default if statement only 1-7 days in a week
