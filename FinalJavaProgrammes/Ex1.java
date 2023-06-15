import java.util.*;
public class Gpa
{
    public static double[] calculateGPA( char[][] studentsGrades) 
    {
        int tmp [][]= new int [4][4],c=0;
        char grade;
        double gpa[]=new double[4];
    for(int i=0;i<studentsGrades.length;i++)
    {
        for(int j=0;j<studentsGrades[0].length;j++)
        {
            grade=studentsGrades[i][j];
            switch(grade)
            {
                case 'A':
                   tmp[i][j]=4;
                   break;
                case 'B':
                    tmp[i][j]=3;
                    break;
                case 'C':
                    tmp[i][j]=2;
                    break;
                default:
                    tmp[i][j]=0;
                    break;
            }
        }
    }
    for(int i=0;i<studentsGrades.length;i++)
    {
        int sum=0;
        for(int j=0;j<studentsGrades[0].length;j++)
        {
            sum=sum+tmp[i][j];
        }
        sum=sum/4;
        gpa[c++]=sum;
    }
        return gpa;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        double gpa[] = new double [4];
        char grade [][] = new char [4][4];
        for(int i=0;i<4;i++)
        {
            System.out.println("Enter the Grades of "+i+" th Student\n");
            for(int j=0;j<4;j++)
            {
                grade[i][j]=s.next().charAt(0);
            }
        }
        gpa=calculateGPA(grade);
        for(int i=0;i<gpa.length;i++)
        System.out.println(gpa[i]);
    }
}