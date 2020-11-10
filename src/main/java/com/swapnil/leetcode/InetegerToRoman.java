package com.swapnil.leetcode;

import java.util.Scanner;

/*
 * @created 11/8/2020 - 11:09 PM
 * @author Swapnil Kharche
 *
 * Convert input integer to roman number. Note:: Roman numbers cannot be greater than 4000.
 *
 *    Symbol       Value
 *    I             1
 *    V             5
 *    X             10
 *    L             50
 *    C             100
 *    D             500
 *    M             1000
 */
public class InetegerToRoman {
    public static void main(String[] args) {
        System.out.print("Enter Number:: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String romanNumber = convertIntegerToRoman(num);
        System.out.println("Roman Number:: " + romanNumber);

    }

    private static String convertIntegerToRoman(int num) {
        String[] M = {"","M","MM","MMM"}; // to store 1000,2000,3000
        String[] C = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"}; // to store 100 - 900
        String[] X = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"}; // to store 10 - 90
        String[] I = {"","I","II","III","IV","V","VI","VII","VIII","IX"}; // to store 1 -9
        return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[(num%10)];
    }
}
