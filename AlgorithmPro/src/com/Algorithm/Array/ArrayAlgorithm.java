package com.Algorithm.Array;

public class ArrayAlgorithm {
	
	//������С��K����
	public void quickSelect(int[] data,int k,int Rleft,int Rright)
	{
		int key = data[Rleft];
		int left = Rleft;
		int right = Rright-1;
		while(left<right)
		{
			while(left<right&&key<data[right]) right--;
			if(left<right)
			{
				data[left]=data[right];
			}
			
			while(left<right&&key>data[left]) left++;
			if(left<right)
			{
				data[right] = data[left];
			}
		}
		data[right] = key;
		if(right+1>k)
		{
			quickSelect(data,k,Rleft,right);
		}else if(right+1<k)
		{
			quickSelect(data,k,right+1,Rright);
		}
		else
		{
			return;
		}
	}
	public int[] MinK(int[] data,int k)
	{
		quickSelect(data,k,0,data.length);
		int[] result = new int[k];
		for(int i=0;i<k;i++)
		{
			result[i] = data[i];
		}
		return result;
	}
	//���Һ�Ϊ��ֵ����,ʱ�临�Ӷ�O(N),���鶼�������
	public boolean TwoSum(int[] data,int sum)
	{
		int left = 0;
		int right = data.length-1;
		while(left<right)
		{
			int value = data[left]+data[right];
			if(value==sum)
			{
				return true;
			}
			else
			{
				if(value<sum)
				{
					left++;
				}
				else
				{
					right--;
				}
			}
		}
		return false;
	}
	public void swap(int[] data,int ele1,int ele2)
	{
		int temp = data[ele1];
		data[ele1] = data[ele2];
		data[ele2] = temp;
	}
	//�������죬�����н���0,1,2������ֵ������
	public void DuchTricolorFlag(int[] data)
	{
		int cur = 0;
		int begin = 0;
		int end = data.length-1;
		while(cur<=end)
		{
			if(data[cur]==1)
			{
				cur++;
			}else if(data[cur]==0)
			{
				swap(data,begin,cur);
				begin++;
				cur++;
				
			}
			else
			{
				swap(data,cur,end);
				end--;
			}
		}
	}

}
