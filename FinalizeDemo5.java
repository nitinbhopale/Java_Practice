import java.util.ArrayDeque;

class Employee implements Cloneable
{
    public String name;
    public int Salary;
    public int Age;
    public String Address;

    Employee(String str, int amount, int A, String addr)
    {
        this.name = str;
        this.Salary = amount;
        this.Age = A;
        this.Address = addr;
    }
    void Display()
    {
        System.out.println("Employee Name : "+this.name);
        System.out.println("Employee Age : "+this.Age);
        System.out.println("Employee Salary : "+this.Salary);
        System.out.println("Employee Address : "+this.Address);
    }

    public String toString()
    {
        return name+" "+Salary+" "+Age+" "+Address;
    }

   
}

public class FinalizeDemo5
{
    public static void main(String args[]) 
    {
       
        Employee eobj1 = new Employee("Amit",78000,28,"Karve Road Pune");
       
        System.out.println(eobj1); // it calls toString method internally


    }
}


