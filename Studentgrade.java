//TASK-2
import java.util.*;
public class studentgrade{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s1,s2,s3,t;
        System.out.println("Enter Subject1:");
        s1=sc.nextInt();
        System.out.println("Enter Subject2:");
        s2=sc.nextInt();
        System.out.println("Enter Subject3:");
        s3=sc.nextInt();
        t=(s1+s2+s3);
        double p=(double)(t * 100)/300;
        System.out.println("Total:"+t);
        System.out.println("Percentage:"+p);
        System.out.println("Grade:");
        if(p>=95){
            System.out.println("O");
        }else if(p<95 && p>=90){
            System.out.println("A+");
        }else if(p<90 && p>=85){
            System.out.println("A");
        }else if(p<85 && p>=80){
            System.out.println("B+");
        }else if(p<80 && p>=70){
            System.out.println("B");
        }else if(p<70 && p>=60){
            System.out.println("c+");
        }else if(p<60 && p>=50){
            System.out.println("C");
        }else{
            System.out.println("F");
        }
    }
}

/*Enter Subject1:
76
Enter Subject2:
52
Enter Subject3:
45
Total:173
Percentage:57.666666666666664
Grade:
C */
