
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        int n;
        int z;
        int t=in.nextInt();
        for(int i=0;i<t;i++){
             a = in.nextInt();
             b = in.nextInt();
             n = in.nextInt();
            for(int j=0;j<n;j++)
            {
                a =a+ b * (int) Math.pow(2, j);
                System.out.print(a + " ");
            }
             System.out.println();
        }
    in.close();
    }

}
