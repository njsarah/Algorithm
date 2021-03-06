package com.Algorithm.String;

public class FullyArranged {
//	public void swap()
	public String nextPermutation(String text)
	{
		char[] arrays = text.toCharArray();
		int len = arrays.length;
		int pos = 0;//pos代表最后一个升序的位置
		int index = 0;//index代表pos之后的最后一个比arrays[pos]大的位值
		boolean result = false;
		for(int i=0;i<len-1;i++)
		{
			if(arrays[i]<arrays[i+1])
			{
				pos = i;
				result = true;
			}
		}
		if(result==false)
		{
			return text;
		}
		index = pos+1;
		for(int j = pos+1;j<len;j++)
		{
			if(arrays[index]>arrays[j])
			{
				index = j;
			}
		}
		char temp = arrays[pos];
		arrays[pos] = arrays[index];
		arrays[index] = temp;
//		swap(arrays,arrays[pos],arrays[index]);
//		reverse(arrays,pos+1,arrays.length);
		int first = pos+1;
		int last = len-1;
		while(first<last)
		{
			char temp1 = arrays[first];
			arrays[first] = arrays[last];
			arrays[last] = temp1;
			first++;
			last--;
		}
		String content = "";
		for(char ch:arrays)
		{
			content+=ch;
		}
		return content;
	}

}
