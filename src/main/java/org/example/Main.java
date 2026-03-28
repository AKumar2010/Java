package org.example;

import lombok.Data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
@Data
public class Main {
    static Map<Integer,Employee> emp= new HashMap();

    static class Employee{
        String name, department;
        int id, salary;

        Employee(String name, String department, int id, int salary){
            this.name=name;
            this.department=department;
            this.id=id;
            this.salary=salary;
        }
        String getname(){
            return name;
        }

    }

    static void createdata(){
        Employee e = new Employee("anil","hr",2,2000);
        emp.put(2,e);
        Employee e1 = new Employee("anila","hra",3,20200);
        emp.put(3,e1);
        Employee e2 = new Employee("anili","hrs",4,2200);
        emp.put(4,e2);
        Employee e3 = new Employee("anily","hrt",5,2400);
        emp.put(5,e3);
    }
    public static void main(String[] args) {
        //Code prc= new Code();
        //prc.setValue("new valueee");
        //System.out.println("Added value is :" + prc.reverseWithSpace("today is another day but raining"));
        //System.out.println("Added value is :" + prc.getsumFromString("jbjb7yndk4bjjf80IHFU98"));
        //System.out.println("Added value is :" + prc.fibonaci(7));
        //System.out.println("Added value is :" + prc.chkAnagram("abhishek",""));
        Main.createdata();
        //createdata();
        String form=String.format("going to execute employee data %s", emp.get(2).getname());
        System.out.println("Data for employee with id is: "+form);
        System.out.println("entryset is "+emp.entrySet());
        System.out.println("keyset is "+emp.keySet());
        System.out.println("value is "+emp.values());
        Map.Entry<Employee,Integer> ety;
        emp.entrySet();
        Iterator <Integer> st=emp.keySet().iterator();
        Iterator<Map.Entry<Integer, Employee>> str=emp.entrySet().iterator();
        while(st.hasNext()){
            System.out.println(st.next());
        }
        for(Employee employee:emp.values()){
            System.out.println("Emaployee Name is: "+employee.getname());
        }

    }
}