import cie.*;
import see.*;
import java.util.*;
class total{
    public static void main(String args[]) {
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        int total[]=new int[5];
        System.out.println("Enter number of students: ");
        n=sc.nextInt();
        cie.student s[]=new cie.student[n]; 
        cie.internals ci[]=new cie.internals[n];
        see.externals se[]=new see.externals[n];
        for(i=0;i<n;i++)
        {
            System.out.println("\nEnter student "+(i+1)+" details");
            s[i]=new cie.student();
            s[i].accept();
            ci[i]=new cie.internals();
            ci[i].accept();
            se[i]=new see.externals();
            se[i].accept();
        }
        for(i=0;i<n;i++)
        {
            System.out.println("\nDetails of student "+(i+1));
            s[i].display();
            for(j=0;j<5;j++)
            {
                total[j]=ci[i].ciem[j]+se[i].seem[j];
                System.out.println("Total marks in subject "+(j+1)+": "+total[j]);
            }
            System.out.println();
        }
    }
}
