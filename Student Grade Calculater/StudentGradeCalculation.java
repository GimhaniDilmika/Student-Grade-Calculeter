import java.util.*;
 class StudentGradeCalculation {

    public static void main(String[] arg){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Number of Subject:");
        int num=input.nextInt();
        System.out.println();
        double total=0;
        for( int i=0;i<num;i++){
            System.out.print("Enter the Subject "+(i+1)+ "  Marks:"); 
             int marks = input.nextInt();
             total+=marks;
            }
            double average= total/num;
            char grade;
            if(average>75){
                grade='A';

            }
            else if(average>65){
                grade='B';

            }else if(average>55){
                grade='C';
                
            }else if(average>35){
                grade='S';
                
            }
            else{
                grade='F';
            }
            System.out.println();
            System.out.println("Totale:"+total);
            System.out.println("Average:"+average+"%");
            System.out.println("Your Grade is:"+grade);
    }
}