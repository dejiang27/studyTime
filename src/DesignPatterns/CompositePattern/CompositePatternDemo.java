package DesignPatterns.CompositePattern;

public class CompositePatternDemo {
    public static void main (String[] args)
    {
        Developer dev1 = new Developer(100, "Lokesh Sharma", "Pro Developer");
        Developer dev2 = new Developer(101, "Vinay Sharma", "Developer");
        Company engDirectory = new Company();
        engDirectory.addEmp(dev1);
        engDirectory.addEmp(dev2);

        Manager man1 = new Manager(200, "Kushagra Garg", "SEO Manager");
        Manager man2 = new Manager(201, "Vikram Sharma ", "Kushagra's Manager");

        Company accDirectory = new Company();
        accDirectory.addEmp(man1);
        accDirectory.addEmp(man2);

        Company directory = new Company();
        directory.addEmp(engDirectory);
        directory.addEmp(accDirectory);
        directory.showEmployeeDetails();
    }

}
