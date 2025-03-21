package com.arrayprograms.demos;

public class OneDimArray {

	public static void main(String[] args) {

		int [] marks = new int[4];
		marks[0]=90;
		marks[1]=80;
		marks[2]=70;
		marks[3]=90;
		
		int sum=0;
		
		for(int i=0;i<marks.length;i++){
			sum+=marks[i];
		}
		System.out.println("Sum "+sum);
		
		//marks[4]=100; // throws AIIOBs exception
		
		for(int var:marks){
			System.out.println(var);
		}
		
		
		
		
		
		
		
		
		
	}

}
