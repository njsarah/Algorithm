package com.Algorithm.String;
//回文字符串类
public class Palindrome {
	//验证字符串是不是回文字符串；左右两侧开始比较
	public boolean isPalindrome(String content)
	{
		int left = 0;
		int right = content.length()-1;
		while(left<right)
		{
			if(content.charAt(left)==content.charAt(right))
			{
				left++;
				right--;
			}
			else
			{
				return false;
			}
		}
		return true;
	}
	public boolean isPalindromeFunction2(String content)
	{
		int len = content.length();
		int left = 0;
		int right = 0;
		if(len%2==0)
		{
			left = len/2-1;
			right = len/2;
		}
		else
		{
			left = len/2-1;
			right = len/2+1;
		}
		while(left>=0 && right<len)
		{
			if(content.charAt(left)==content.charAt(right))
			{
				left--;
				right++;
			}
			else
			{
				return false;
			}
		}
		return true;
	}
	//寻找回文字符串的最大长度
	public int LongestPalindrome(String content)
	{
		
		//最大值
		int maxLen = 0;
		//maxRight是以ID为圆点的最大右边界
		int id = 0;
		int maxRight = 0;
		int len = content.length();
		char[] ch = new char[2*len+3];
		int[] p = new int[2*len+3];
		//构造奇数字符串
		ch[0]='$';
		for(int i=0;i<len;i++)
		{
			ch[2*i+1] = '#';
			ch[2*(i+1)] = content.charAt(i);
		}
		ch[2*len+1] = '#';
		ch[2*len+2] = '\0';
		//
		for(int i = 1;i<ch.length-1;i++)
		{
			if(i<maxRight)
			{
				p[i] = Math.min(maxRight-i, p[2*id-i]);
			}
			else
			{
				p[i] = 1;
			}
			while(ch[i+p[i]]==ch[i-p[i]])
			{
				p[i]+=1;
			}
			if(i+p[i]>maxRight)
			{
				maxRight = i+p[i];
				id = i;
			}
			maxLen = Math.max(maxLen, p[i]);
		}
		return maxLen-1;
	}

}
