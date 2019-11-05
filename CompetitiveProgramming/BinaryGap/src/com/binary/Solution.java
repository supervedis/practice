package com.binary;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 561892;
		Solution sol = new Solution();
		System.out.println(sol.solution(num));

	}

	   public int solution(int N) {
	        // write your code in Java SE 8
	        char[] binary = decimalToBinary(N).toCharArray();
	        int counter1 = 0;
	        int counter2 = 0;
	        for(int i=0; i<binary.length; ++i){
	            if(binary[i] == '1'){
	            	
	                if(counter1 > counter2){
	                    counter2 = counter1;
	                    counter1 = 0;
	                }else
	                	counter1 = 0;
	                
	            }else{
	                counter1 += 1;
	            }
	        }
	        
	        return counter2;
	    }
	    
	    
	    private String decimalToBinary(int n){
	        StringBuffer sb = new StringBuffer();
	        int r = 0;
	        while(n>0){
	            r = n%2;
	            sb.append(r);
	            n = Math.floorDiv(n,2);
	        }
	        
	        return sb.reverse().toString();
	    }
}
