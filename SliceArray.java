package todo;

import java.util.ArrayList;
import java.util.List;

public class SliceArray {
	
	public static void main(String args[]) {
		//int[] arr = {0,1,0,0,1,1}; // [(0,1),(0,1,0),(0,1,0,0))], [(1,0),(1,0,0),], [0,0,1], [0,1], [1], [1]
		int[] arr = {0,1,2,2,1,1,2}; // [(0,1,2)], [(1,2)], [2,1], [1,2]
		System.out.println(returnCount(arr));
	}
	
	private static int returnCount(int[] arr) {
		
		int arrTotal = 0;
		for(int i = 0; i< arr.length; i++) {
			arrTotal = arrTotal +arr[i];
		}
		
		int retCount = 0;
		for(int i = 0; i< arr.length; i++) {
			boolean found = false;
			int sum = arr[i];
			if(sum == arrTotal/3) {
				found = true ;
			}
			
			for(int j = i+1; j< arr.length ; j++) {
				sum = sum + arr[j];
				if(sum == arrTotal/3) {
					found = true ;
				}
			}
			if(found) {
				retCount = retCount+1;
			}
		}
		return retCount;
	}

}
