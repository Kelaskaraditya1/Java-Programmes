import java.util.*;
public class Recursivefunctions 
{
    static int factorial(int n)
    {
        if((n==0)||(n==1))
        return 1;
        else
        return n*factorial(n-1);
    }
    static void binarysearch(int A[],int l,int h,int key)
    {
        int mid=(l+h)/2;
        if(A[mid]==key)
        System.out.println("The Key "+key+" is found at "+mid+" location\n");
        else
        {
            if(key<mid)
            binarysearch(A,l,mid-1,key);
            else if(key>mid)
            binarysearch(A,mid+1,h,key);
        }
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int A[]= new int[200];
        System.out.println("Enter your choice\n");
        int choice=s.nextInt();
        switch (choice)
        {
            case 1:
            System.out.println("Enter the number whose factorial is to be found\n");
            int num=s.nextInt();
            System.out.println("The value of "+num+"! is: "+factorial(num));
            break;
            case 2:
            System.out.println("Enter the no of elements\n");
            int no=s.nextInt(),n=no-1;
            System.out.println("Enter the elements\n");
            for(int i=0;i<no;i++)
            A[i]=s.nextInt();
            System.out.println("Enter the element to be found in the list");
            int key=s.nextInt();
            binarysearch((A), 0, n, key);
        }
    }
}
