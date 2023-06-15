public class Reverse
{
    public static void main(String[] args)
    {
        int A [] = {0,1,2,3,4,5,6,7,8,9};
        int n=A.length-1;
        for(int i=0,j=n;((i<=(n/2))&&(j>=(n/2)+1));i++,j--)
        {
            int tmp=A[i];
            A[i]=A[j];
            A[j]=tmp;
        }
        for(int i=0;i<=n;i++)
        System.out.println(A[i]);
    }
}