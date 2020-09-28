package com.swapnil.streamapi;

import java.util.Comparator;

public class Lambdas {
    public static Comparator<Employee> ageLambda = (e1, e2) -> e1.getAge() - e2.getAge() ;
    public static Comparator<Employee> reverseSalaryLambda = (e1, e2) -> Long.compare(e2.getSalary(), e1.getSalary()) ;
    public static Comparator<Employee> levelLambda = (e1, e2) -> Character.compare(e1.getLevel(), e2.getLevel()) ;
}
