/*Q. Write a program to create a class (Employee) with the information given below.

1. emp_id
2. name
	1. first_name
	2. last_name
3. address
    1. area
    2. city
    3. state
4. salary
5. designation

Read and print the data by creating  Employee array
*/

import java.sql.SQLOutput;
import java.util.*;
class Address_emp {
    String area, city, state;

    public Address_emp(String area, String city, String state) {
        this.area = area;
        this.city = city;
        this.state = state;
    }
}
 class name_emp{
public String fname,lname;
    public name_emp(String fname,String lname)
    {
        this.fname=fname;
        this.lname=lname;
    }
}
    public class employee_data {
        int id;
        static name_emp name;
        int sal;
        String des;
        static Address_emp addi;


        public employee_data(int id, name_emp name, int sa, Address_emp add, String des) {
            this.id = id;
            this.name = name;
            this.sal = sa;
            this.des = des;
            this.addi = add;

        }
//        @Override
//        public String toString() {
//            return "employee_data{" +
//                    "id=" + id +
//                    ", name=" + name +
//                    ", sal=" + sal +
//                    ", des='" + des + '\'' +
//                    ", add=" + add +
//                    '}';


 //   class main1{

public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number of empolyee:");
    int n=s.nextInt();
    int id;
    int sa;
    String fname,lname,area,city,state,des;

    Address_emp add[]=new Address_emp[n];
    name_emp nam[]=new name_emp[n];
    employee_data employee[]=new employee_data[n];
    for (int i = 0; i <n; i++) {
        System.out.println("\n\nEmployee "+(i+1)+"\n");
        System.out.println("Enter the ID of employee:");
        id=s.nextInt();
        System.out.println("Enter the First name of employee:");
        fname=s.next();
        System.out.println("Enter the last name of the empolyee:");
        lname=s.next();
        System.out.println("Enter the area name:");
        area=s.next();
        System.out.println("Enter the city name:");
        city=s.next();
        System.out.println("Enter the state name:");
        state=s.next();
        System.out.println("Enter the salary of employee:");
        sa=s.nextInt();
        System.out.println("Enter the designation:");
        des=s.next();
        add[i]=new Address_emp(area,city,state);
        nam[i]=new name_emp(fname,lname);
        employee[i]=new employee_data(id,nam[i],sa,add[i],des);


    }
    for (int i = 0; i <n ; i++) {
        System.out.println("\n\nEmployee "+(i+1)+"\n");
        System.out.println("The Employee ID:"+employee[i].id);
        System.out.println("Name of the employee:");
        System.out.println(nam[i].fname+" "+nam[i].lname);

        System.out.println("the address(area,city,state):-");
        System.out.println(add[i].area+" "+add[i].city+" "+add[i].state);
        System.out.println("The salary:-");
        System.out.println(employee[i].sal);
        System.out.println("The Designation of the employee:");
        System.out.println(employee[i].des);
    }

    }
}

