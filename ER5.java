
import java.util.Scanner;
import java.util.Arrays;
public class ER5 {
   public static void main(String args[])
   {
    Scanner Sc=new Scanner(System.in);
       System.out.println("Enter number of Friends");
      int N= Sc.nextInt();
int A[]={1,2,3,4,5,6,7,8,9,10};
int B[]={0,0,0,0,0,0,0,0,0,0};
int C[]={0,0,0,0,0,0,0,0,0,0};
for(int i=1;i<=N;i++)
{
   System.out.println("Enter your computer choice among 1,2,3,4,5,6,7,8,9,10");
   int X=Sc.nextInt();
   for(int j=0;j<10;j++)
   {
      if(X==A[j])
      {
      B[j]=B[j]+1;
      C[j]=B[j];
      }
   }
}
Arrays.sort(C);
int S=0,P=0;
for(int j=0;j<10;j++)
{
if(C[9]==B[j])
{
   S=S+1;
   P=j;
}
   }
   if(S==1)
   System.out.println("Most preferred Laptop is "+ A[P]);
   else
   System.out.println("Confused");
Sc.close();
}}
