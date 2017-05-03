import java.io.*;
public class Employee{
    String name;
    int age;
    String desgination;
    double salary;
    public Employee(String name){
        this.name = name;
    }
    public void empAge(int empAge){
        age = empAge;
    }
    public void empDesigation(String empDesi){
        desgination = empDesi;
    }
    public void empSalary(double empSalary){
        salary = empSalary;
    }
    public void printEmployee(){
        System.out.println("name:"+ name);
        System.out.println("Age:"+ age);
        System.out.println("Desigation:"+ desgination);
        System.out.println("Salary:"+ salary);
    }
}