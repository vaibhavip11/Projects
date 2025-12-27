import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a value: ");
      char p1=sc.next().charAt(0);
      char p2=sc.next().charAt(0);
      if(p1=='R' && p2=='S'){
      System.out.println("p1 is wins");}
      else if(p1=='S'&&p2=='P'){
      System.out.println("p1 is wins");}
      else if(p1=='P'&&p2=='S'){
      System.out.println("p2 is wins");}
      else if(p1=='S'&&p2=='R'){
      System.out.println("p2 is wins");}
      else if(p1=='R'&&p2=='P'){
      System.out.println("p2 is wins");}
      else if(p1=='P'&&p2=='R'){
      System.out.println("p1 is wins");}
      else if(p1==p2){
      System.out.println("Tie");}
      else{
          System.out.println("Invalid");
      }
    }
}
