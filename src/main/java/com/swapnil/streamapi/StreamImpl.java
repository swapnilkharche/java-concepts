package com.swapnil.streamapi;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class StreamImpl {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Employee e1 = new Employee("Tom", 28, 75000, 'B');
        Employee e2 = new Employee("Harry", 30, 100000, 'C');
        Employee e3 = new Employee("Don", 32, 1200000, 'D');
        Employee e4 = new Employee("Kevin", 25, 78000, 'A');
        Employee e5 = new Employee("Harry", 28, 76000, 'A');

        List<Employee> list = new ArrayList<Employee>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        //Print names of all the employees in capital letters
        System.out.println("Print names of employees in capital letters");
        printEmpNamesCapital(list);

        //sort employees in decending order of age
        System.out.println("\nEmployees in ascending order of Age: ");
        sortEmpAge(list);

        //order employees in reverse order of salary
        System.out.println("\nEmployees in descending order salary: ");
        sortSalaryReverseAge(list);

        //order employee on level basis
        System.out.println("\nEmployees in ascending order of level");
        sortAscendingEmpLevel(list);


    }

    private static void sortAscendingEmpLevel(List<Employee> list) {
        list.stream()
                .sorted(Lambdas.levelLambda)
                .forEach(x -> System.out.println(x));
    }

    private static void sortSalaryReverseAge(List<Employee> list) {
        list.stream()
                .sorted(Lambdas.reverseSalaryLambda)
                .forEach(System.out::println);
    }

    private static void sortEmpAge(List<Employee> list) {
        list.stream()
                .sorted(Lambdas.ageLambda)
                .forEach(System.out::println);
    }

    public static void printEmpNamesCapital(List<Employee> list) {
        list.stream()
                .map(x -> x.getName().toUpperCase())
                .forEach(System.out::println);
    }

}
