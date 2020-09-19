/*
*
* ката про вывод следюющего корня
*
*/


package com.sqrt;

public class NumberFun {
    public static void main(String[] args) {
        long sqrt = findNextSquare(104);
        System.out.println(sqrt);
    }


    public static long findNextSquare(long sq) {
        if(sq != Math.floor(Math.sqrt(sq)) * Math.floor(Math.sqrt(sq))){
            return -1;
        }
        double tmp = Math.sqrt(sq);
        tmp++;
        return Math.round(tmp*tmp);
    }
}
