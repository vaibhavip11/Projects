import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("How many time do you want to play this game?");
      int n=sc.nextInt();
      int count1=0;
      int count2=0;
      for(int i=0;i<n;i++){
      char p1=sc.next().charAt(0);
      char p2=sc.next().charAt(0);
      if(p1=='R' && p2=='S'){
      count1++;
     }
      else if(p1=='S'&&p2=='P'){
      count1++;
     }
      else if(p1=='P'&&p2=='S'){
      count2++;
      }
      else if(p1=='S'&&p2=='R'){
          
      count2++;
      }
      else if(p1=='R'&&p2=='P'){
      count2++;
      }
      else if(p1=='P'&&p2=='R'){
      count1++;
      }
      
      else{
          System.out.println("Invalid");
      }}
      if(count1>count2){
          System.out.println("p1 is win");
      }
          else if(count1<count2){
              System.out.println("p2 is win");
          }
          else{
              System.out.println("Tie");
          }
      }
    
}
