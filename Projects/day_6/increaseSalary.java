import java.util.Scanner;

class Employee {

        public String name;
        public double grossSalary;
        public double tax;


        public void increaseSalaryByPercentage(double percentage){
            grossSalary += grossSalary * (percentage / 100.0);
        }

        public void increaseSalaryByValue(double value){
            grossSalary += value;
        }

        public double netSalary() {
            return grossSalary - grossSalary * (tax / 100.0);
        };


}

public class SalaryIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();
        System.out.println("Be welcome to employee register system!");
        System.out.println();

        System.out.print("Name: ");
        emp.name = sc.nextLine();

        System.out.print("Gross salary: ");
        emp.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();


        boolean increaseDesire;
        System.out.println("Do you want to increase this employee's salary?");
        System.out.println("Answer false to no");
        System.out.println("Answer true to yes");
        increaseDesire = sc.nextBoolean();

        if (increaseDesire){
            int increaseType;
            System.out.println("How do you want to increase his salary?");
            System.out.println("Answer 0 to increase by percentage");
            System.out.println("Answer 1 to increasy by the real amount");
            increaseType = sc.nextInt();

            if(increaseType == 0){
                System.out.print("Which percentage to increase the salary? ");
                double percentage = sc.nextDouble();
                emp.increaseSalaryByPercentage(percentage);

                System.out.println("updated data: ");
                System.out.println("New's Employee's gross Salary: "+ emp.grossSalary);
            } else if (increaseType == 1){
                System.out.print("Which amount would you like to increase in his salary? ");
                double amount = sc.nextDouble();
                emp.increaseSalaryByValue(amount);

                System.out.println("updated data: ");
                System.out.println("New's Employee's gross Salary: "+ emp.grossSalary);
            }
        };

        System.out.println("Final data: ");
        System.out.println("Employee's Name: "+ emp.name);
        System.out.println("Employee's net Salary: "+ emp.netSalary());
        System.out.println("This employee has " + emp.tax + "% of tax in his gross Salary.");
        sc.close();
    }
}

