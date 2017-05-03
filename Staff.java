import java.io.*;
public class Staff{
    public String name;
    private double salary;
    public Staff(String empName){
        name = empName;
    }
    public void setSalary(double empSalary){
        salary = empSalary;
    }
    public void printEmp(){
        System.out.println("name:"+ name);
        System.out.println("Salary:"+ salary);
    }
    public static void main(String args[]){
        Staff empOne = new Staff("kang");
        empOne.setSalary(2000);
        empOne.printEmp();
    }
}

/*$ javac Employee.java
$ java Employee
名字 : RUNOOB
薪水 : 1000.0*/

