package com.Algorithm.Seek;

public class SeekAlgorithm {
	public int BinarySearch(int[] data,int element)
	{
		int low = 0;
		int high = data.length-1;
		int mid; 
		while(low<=high)
		{
			mid = low+((low+high)>>1);
			if(data[mid]<element)
			{
				low = mid+1;
			}else if(data[mid]>element)
			{
				high = mid-1;
			}
			else
			{
				return mid;
			}
		}
		return -1;
	}
}
