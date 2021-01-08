/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner scan=new Scanner(System.in);
	   int n=scan.nextInt();
	   while(n--!=0){
	       int size1=scan.nextInt();
	       int size2=scan.nextInt();
	       int[] arr1=new int[size1];
	       int[] arr2=new int[size2];
	       int sum1=0,sum2=0;
	       for(int i=0;i<size1;i++){
	           arr1[i]=scan.nextInt();
	           sum1+=arr1[i];
	       }
	       for(int i=0;i<size2;i++){
	           arr2[i]=scan.nextInt();
	           sum2+=arr2[i];
	       }
	       if(sum1>sum2){
	           System.out.println(0);
	           continue;
	       }
	       Arrays.sort(arr1);
	       Arrays.sort(arr2);
	       int count=0;
	       int j=size2-1;
	       for(int i=0;i<size1;i++){
	           sum1=sum1-arr1[i];
	           sum2=sum2-arr2[j];
	           sum1=sum1+arr2[j];
	           sum2=sum2+arr1[i];
	           count++;
	           j--;
	           if(sum1>sum2 || j<0){
	               break;
	           }
	       }
	       if(sum1>sum2){
	           System.out.println(count);
	       }else{
	           System.out.println(-1);
	       }
	   }
	}
}
