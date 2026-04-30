package Revision.Day2;

public class main {
     static void main() {
     int [] arr=new int [10];//Size of an Array
         arr[0]=77;
         arr[1]=96;
         arr[2]=66;
         arr[3]=47;
         arr[4]=61;
         arr[5]=62;
         int ans=0;
         for (int i=0;i<arr.length;i++) {
             ans=Math.max(ans,arr[i]);
         }
         System.out.println(arr.length);
         System.out.println(ans);

    }
}
