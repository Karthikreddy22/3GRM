import java.lang.*;
import java.util.*;
class BinarySearch
{
 int  binary(int ar[],int x)
{
 int l=0,r=ar.length-1;
 while(l<=r)
  {
    int m=l+(r-1)/2;
    if(ar[m]==x)
     return m;
    if(ar[m]<x)
     l=m+1;
    else
      r=m-1;
  }
 return -1;
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
BinarySearch ob=new BinarySearch();
System.out.println("Enter no of elements");
int n=s.nextInt();
int ar[]=new int[n];
System.out.println("Enter the elements");
for(int i=0;i<n;i++)
ar[i]=s.nextInt();
System.out.println("Enter the search number");
int x=s.nextInt();
int r=ob.binary(ar,x);
if(r==-1)
 System.out.println("Element not present");
else
System.out.println("Element found at " +"index "+(r+1));
}
}
