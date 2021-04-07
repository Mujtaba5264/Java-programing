package IncomeTaxAssignment;

import java.util.Scanner;

public class IncomeTaxRate {
    // two static variables  Taxfree and tax amount.  Taxfree is the least amount from which tax start. tax_amount is 0 for the first time.
    public static final double Taxfree = 600000;
    public static double taxAmount=0;

    // findTax is a static method which has double return type . It takes perameter as salary and find the tax amount
    // based on the salary
    public static double findtax(double salary) {

        if (salary <= Taxfree) {

            taxAmount = 0;
        } else if (salary > Taxfree & salary <= 1200000) {
            taxAmount = (salary - Taxfree) * 5 / 100;
            return taxAmount;
        } else if (salary > 1200000 & salary <= 1800000) {
            taxAmount = 30000 + (salary - 1200000) * 10 / 100;
            return taxAmount;
        } else if (salary > 1800000 & salary <= 2500000) {
            taxAmount = 90000 + (salary - 1800000) * 15 / 100;
            return taxAmount;
        } else if (salary > 2500000 & salary <= 3500000) {
            taxAmount = 195000 + (salary - 2500000) * 17.5 / 100;
            return taxAmount;
        } else if (salary > 3500000 & salary <= 5000000) {
            taxAmount = 370000 + (salary - 3500000) * 20 / 100;
            return taxAmount;
        } else if (salary > 5000000 & salary <= 8000000) {
            taxAmount = 670000 + (salary - 5000000) * 22.5 / 100;
            return taxAmount;
        } else if (salary > 8000000 & salary <= 12000000) {
            taxAmount = 1345000 + (salary - 8000000) * 25 / 100;
            return taxAmount;
        } else if (salary > 12000000 & salary <= 30000000) {
            taxAmount = 2345000 + (salary - 12000000) * 27.5 / 100;
            return taxAmount;
        } else if (salary > 30000000 & salary <= 50000000) {
            taxAmount = 7295000 + (salary - 30000000) * 30 / 100;
            return taxAmount;
        } else if (salary > 50000000 & salary <= 75000000) {
            taxAmount = 13295000 + (salary - 50000000) * 32.5 / 100;
            return taxAmount;
        } else if (salary > 75000000) {
            taxAmount = 21420000 + (salary - 75000000) * 35 / 100;
            return taxAmount;
        }
        return taxAmount;
    }

// this is the main method. here i have called the findtax method after getting salary as input from the user.
    public static void main(String[] args){
        System.out.print("Enter your salary : ");
        Scanner sc = new Scanner(System.in);
        double Salary = sc.nextDouble();
        System.out.println("The Amount of Tax you have to pay is : "+findtax(Salary)+" Rupees.");


    }
}
