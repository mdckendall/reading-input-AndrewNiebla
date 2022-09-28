import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   System.out.println("Enter a word:");
   Scanner myScan = new Scanner(System.in);
    String str = myScan.nextLine();  
    System.out.println(str.length());
    //Your code will return the length of the entered String
  }
}
