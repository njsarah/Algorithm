package com.Algorithm.DynamicPro;

public class DynamicProgramming {
	public double getMaxiumContinuousMulti(double[] data)
	{
		double maxEnd = data[0];
		double minEnd = data[0];
		double maxResult = data[0];
		for(int i=1;i<data.length;i++)
		{
			double end1 = maxEnd*data[i];
			double end2 = minEnd*data[i];
			maxEnd = Math.max(Math.max(end1, end2), data[i]);
			minEnd = Math.min(Math.min(end1, end2), data[i]);
			maxResult = Math.max(maxResult, maxEnd);
		}
		return maxResult;
	}
	public boolean isInterLeave(String s1,String s2,String s3)
	{
		int n = s1.length();
		int m = s2.length();
		int s = s3.length();
		if(n+m!=s)
			return false;
		boolean[][] dp = new boolean[n+1][m+1];
		dp[0][0] =true;
		for(int i=0;i<n+1;i++)
		{
			for(int j=0;j<m+1;j++)
			{
				if(dp[i][j] || (i - 1 >= 0 && dp[i - 1][j] == true &&
						//È¡s1×Ö·û
						s1.charAt(i - 1) == s3.charAt(i + j - 1)) ||

						(j - 1 >= 0 && dp[i][j - 1] == true &&
						//È¡s2×Ö·û
						s2.charAt(j - 1) == s3.charAt(i + j - 1)) )

						dp[i][j] = true;
					else
						dp[i][j] = false;
			}
		}
		for(int i=0;i<n+1;i++)
		{
			for(int j=0;j<m+1;j++)
			{
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
		return dp[n][m];
	}

}
