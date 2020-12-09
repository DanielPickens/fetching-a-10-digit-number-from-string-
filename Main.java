Import java.util.Scanner;
  public class TelNumCorrection{

  public static void main(String[]args){

    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a 10 digit number");
    String num=scan.nextLine();

    String a=num.substring(0,3);
    String b=num.substring(3,6);
    String c=num.substring(6);
    System.out.println("("+a+ ")"+b+"-"+c);
  }
}

Output:4087859962
