import java.util.*;
import java.lang.*;
class Knapsack
{
  static int max(int a,int b)
   {
     return(a>b)?a:b;
    }
  static int Knapsack(int w,int wt[],int p[],int n)
   {
     if(n==0||w==0)
        return 0;
     if(wt[n-1]>w)
        return Knapsack(w,wt,p,n-1);
     else 
        return max(p[n-1]+Knapsack(w-wt[n-1],wt,p,n-1),Knapsack(w,wt,p,n-1));
   }
public static void main(String args[])
{ 
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the required number");
    int n=sc.nextInt();
    int p[]=new int[n];
    System.out.println("enter the profits");
    for(int i=0;i<n;i++)
        p[i]=sc.nextInt();
    int wt[]=new int[n];
    System.out.println("enter the weights");
    for(int j=0;j<n;j++)
        wt[j]=sc.nextInt();
    System.out.println("enter the weight of the Knapsack");
    int w=sc.nextInt();
    System.out.println("Profit of the Kanpsack");
    System.out.println(Knapsack(w,wt,p,n));
}
}
