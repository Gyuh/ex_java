package codeground;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class programing_contest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int TC;
		int test_case;
		int N;
		
		TC = sc.nextInt();
		
		for (test_case = 1; test_case <= TC; test_case++) {
			int cnt=0;
			
			N=sc.nextInt();
			
			int[] temp = new int[N];
			int[] temp1 = new int[N];
			for(int i=0;i<N;i++){
				temp[i]=sc.nextInt();
			}
			Arrays.sort(temp);
			for(int i=0;i<N;i++){
				temp1[i]=temp[i];
				temp1[i]=temp1[i]+N-i;
			}
			
			for(int i=0;i<N;i++){
				if((temp[i]+N>temp1[i])||temp[i]+N==temp1[i]){
					cnt++;
				}	
			
			}
			System.out.println("Case #" + test_case);
			System.out.println(cnt);
		}
		
	}

}
