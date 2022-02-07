package com.xyz;

public class Day2_11 {
	public static void main(String[] args) {
        first:
        for( int i = 1; i < 5; i++) {
            second:
            for(int j = 1; j < 3; j ++ ) {
                System.out.println("i = " + i + "; j = " +j);
                if ( i == 2)
                    break first;
            }
        }
    }

}
