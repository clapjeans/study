package baekjoon;

import java.util.Scanner;

public class baekjoon2439 {


		
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	
	for( int i=0;i<a;i++) {
			for(int j=0;j<a;j++) {
				if(j<a-i-1)
					System.out.print(" ");
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	
		
	}


