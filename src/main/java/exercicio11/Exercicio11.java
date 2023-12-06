package exercicio11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of Employees: ");
        int n = sc.nextInt();

        for (int i = 1; i<= n; i++){
            System.out.println("Employee #"+i+" data:");
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuerPerHour = sc.nextDouble();
            if (ch == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                list.add(new OutsourceEmployee(name,hours,valuerPerHour,additionalCharge));
            }else {
                list.add(new Employee(name,hours,valuerPerHour));
            }
        }
        System.out.println();
        System.out.println("PAYMENTS: ");
        for (Employee emp: list) {
            System.out.println(emp.getName() +" - $ "+ String.format("%.2f",emp.payment()));
        }

        sc.close();
    }
}
