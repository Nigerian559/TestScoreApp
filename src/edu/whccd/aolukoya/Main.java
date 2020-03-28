package edu.whccd.aolukoya;

import java.util.Scanner;

/*
The purpose of this application is to replicate the code in Figure 2-18
author:         Alex Olukoya
 */
public class Main {

    public static void main(String[] args) {
	System.out.println("Enter test scores that range from 0 to 100");
	System.out.println("To end the program, enter 999");
	System.out.println();

	int scoreTotal = 0;
	int scoreCount = 0;
	int testScore = 0;
	Scanner sc = new Scanner(System.in);

	while (testScore <= 100) {
	    System.out.print("Enter score:  ");
	    testScore = sc.nextInt();

	    if (testScore <= 100) {
	        scoreCount = scoreCount + 1;
	        scoreTotal = scoreTotal + testScore;
        }
    }
	double averageScore = (double) scoreTotal / scoreCount;
	String message = "\n"
            + "Score count:     " + scoreCount + "\n"
            + "Score total:     " + scoreTotal + "\n"
            + "Average score:   " + averageScore + "\n";
	System.out.print(message);
    }
}
