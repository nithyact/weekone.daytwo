package weekone.day2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class finddup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {36,45,78,66,66,98,45,80,45,35,80,35,40,20,36,40,10,30};
				int count=0;
				Arrays.sort(height);
				for(int i=0;i<height.length-1;i++)
				{
					if(height[i] == height[i+1]) {
						System.out.println(" the duplicate num >> " +height[i]);	
					}
					count++;
					
				
					
				}
		
		}

	}


