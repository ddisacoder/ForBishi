package Pingduoduo;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int N = sc.nextInt(); int K = sc.nextInt();
			if(N==1){
				System.out.println(0);
			}else{
				int time = 0;int num = 1;
				while(Math.pow(2, time)<=K && num<N){
					time++;
					num*=2;
				}
				if(num>=N) System.out.println(time);
				else{
					while(num<N){
						time++;
						num+=K;
					}
					System.out.println(time);
				}			
			}
		}
	}
}
