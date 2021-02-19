import java.util.*;
import java.lang.*;
import java.io.*;
public class Depth
{
  static String r=" ";
  public static void dfs(int v,int adj[][],int vis[]) 
  {
    vis[v]=1;
    for(int i=0;i<vis.length;i++)
     {
        if(adj[v][i]==1 && vis[i]==0)
           {
              r+="-->"+i;
              dfs(i,adj,vis);
            }
      }
   }
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println(" enter the no of nodes:");
  int n=sc.nextInt();
  int adj[][]=new int [n][n]; 
  int vis[]=new int[n];
  System.out.println("enter the adj acess matrix:");
  for(int i=0;i<n;i++)
       for(int j=0;j<n;j++)
             adj[i][j]=sc.nextInt();
       r+=0;
       dfs(0,adj,vis);
       System.out.println(r);
}
}
  
