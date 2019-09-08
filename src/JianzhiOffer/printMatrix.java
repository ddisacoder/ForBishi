package JianzhiOffer;

import java.util.ArrayList;


public class printMatrix {

	static ArrayList arrlist = new ArrayList();
    public ArrayList<Integer> printMatrix_(int [][] matrix) {
    	int tR = 0;
    	int tC = 0;
    	int dR = matrix.length - 1;
    	int dC = matrix[0].length - 1;
    	while(tR <= dR && tC <= dC){
    		if(tR == dR){
        		for(int i = tC;i <= dC;i++){
        			arrlist.add(matrix[tR][i]);
        		}
        	}
        	else if(tC == dC){
        		for(int i = tR;i <= dR;i++){
        			arrlist.add(matrix[i][tC]);
        		}
        	}
        	else{
        		int currR = tR;
        		int currC = tC;
        		while(currC!=dC){
        			arrlist.add(matrix[tR][currC]);
        			currC++;
        		}
        		while(currR!=dR){
        			arrlist.add(matrix[currR][dC]);
        			currR++;
        		}
        		while(currC!=tC){
        			arrlist.add(matrix[dR][currC]);
        			currC--;
        		}
        		while(currR!=tR){
        			arrlist.add(matrix[currR][tC]);
        			currR--;
        		}
        	}
    		tR++;tC++;dR--;dC--;
    	}
    	return arrlist;
    }
    
    public static void printHelper(int[][] m,int tR,int tC,int dR,int dC){
    	if(tR == dR){
    		for(int i = tC;i <= dC;i++){
    			arrlist.add(m[tR][i]);
    		}
    	}
    	else if(tC == dC){
    		for(int i = tR;i <= dR;i++){
    			arrlist.add(m[i][tC]);
    		}
    	}
    	else{
    		int currR = tR;
    		int currC = tC;
    		while(currC!=dC){
    			arrlist.add(m[tR][currC]);
    			currC++;
    		}
    		while(currR!=dR){
    			arrlist.add(m[currR][dC]);
    			currR++;
    		}
    		while(currC!=tC){
    			arrlist.add(m[dR][currC]);
    			currC--;
    		}
    		while(currR!=tR){
    			arrlist.add(m[currR][tC]);
    			currR--;
    		}
    	}
    }
}
