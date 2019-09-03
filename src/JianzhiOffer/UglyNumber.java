package JianzhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UglyNumber {

	public static void main(String[] args) {
		UglyNumber u = new UglyNumber();
		System.out.println(u.GetUglyNumber_Solution(7));
	}
	
	public int GetUglyNumber_Solution(int index) {
		if(index<1) throw new RuntimeException("输入有误");
		if(1<=index&&index<7) return index;
		int p2 =0,p3=0,p5=0;
		int newNumber = 1;
		List<Integer> re = new LinkedList<>();
		re.add(newNumber);
		while(re.size()<index) {
			newNumber = Math.min(re.get(p2)*2, Math.min(re.get(p3)*3, re.get(p5)*5));
			if(re.get(p2)*2==newNumber) p2++;
			if(re.get(p3)*3==newNumber) p3++;
			if(re.get(p5)*5==newNumber) p5++;
			re.add(newNumber);
		}
        return newNumber;
    }
}
