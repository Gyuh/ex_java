package dfs;

import java.util.*;

public class Main {
  static int N;
  static int count;
  static int[] chess= new int[15];
   public static boolean promising(int line) {
		// TODO Auto-generated method stub
		for(int i=0; i<line; i++){
			if(chess[i]==chess[line]||Math.abs(chess[line]-chess[i])==line-i)
				return false;
		}
		return true;
	}
   
   public static void nQueen(int line) {
		// TODO Auto-generated method stub
	   
		if(line == N-1){
			count++;
			return ;
		}
		
		for(int i=0;i<N;i++){
			chess[line+1]=i;
			if(promising(line+1)){
				nQueen(line+1);
			}
		}
	}
   
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        nQueen(-1);
        System.out.println(count);
    }
}