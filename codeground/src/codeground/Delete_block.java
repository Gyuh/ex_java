package codeground;


import java.util.Scanner;

public class Delete_block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int TC;
		int test_case;
		int N;
		
		TC = sc.nextInt();        
		for(test_case = 1; test_case <= TC; test_case++) {
			int cnt = 0;
			int sum=0;
			
			N=sc.nextInt();
			cnt=N;
			int[] temp = new int[N];
			int[] change = new int[N];
			for(int i=0;i<N;i++){
				temp[i]=sc.nextInt();
			} 
			while(sum==0)
			{
			for(int i=0;i<N;i++){
				if(i==0||i==N-1){
					change[0]=0;
					change[cnt-1]=0;
					continue;
				}
				if(temp[i]==1){
					change[i]=0;
					continue;
				}
				else if(temp[i-1]==1||temp[i+1]==1){
					change[i]=1;
					continue;
				}
				else if(temp[i-1]==temp[i]&&temp[i]==temp[i+1]){
					change[i]=temp[i]-1;
					continue;
				}
				else{
					change[i]=temp[i]-(Math.abs(temp[i]-temp[i-1])+Math.abs(temp[i]-temp[i+1]));
				}
			}
			
			for(int i=0;i<N;i++){
				temp[i]=change[i];
				sum+=temp[i];
			}
				
			
			}
			System.out.println("Case #" + test_case);
		}
		sc.close();
	}
	
		
	}

