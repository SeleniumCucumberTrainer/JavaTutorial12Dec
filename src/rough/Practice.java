package rough;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {

	public static void main(String[] args) {

       int[] a ={14,-6,4,5,7,10};
       
        int secondMax =0;
        int firstMax =a[0];
        
        for(int i=0;i<a.length;i++){
        	
        	if(firstMax<a[i]){
        		
        		secondMax =firstMax;
        		firstMax=a[i];
        		
        	}
        	
        	
        }
        
        
        System.out.println(firstMax+" "+secondMax);		

	}
	
	

}
