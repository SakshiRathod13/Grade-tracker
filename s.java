import java.util.*;



public class s {

    public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=0;


      List l=new ArrayList();
      int max=0;
      int min=-1;
      for(int i=0;i<n;i++){
        int c=sc.nextInt();
        l.add(c);
        sum=sum+c;
        if(c>max){
          max=c;
        }
        if(c<min){
          min=c;
        }
      }
      int avg=sum/n;

  
      
      System.out.println(max);
      System.out.println(avg);
      System.out.println(min);
    }
  }
  